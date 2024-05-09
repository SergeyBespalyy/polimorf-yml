package sergey.be.pet.domain

data class Truck(
    override val type: String,
    override val weight: Int,
    override val capacity: Int,
    val typeCargo: String,
    val fuel: String,
    val liftingCapacity: Int,
) : Vehicle