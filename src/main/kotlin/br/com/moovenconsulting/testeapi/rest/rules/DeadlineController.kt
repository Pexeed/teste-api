package br.com.moovenconsulting.testeapi.rest.rules

import br.com.moovenconsulting.testeapi.model.rules.Deadline
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class DeadlineController {

    @GetMapping("/deadlines", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getDeadlines(): List<Deadline> {
        val list = ArrayList<Deadline>()

        list.add(Deadline(list.size + 1L, 18))
        list.add(Deadline(list.size + 1L, 24))
        list.add(Deadline(list.size + 1L, 36))

        return list
    }
}