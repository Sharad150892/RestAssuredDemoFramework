package studentAPITest;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import apiConfigs.APIPath;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetAPITests extends BaseTest {

	@Test
	public void getAPITests() {

//		RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS).then().log().all().statusCode(200);
		test.log(Status.INFO, "My test is Starting......");

		Response response = RestAssured.given().when().get(APIPath.apiPath.GET_LIST_OF_POSTS);

		APIVerification.responseCodeValidation(response, 200);
		APIVerification.responseKeyValidationFromArray(response, "title");
		APIVerification.responseTimeValidation(response);
		

		test.log(Status.INFO, "My test is ended....");

	}

}
