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
                , "https://mooven-mock.herokuapp.com/bodyworks/sedan/sedan-car-model@3x.png"))
        list.add(CarBodywork(list.size + 1L, "Hatch"
                , "https://mooven-mock.herokuapp.com/bodyworks/hatch/car-of-hatchback-model@3x.png"))
        list.add(CarBodywork(list.size + 1L, "SUV"
                , "https://mooven-mock.herokuapp.com/bodyworks/suv/jeep@3x.png"))
        list.add(CarBodywork(list.size + 1L, "Perua/SW"
                , "https://mooven-mock.herokuapp.com/bodyworks/perua/minivan-car@3x.png"))
        list.add(CarBodywork(list.size + 1L, "Picape"
                , "https://mooven-mock.herokuapp.com/bodyworks/picape/pick-up@3x.png"))
        list.add(CarBodywork(list.size + 1L, "Cupê"
                , "https://mooven-mock.herokuapp.com/bodyworks/cupe/sportive-car@3x.png"))

        return list
    }
}