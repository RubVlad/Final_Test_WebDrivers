$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/cucumberJava/ApiTest.feature");
formatter.feature({
  "name": "ApiCucumberJava",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check status code after login",
  "description": "",
  "keyword": "Scenario"
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
  "error_message": "java.lang.AssertionError: expected:\u003c200\u003e but was:\u003c302\u003e\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat org.junit.Assert.failNotEquals(Assert.java:834)\r\n\tat org.junit.Assert.assertEquals(Assert.java:645)\r\n\tat org.junit.Assert.assertEquals(Assert.java:631)\r\n\tat cucumberJava.cucumberJava.getresponse_from_server(cucumberJava.java:51)\r\n\tat ✽.I check statuscode(src/test/resources/cucumberJava/ApiTest.feature:6)\r\n",
  "status": "failed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "uuuu",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I make loginapi",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.make_login()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "ahtung",
  "description": "",
  "keyword": "Scenario"
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
  "name": "I make loginmistakeapi",
  "keyword": "Then "
});
formatter.match({
  "location": "cucumberJava.make_login_mistake()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/cucumberJava/cucumberJava.feature");
formatter.feature({
  "name": "CucumberJava",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login functionality exists",
  "description": "",
  "keyword": "Scenario"
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
