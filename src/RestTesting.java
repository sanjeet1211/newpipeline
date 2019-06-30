import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * 
 */

/**
 * @author sanjeet
 *
 */
public class RestTesting {

	/**
	 * @param args
	 */
	
		
	@Test
public void getUserData() {
   Response resp=RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q="+"Newyork"+","+"usa"+"&appid=b6907d289e10d714a6e88b30761fae22");
   System.out.println("response data"+resp.getStatusCode());
   
   RequestSpecification requestSpecification=RestAssured.given();
   requestSpecification.header("content-type","application/json");
JSONObject jsonobj=new JSONObject();
}
}