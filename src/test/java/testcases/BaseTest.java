package testcases;

import org.junit.BeforeClass;

import io.restassured.RestAssured;

public class BaseTest {


//Configuring the block under the Before Class Section so that it should be accessible to all the test cases	
	@BeforeClass
	public static void init() {
		
		RestAssured.baseURI="http://localhost:9080"; //API End Point Base URI
		RestAssured.basePath="/studentmgmt";    //API End Point Base Path
		
	}
	
}