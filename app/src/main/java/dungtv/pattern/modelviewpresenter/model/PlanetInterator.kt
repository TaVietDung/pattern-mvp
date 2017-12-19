package dungtv.pattern.modelviewpresenter.model

import dungtv.pattern.modelviewpresenter.model.entity.Planet


class PlanetInterator(private val listener: LoadPlanetListener) {
    fun createData() {
        val mList = (0 until 20).map { Planet("Planet $it") }
        listener.onLoadPlanetSuccess(mList)
    }
}