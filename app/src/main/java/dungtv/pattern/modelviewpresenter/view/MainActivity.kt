package dungtv.pattern.modelviewpresenter.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import dungtv.pattern.modelviewpresenter.R
import dungtv.pattern.modelviewpresenter.model.entity.Planet
import dungtv.pattern.modelviewpresenter.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_planet.view.*


class MainActivity : AppCompatActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainPresenter = MainPresenter(this)
        mainPresenter.loadData()
    }

    override fun displayPlanets(list: List<Planet>) {
        rvPlanets.hasFixedSize()
        rvPlanets.layoutManager = LinearLayoutManager(this)
        rvPlanets.adapter = PlanetAdapter(list)
    }

    inner class PlanetAdapter(private val list: List<Planet>) : RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PlanetViewHolder {
            val view = LayoutInflater.from(parent?.context).inflate(R.layout.item_planet, parent, false)
            return PlanetViewHolder(view)
        }

        override fun onBindViewHolder(holder: PlanetViewHolder?, position: Int) {
            holder?.bindData(list[position].name)
        }

        override fun getItemCount(): Int = list.size

        inner class PlanetViewHolder(private val item: View) : RecyclerView.ViewHolder(item) {
            fun bindData(name: String) {
                item.tvNamePlanet.text = name
            }
        }

    }
}
