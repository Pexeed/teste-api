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
                , "https://movida-premium-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png"))
        list.add(CarBrand(list.size + 1L, "Audi"
                , "https://movida-premium-mock.herokuapp.com/brands/Audi/Audi@3x.png"))
        list.add(CarBrand(list.size + 1L, "BMW"
                , "https://movida-premium-mock.herokuapp.com/brands/BMW/BMW@3x.png"))
        list.add(CarBrand(list.size + 1L, "Honda"
                , "https://movida-premium-mock.herokuapp.com/brands/Honda/Honda@3x.png"))
        list.add(CarBrand(list.size + 1L, "Hyundai"
                , "https://movida-premium-mock.herokuapp.com/brands/Hyundai/Hyundai@3x.png"))
        list.add(CarBrand(list.size + 1L, "Jaguar"
                , "https://movida-premium-mock.herokuapp.com/brands/Jaguar/Jaguar@3x.png"))
        list.add(CarBrand(list.size + 1L, "Jeep"
                , "https://movida-premium-mock.herokuapp.com/brands/Jeep/Jeep@3x.png"))
        list.add(CarBrand(list.size + 1L, "Land-Rover"
                , "https://movida-premium-mock.herokuapp.com/brands/Land-Rover/Land-Rover@3x.png"))
        list.add(CarBrand(list.size + 1L, "Lexus"
                , "https://movida-premium-mock.herokuapp.com/brands/Lexus/Lexus@3x.png"))
        list.add(CarBrand(list.size + 1L, "Mercedes"
                , "https://movida-premium-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png"))
        list.add(CarBrand(list.size + 1L, "Subaru"
                , "https://movida-premium-mock.herokuapp.com/brands/Subaru/Subaru@3x.png"))

        return list
    }
}