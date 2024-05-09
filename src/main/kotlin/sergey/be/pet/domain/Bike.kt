package sergey.be.pet.domain

data class Bike(
    override val type: String,
    override val weight: Int,
    override val capacity: Int,
    val numberOfWheels: Int
) : Vehicle