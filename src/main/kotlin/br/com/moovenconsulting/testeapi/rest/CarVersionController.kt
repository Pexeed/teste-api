package br.com.moovenconsulting.testeapi.rest

import br.com.moovenconsulting.testeapi.model.CarModel
import br.com.moovenconsulting.testeapi.model.CarVersion
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

        list.add( CarVersion(list.size + 1L,
                "180 Avantgarde",
                "",
                5000.0,
                "https://movida-premium-mock.herokuapp.com/versions/c180-avantgarde/c180-avantgarde@3x.png",
                CarModel.getClasseC()
        ))

        list.add( CarVersion(list.size + 1L,
                "180 Exclusive",
                "",
                5500.0,
                "https://movida-premium-mock.herokuapp.com/versions/c180-exclusive/c180-exclusive@3x.png",
                CarModel.getClasseC()
        ))
        list.add( CarVersion(list.size + 1L,
                "200 EQ Boost",
                "",
                6000.0,
                "https://movida-premium-mock.herokuapp.com/versions/c200-eq/c200-eq@3x.png",
                CarModel.getClasseC()
        ))
        list.add( CarVersion(list.size + 1L,
                "300 Sport",
                "",
                7000.0,
                "https://movida-premium-mock.herokuapp.com/versions/c300-sport/c300-sport@3x.png",
                CarModel.getClasseC()
        ))

        return list
    }
}