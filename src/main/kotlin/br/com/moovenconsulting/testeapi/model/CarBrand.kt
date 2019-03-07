package br.com.moovenconsulting.testeapi.model

data class CarBrand (val id: Long, val name: String, val logoUrl: String) {
    companion object {
        fun getMercedes(): CarBrand {
            return CarBrand(1L,
                    "Mercedes",
                    "https://localhost:8881/brands/Mercedes/Mercedes@3x.png")
        }
    }
}