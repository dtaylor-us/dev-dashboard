package us.dtaylor.gh

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Test

@QuarkusTest
class ResourceTest {

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/C:/Users/m04370/AppData/Local/Programs/Git/gh")
          .then()
             .statusCode(200)
             .body(`is`("Hello RESTEasy"))
    }

}