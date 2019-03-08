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
                , "https://mooven-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png"))
        list.add(CarBrand(list.size + 1L, "Audi"
                , "https://mooven-mock.herokuapp.com/brands/Audi/Audi@3x.png"))
        list.add(CarBrand(list.size + 1L, "BMW"
                , "https://mooven-mock.herokuapp.com/brands/BMW/BMW@3x.png"))
        list.add(CarBrand(list.size + 1L, "Honda"
                , "https://mooven-mock.herokuapp.com/brands/Honda/Honda@3x.png"))
        list.add(CarBrand(list.size + 1L, "Hyundai"
                , "https://mooven-mock.herokuapp.com/brands/Hyundai/Hyundai@3x.png"))
        list.add(CarBrand(list.size + 1L, "Jaguar"
                , "https://mooven-mock.herokuapp.com/brands/Jaguar/Jaguar@3x.png"))
        list.add(CarBrand(list.size + 1L, "Jeep"
                , "https://mooven-mock.herokuapp.com/brands/Jeep/Jeep@3x.png"))
        list.add(CarBrand(list.size + 1L, "Land-Rover"
                , "https://mooven-mock.herokuapp.com/brands/Land-Rover/Land-Rover@3x.png"))
        list.add(CarBrand(list.size + 1L, "Lexus"
                , "https://mooven-mock.herokuapp.com/brands/Lexus/Lexus@3x.png"))
        list.add(CarBrand(list.size + 1L, "Mercedes"
                , "https://mooven-mock.herokuapp.com/brands/Mercedes/Mercedes@3x.png"))
        list.add(CarBrand(list.size + 1L, "Subaru"
                , "https://mooven-mock.herokuapp.com/brands/Subaru/Subaru@3x.png"))

        return list
    }
}