package testcases;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Title;
import steps.APISteps;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SerenityRunner.class)
public class APITests extends BaseTest {

	@Steps
	APISteps api;

	@Title("Add First Student Data")
	@Test
	public void test1PostRequest() {

		api.sendPOSTRequest("22345", "James", "Nos", "3A", "Singapore");
		api.validateStatusCodeToBe(200);

	}

	@Title("Add Second Student Data")
	@Test()
	public void test2PostRequest() {

		api.sendPOSTRequest("22346", "Gary", "Lim", "3B", "Japan");
		api.validateStatusCodeToBe(200);

	}

	@Title("Update the Lastname from Student Data")
	@Test()
	public void test3PutRequest() {

		api.sendPUTRequest("22345", "James", "Kos", "3A", "Singapore");
		api.validateStatusCodeToBe(200);
		api.verifyResponseBody("lastName", "Kos");
	}

	@Title("Fetch All the Students Data")
	@Test()
	public void test4GetRequestAll() {

		api.sendGetRequestForAllStudents();
		api.validateStatusCodeToBe(200);
		api.verifyResponseBodySize(2);

	}

	@Title("Fetch Students Data based on Student Id")
	@Test()
	public void test5GetRequestStudentID() {

		api.sendGetRequestForStudentId("22345");
		api.validateStatusCodeToBe(200);
		api.verifyResponseBodySize(1);

	}

	@Title("Fetch Students Data based on Student Class")
	@Test()
	public void test6GetRequestStudentClass() {

		api.sendGetRequestForStudentClass("3B");
		api.validateStatusCodeToBe(200);
		api.verifyResponseBodySize(1);

	}

	@Title("Fetch Students Data based on Student Id and Student Class")
	@Test()
	public void test7GetRequestStudentIdStudentClass() {

		api.sendGetRequestForStudentIdStudentClass("22346", "3B");
		api.validateStatusCodeToBe(200);
		api.verifyResponseBodySize(1);

	}

	@Title("Delete existing 1st student based on Student Id")
	@Test()
	public void test8DeleteRequestFirst() {

		api.sendDeleteRequestForStudent("22345");
		api.validateStatusCodeToBe(200);
		api.sendGetRequestForAllStudents();
		api.verifyResponseBodySize(1);

	}

	@Title("Delete existing 2nd student based on Student Id")
	@Test()
	public void test9DeleteRequestSecond() {

		api.sendDeleteRequestForStudent("22346");
		api.validateStatusCodeToBe(200);
		api.sendGetRequestForAllStudents();
		api.verifyResponseBodySize(0);

	}
}
