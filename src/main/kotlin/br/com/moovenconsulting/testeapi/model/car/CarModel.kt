package br.com.moovenconsulting.testeapi.model.car

data class CarModel (val id: Long, val name: String, val carBrand: CarBrand, val carBodywork: CarBodywork) {
    companion object {
        fun getClasseC(): CarModel {
            return CarModel(
                    1L,
                    "Classe C",
                    CarBrand.getMercedes(),
                    CarBodywork.getSedan())
        }
    }
}