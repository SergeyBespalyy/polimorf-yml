package sergey.be.pet.domain

data class Car(
    override val type: String,
    override val weight: Int,
    override val capacity: Int,
    val fuel: String
) : Vehicle