package com.spacexdata.main;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.spacexdata.utils.*;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertNotNull;

import java.util.Properties;

public class TestGetCall {
	static String url="";
	@BeforeTest
	public void setup() {
		ProteryFile prop = new ProteryFile();
		url="https://api.spacexdata.com/v3/launches/past?"+
	"start="+prop.get("start")+"&end="+prop.get("end");
		System.out.println(url);
		
//	}
}
	@Test(testName = "gettest")
	public void run() {
		String s=given().when().get(url)
		.then().extract().response().asString();
		System.out.println(s);
		
		//one Approach is to map the response to the pojo classes and directly get the values
		//associated with the respective json object and fetch the required values from the response
		
		//second approach is to traverse to the jsonpath (eg:-first_stage.cores[0].core_serial) 
		//and an if condition to check for the true or flase and again get the values needed with
		//the same approach
	}

}
