package br.com.moovenconsulting.testeapi.error.exceptions

class ResourceNotFoundException(message: String) : Exception(message) {

    companion object {
        const val serialVersionUID = 1L
    }
}