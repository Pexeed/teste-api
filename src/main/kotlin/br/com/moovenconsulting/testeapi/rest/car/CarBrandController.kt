package br.com.moovenconsulting.testeapi.rest.car

import br.com.moovenconsulting.testeapi.model.car.CarBrand
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CarBrandController {

    @GetMapping("/carBrands", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getBrands(): List<CarBrand> {
        val list = ArrayList<CarBrand>()

        list.add(CarBrand(list.size + 1L, "Mercedes"
                , "{" +
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
                "]}"))

        list.add(CarBrand(list.size + 1L, "Audi"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/audi-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/audi-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/audi-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/audi-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/audi-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/audi-grayscale@3x.png\"}" +
                "]}"))
        list.add(CarBrand(list.size + 1L, "BMW"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/bmw-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/bmw-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/bmw-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/bmw-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/bmw-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/bmw-grayscale@3x.png\"}" +
                "]}"))
        list.add(CarBrand(list.size + 1L, "Jeep"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/jeep-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/jeep-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/jeep-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/jeep-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/jeep-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/jeep-grayscale@3x.png\"}" +
                "]}"))
        list.add(CarBrand(list.size + 1L, "Mitsubishi"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/mitsubishi-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/mitsubishi-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/mitsubishi-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/mitsubishi-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/mitsubishi-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/mitsubishi-grayscale@3x.png\"}" +
                "]}"))
        list.add(CarBrand(list.size + 1L, "Chevrolet"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/chevrolet-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/chevrolet-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/chevrolet-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/chevrolet-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/chevrolet-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/chevrolet-grayscale@3x.png\"}" +
                "]}"))
        list.add(CarBrand(list.size + 1L, "Volkswagen"
                , "{" +
                "\"color\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/volkswagen-color.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/volkswagen-color@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/volkswagen-color@3x.png\"}" +
                "]," +
                "\"grayscale\":" +
                "[" +
                "{\"size\": \"1x\",\"url\": \"/assets/images/brand/volkswagen-grayscale.png\"}," +
                "{\"size\": \"2x\",\"url\": \"/assets/images/brand/volkswagen-grayscale@2x.png\"}," +
                "{\"size\": \"3x\",\"url\": \"/assets/images/brand/volkswagen-grayscale@3x.png\"}" +
                "]}"))

        return list
    }
}