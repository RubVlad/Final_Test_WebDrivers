$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumberJava/ApiTest.feature");
formatter.feature({
  "name": "ApiCucumberJava",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "name": "Check status code after login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open i.ua website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.goTo_i_ua()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I check statuscode",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.getresponse_from_server()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c301\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat cucumberJava.cucumberJava.getresponse_from_server(cucumberJava.java:51)\r\n\tat ✽.I check statuscode(src/test/resources/cucumberJava/ApiTest.feature:7)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I log in into iua",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "i log in into iua with uncorrect password",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "Send GET request to whether ua",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/cucumberJava/cucumberJava.feature");
formatter.feature({
  "name": "CucumberJava",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.scenario({
  "name": "Login functionality exists",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open i.ua website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.goTo_i_ua()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login button should exits",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests_login.check()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Check of weather text",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open i.ua website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.goTo_i_ua()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on weather picture",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_weather.click_on_pict()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see Weather write on the page",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_weather.see_weather_write()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Log in in i.ua",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open i.ua website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.goTo_i_ua()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make login",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests_login.make_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see my personal profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests_login.check_profile()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Send massage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@all"
    }
  ]
});
formatter.step({
  "name": "I have open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "cucumberJava.openBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open i.ua website",
  "keyword": "When "
});
formatter.match({
  "location": "cucumberJava.goTo_i_ua()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I make login",
  "keyword": "Then "
});
formatter.match({
  "location": "Tests_login.make_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I send letter",
  "keyword": "Then "
});
formatter.match({
  "location": "TestsCreate_message.send_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I see succesfull message",
  "keyword": "Then "
});
formatter.match({
  "location": "TestsCreate_message.succesful_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on letter",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_letter.clic_on_letter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I getcheck 1 new letter",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_letter.check_letter()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});