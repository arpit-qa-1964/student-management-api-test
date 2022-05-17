# student-management-api-test
This repository contains the Bullish assignment for Student Management API Automation


### Folders And Files

- src/test/java/steps/APISteps.java: This file contains all the reusable steps/methods needed for our api tests. 
- src/test/java/testcases/APITests.java: This file contains all the test cases combined with api steps needed for our api test execution.
- src/test/java/testcases/BaseTest.java: This file contains the api configuration related information like api endpoint, credentials.  
- target: This folder will be created after the execution completes and index.html file will be generated at the location - site/serenity/index.html.
- pom.xml: It contains the information about the project like name, version, dependencies, description, plugin and other configuration details to build the project.

### Installation And Execution Steps

- Prerequisites : 

(i) Java version 1.8 must be already installed on the machine
(ii) Maven version 3.8.4 must be already installed on the machine

- Execution Steps: 

(i) Clone this repo to a local directory
git clone https://github.com/arpit-qa-1964/student-management-api-test.git

(ii) Open the terminal and cd into the cloned repo or Open project from Eclipse
cd student-management-api-test

(iii) Open the terminal and run the maven command or enter the command in Maven Configuration from Eclipse
mvn clean install verify

(iv) The generated reports can be accessed from the following path inside project directory
target/site/serenity/index.html