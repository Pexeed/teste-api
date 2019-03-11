package br.com.moovenconsulting.testeapi.rest.rules

import br.com.moovenconsulting.testeapi.model.rules.State
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class StateController {

    @GetMapping("/states", produces = [MediaType.APPLICATION_JSON_VALUE] )
    @ResponseStatus(HttpStatus.OK)
    fun getMileages(): List<State> {
        return State.getStates()
    }
}