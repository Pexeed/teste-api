package br.com.moovenconsulting.testeapi.model.car

data class CarBrand (val id: Long, val name: String, val logoUrl: String) {
    companion object {
        fun getMercedes(): CarBrand {
            return CarBrand(1L,
                    "Mercedes",
                    "{" +
                    "\"color\":" +
                    "[" +
                    "{\"size\": \"1x\",\"url\": \"/assets/images/brand/mercedes-color.png\"}," +
                    "{\"size\": \"2x\",\"url\": \"/assets/images/brand/mercedes-color@2x.png\"}," +
                    "{\"size\": \"3x\",\"url\": \"/assets/images/brand/mercedes-color@3x.png\"}" +
                    "]," +
                    "\"grayscale\":" +
                    "[" +
                    "{\"size\": \"1x\",\"url\": \"/assets/images/brand/mercedes-grayscale.png\"}," +
                    "{\"size\": \"2x\",\"url\": \"/assets/images/brand/mercedes-grayscale@2x.png\"}," +
                    "{\"size\": \"3x\",\"url\": \"/assets/images/brand/mercedes-grayscale@3x.png\"}" +
                    "]}")
        }
    }
}