package br.com.moovenconsulting.testeapi.model.car

data class CarVersion (val id: Long, val name: String, val information: String, val shieldable: Boolean , val totalPrice: Double,
                       val totalPriceShielded: Double, val monthlyBudget: Double, val monthlyBudgetShielded: Double, val imageUrl: String, val carModel: CarModel)