package br.com.moovenconsulting.testeapi.rest

import br.com.moovenconsulting.testeapi.model.CarBrand
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CarBrandController {

    @GetMapping("/carBrands")
    fun getBrands(): List<CarBrand> {
        val list = ArrayList<CarBrand>()

        list.add( CarBrand(list.size + 1L, "Mercedes"
                , "https://localhost:8881/brands/Mercedes/Mercedes@3x.png"))
        list.add( CarBrand(list.size + 1L, "Audi"
                , "https://localhost:8881/brands/Audi/Audi@3x.png"))
        list.add( CarBrand(list.size + 1L, "BMW"
                , "https://localhost:8881/brands/BMW/BMW@3x.png"))
        list.add( CarBrand(list.size + 1L, "Honda"
                , "https://localhost:8881/brands/Honda/Honda@3x.png"))
        list.add( CarBrand(list.size + 1L, "Hyundai"
                , "https://localhost:8881/brands/Hyundai/Hyundai@3x.png"))
        list.add( CarBrand(list.size + 1L, "Jaguar"
                , "https://localhost:8881/brands/Jaguar/Jaguar@3x.png"))
        list.add( CarBrand(list.size + 1L, "Jeep"
                , "https://localhost:8881/brands/Jeep/Jeep@3x.png"))
        list.add( CarBrand(list.size + 1L, "Land-Rover"
                , "https://localhost:8881/brands/Land-Rover/Land-Rover@3x.png"))
        list.add( CarBrand(list.size + 1L, "Lexus"
                , "https://localhost:8881/brands/Lexus/Lexus@3x.png"))
        list.add( CarBrand(list.size + 1L, "Mercedes"
                , "https://localhost:8881/brands/Mercedes/Mercedes@3x.png"))
        list.add( CarBrand(list.size + 1L, "Subaru"
                , "https://localhost:8881/brands/Subaru/Subaru@3x.png"))

        return list
    }
}