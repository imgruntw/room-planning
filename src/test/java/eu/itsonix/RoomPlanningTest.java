package eu.itsonix;

import io.quarkus.test.junit.QuarkusTest;

import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class RoomPlanningTest {

	@Test
	public void testHelloEndpoint() {
		given()
				.when().get("/room/enter")
				.then()
				.statusCode(200);
	}
}
