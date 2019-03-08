package br.com.moovenconsulting.testeapi.model.car

data class CarBodywork (val id: Long, val name: String, val imageUrl: String) {
    companion object {
        fun getSedan(): CarBodywork {
            return CarBodywork(
                    1L,
                    "Sedã",
                    "https://mooven-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png")
        }
    }
}