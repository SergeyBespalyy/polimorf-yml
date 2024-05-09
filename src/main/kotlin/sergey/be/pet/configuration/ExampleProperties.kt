package sergey.be.pet.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConstructorBinding
import sergey.be.pet.domain.Vehicle

@ConfigurationProperties("parameters")
@ConstructorBinding
class ExampleProperties(
    val vehicles: List<Vehicle>
)