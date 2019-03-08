package br.com.moovenconsulting.testeapi.rest

import br.com.moovenconsulting.testeapi.model.CarBodywork
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CarBodyworkController {

    @GetMapping("/bodyworks")
    fun getBodyworks(): List<CarBodywork> {
        val list = ArrayList<CarBodywork>()

        list.add( CarBodywork(list.size + 1L, "Hatch"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/hatch/car-of-hatchback-model@3x.png"))
        list.add( CarBodywork(list.size + 1L, "SUV"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/suv/jeep@3x.png"))
        list.add( CarBodywork(list.size + 1L, "Perua/SW"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/perua/minivan-car@3x.png"))
        list.add( CarBodywork(list.size + 1L, "Picape"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/picape/pick-up@3x.png"))
        list.add( CarBodywork(list.size + 1L, "Sedã"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/sedan/sedan-car-model@3x.png"))
        list.add( CarBodywork(list.size + 1L, "Cupê"
                , "https://movida-premium-mock.herokuapp.com/bodyworks/cupe/sportive-car@3x.png"))

        return list
    }
}