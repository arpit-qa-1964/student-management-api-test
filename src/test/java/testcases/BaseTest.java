package testcases;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class BaseTest {

	
	@BeforeClass
	public static void init() {
		
		RestAssured.baseURI="http://localhost:9080";
		RestAssured.basePath="/studentmgmt";
		
	}
	
}
