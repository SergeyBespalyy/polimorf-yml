package sergey.be.pet.domain

data class Bus(
    override val type: String,
    override val weight: Int,
    override val capacity: Int,
    val fuel: String,
    val length: Int,
    val floor: Int
) : Vehicle