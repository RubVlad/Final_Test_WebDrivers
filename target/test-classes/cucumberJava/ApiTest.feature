@all
Feature: ApiCucumberJava

Scenario: Check status code after login
Given I have open the browser
When I open i.ua website
Then I check statuscode

Scenario:
When I log in into iua
When i log in into iua with uncorrect password

Scenario:
When Send GET request to whether ua