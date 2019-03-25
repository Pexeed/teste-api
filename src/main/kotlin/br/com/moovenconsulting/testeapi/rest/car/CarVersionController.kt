package br.com.moovenconsulting.testeapi.rest.car

import br.com.moovenconsulting.testeapi.model.car.CarModel
import br.com.moovenconsulting.testeapi.model.car.CarVersion
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CarVersionController {

    @GetMapping("/carVersions", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getCarVersions(): List<CarVersion> {
        val list = ArrayList<CarVersion>()

        list.add(CarVersion(list.size + 1L,
                "180 Avantgarde",
                "",
                5000.0,
                "[" +
                        "{size: \"1x\",url: \"/assets/images/cars/c180-avantgarde.png\"}," +
                        "{size: \"2x\",url: \"/assets/images/cars/c180-avantgarde@2x.png\"}," +
                        "{size: \"3x\",url: \"/assets/images/cars/c180-avantgarde@3x.png\"}" +
                        "]",
                CarModel.getClasseC()
        ))

        list.add(CarVersion(list.size + 1L,
                "180 Exclusive",
                "",
                5500.0,
                "[" +
                        "{size: \"1x\",url: \"/assets/images/cars/c180-exclusive.png\"}," +
                        "{size: \"2x\",url: \"/assets/images/cars/c180-exclusive@2x.png\"}," +
                        "{size: \"3x\",url: \"/assets/images/cars/c180-exclusive@3x.png\"}" +
                        "]",
                CarModel.getClasseC()
        ))
        list.add(CarVersion(list.size + 1L,
                "200 EQ Boost",
                "",
                6000.0,
                "[" +
                        "{size: \"1x\",url: \"/assets/images/cars/c200-eq.png\"}," +
                        "{size: \"2x\",url: \"/assets/images/cars/c200-eq@2x.png\"}," +
                        "{size: \"3x\",url: \"/assets/images/cars/c200-eq@3x.png\"}" +
                        "]",
                CarModel.getClasseC()
        ))
        list.add(CarVersion(list.size + 1L,
                "300 Sport",
                "",
                7000.0,
                "[" +
                        "{size: \"1x\",url: \"/assets/images/cars/c300-sport.png\"}," +
                        "{size: \"2x\",url: \"/assets/images/cars/c300-sport@2x.png\"}," +
                        "{size: \"3x\",url: \"/assets/images/cars/c300-sport@3x.png\"}" +
                        "]",
                CarModel.getClasseC()
        ))

        return list
    }
}