package br.com.moovenconsulting.testeapi.error

import br.com.moovenconsulting.testeapi.error.exceptions.ResourceNotFoundException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import java.util.*
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity



@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException::class)
    fun resourceNotFoundException(ex: ResourceNotFoundException, request: WebRequest): ResponseEntity<Any> {
        val errorDetails = ErrorDetails(Date(), ex.localizedMessage, request.getDescription(false))
        return ResponseEntity(errorDetails, HttpStatus.NOT_FOUND)
    }

    @ExceptionHandler(Exception::class)
    fun globalExceptionHandler(ex: Exception, request: WebRequest): ResponseEntity<*> {
        val errorDetails = ErrorDetails(Date(), ex.localizedMessage, request.getDescription(false))
        return ResponseEntity(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR)
    }
}