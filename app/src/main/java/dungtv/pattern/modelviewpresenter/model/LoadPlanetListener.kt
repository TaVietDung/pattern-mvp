package dungtv.pattern.modelviewpresenter.model

import dungtv.pattern.modelviewpresenter.model.entity.Planet


interface LoadPlanetListener {
    fun onLoadPlanetSuccess(list: List<Planet>)
    fun onLoadPlanetFailure(message: String)
}