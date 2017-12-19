package dungtv.pattern.modelviewpresenter.presenter

import dungtv.pattern.modelviewpresenter.model.LoadPlanetListener
import dungtv.pattern.modelviewpresenter.model.PlanetInterator
import dungtv.pattern.modelviewpresenter.model.entity.Planet
import dungtv.pattern.modelviewpresenter.view.MainView


class MainPresenter(private val mainView: MainView) : LoadPlanetListener {
    private val planetInterator: PlanetInterator = PlanetInterator(this)

    fun loadData() {
        planetInterator.createData()
    }

    override fun onLoadPlanetSuccess(list: List<Planet>) {
        mainView.displayPlanets(list)
    }

    override fun onLoadPlanetFailure(message: String) {
    }
}