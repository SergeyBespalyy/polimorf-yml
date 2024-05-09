package sergey.be.pet

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import sergey.be.pet.configuration.ExampleProperties

@SpringBootApplication
@EnableConfigurationProperties(
    ExampleProperties::class
)
class PetApplication

fun main(args: Array<String>) {
    runApplication<PetApplication>(*args)
}
