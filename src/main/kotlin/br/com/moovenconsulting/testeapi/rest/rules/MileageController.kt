package br.com.moovenconsulting.testeapi.rest.rules

import br.com.moovenconsulting.testeapi.model.rules.Mileage
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class MileageController {

    @GetMapping("/mileages", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getMileages(): List<Mileage> {
        val list = ArrayList<Mileage>()

        list.add(Mileage(list.size + 1L, 1000))
        list.add(Mileage(list.size + 1L, 2000))
        list.add(Mileage(list.size + 1L, 3000))

        return list
    }
}