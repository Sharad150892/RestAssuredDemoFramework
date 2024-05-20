package studentAPITest;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import apiBuilders.PostAPIBuilder;
import apiConfigs.APIPath;
import apiConfigs.HeaderConfigs;
import apiVerifications.APIVerification;
import baseTest.BaseTest;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import utils.JavaUtils;

public class PostAPITest extends BaseTest{
	
	@Test
	public void validPostAPITest() {
		
		test.log(Status.INFO, "My test is Starting......");
		
		HeaderConfigs header = new HeaderConfigs();
		
		PostAPIBuilder builder = new PostAPIBuilder();
		
		//To generate Random integer value
		Random random = new Random();
		int randomNumber = random.nextInt(100);
		String id = Integer.toString(randomNumber);
		
		//Random String value
		String randomString = RandomStringUtils.randomAlphabetic(5);
		
		System.out.println("Random Number "+ id + " Random String Value "+randomString);
		
		
		Response response = RestAssured.given().when().headers(header.defaultHeaders())
							.body(builder.postRequestBody(JavaUtils.randomNumber(),JavaUtils.randomString(),JavaUtils.randomString()))
							.when().post(APIPath.apiPath.CREATE_POST);
		
		APIVerification.responseCodeValidation(response,201);
		APIVerification.responseTimeValidation(response);
		APIVerification.responseKeyValidationFromJsonObject(response, "title");
		
		test.log(Status.INFO, "My test is ended....");
		
	}

}
