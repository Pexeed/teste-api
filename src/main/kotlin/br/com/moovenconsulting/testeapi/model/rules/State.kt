package br.com.moovenconsulting.testeapi.model.rules

class State (val id: Long, val name: String, val uf: String) {
    companion object {
        fun getStates(): List<State> {
            val list = ArrayList<State>()

            list.add(State(list.size + 1L, "Acre", "AC"))
            list.add(State(list.size + 1L, "Alagoas", "AL"))
            list.add(State(list.size + 1L, "Amapá", "AP"))
            list.add(State(list.size + 1L, "Amazonas", "AM"))
            list.add(State(list.size + 1L, "Bahia", "BA"))
            list.add(State(list.size + 1L, "Ceará", "CE"))
            list.add(State(list.size + 1L, "Distrito Federal", "DF"))
            list.add(State(list.size + 1L, "Espírito Santo", "ES"))
            list.add(State(list.size + 1L, "Goiás", "GO"))
            list.add(State(list.size + 1L, "Maranhão", "MA"))
            list.add(State(list.size + 1L, "Mato Grosso", "MT"))
            list.add(State(list.size + 1L, "Mato Grosso do Sul", "MS"))
            list.add(State(list.size + 1L, "Minas Gerais", "MG"))
            list.add(State(list.size + 1L, "Pará", "PA"))
            list.add(State(list.size + 1L, "Paraíba", "PB"))
            list.add(State(list.size + 1L, "Paraná", "PR"))
            list.add(State(list.size + 1L, "Pernambuco", "PE"))
            list.add(State(list.size + 1L, "Piauí", "PI"))
            list.add(State(list.size + 1L, "Rio de Janeiro", "RJ"))
            list.add(State(list.size + 1L, "Rio Grande do Norte", "RN"))
            list.add(State(list.size + 1L, "Rio Grande do Sul", "RS"))
            list.add(State(list.size + 1L, "Rondônia", "RO"))
            list.add(State(list.size + 1L, "Roraima", "RR"))
            list.add(State(list.size + 1L, "Santa Catarina", "SC"))
            list.add(State(list.size + 1L, "São Paulo", "SP"))
            list.add(State(list.size + 1L, "Sergipe", "SE"))
            list.add(State(list.size + 1L, "Tocantins", "TO"))

            return list
        }
    }
}