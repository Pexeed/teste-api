package br.com.moovenconsulting.testeapi.model.car

data class CarBrand (val id: Long, val name: String, val logoUrl: String) {
    companion object {
        fun getMercedes(): CarBrand {
            return CarBrand(1L,
                    "Mercedes",
                    "https://movida-premium-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png")
        }
    }
}