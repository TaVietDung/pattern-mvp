package dungtv.pattern.modelviewpresenter.view

import dungtv.pattern.modelviewpresenter.model.entity.Planet


interface MainView {
    fun displayPlanets(list: List<Planet>)
}