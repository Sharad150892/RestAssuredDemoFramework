package functionalTesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostRequestAutomation {
	
	@Test
	public void postApiAutomation() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		String json = "{\r\n"
				+ "    \"name\": \"Sharad\",\r\n"
				+ "    \"job\": \"SDET\"\r\n"
				+ "}";
		RestAssured.given().body(json).post().then().log().all().assertThat().statusCode(201);
		
//		Response response = RestAssured.given().param("", "").when().post()
		
		
	}
	

}
