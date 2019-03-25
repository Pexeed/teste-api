package br.com.moovenconsulting.testeapi.rest.car

import br.com.moovenconsulting.testeapi.model.car.CarBodywork
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class CarBodyworkController {

    @GetMapping("/bodyworks", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getBodyworks(): List<CarBodywork> {
        val list = ArrayList<CarBodywork>()

        list.add(CarBodywork(list.size + 1L, "Sedã"
                , "/assets/images/bodywork/sedan.svg"))
        list.add(CarBodywork(list.size + 1L, "Hatch"
                , "/assets/images/bodywork/hatch.svg"))
        list.add(CarBodywork(list.size + 1L, "SUV"
                , "/assets/images/bodywork/suv.svg"))
        list.add(CarBodywork(list.size + 1L, "Perua/SW"
                , "/assets/images/bodywork/perua-sw.svg"))
        list.add(CarBodywork(list.size + 1L, "Picape"
                , "/assets/images/bodywork/pickup.svg"))
        list.add(CarBodywork(list.size + 1L, "Cupê"
                , "/assets/images/bodywork/cupe.svg"))

        return list
    }
}