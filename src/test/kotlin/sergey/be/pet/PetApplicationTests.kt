package sergey.be.pet

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import sergey.be.pet.configuration.ExampleProperties

@SpringBootTest
class PetApplicationTests {

    @Autowired
    lateinit var exampleProperties: ExampleProperties

    @Test
    fun contextLoads() {
        exampleProperties.vehicles.forEach {vehicle ->
            assertAll(
                { assert(vehicle.type == "car") },
                { assert(vehicle.weight == 1500) },
                { assert(vehicle.capacity == 4) }
            )
        }
    }

}
