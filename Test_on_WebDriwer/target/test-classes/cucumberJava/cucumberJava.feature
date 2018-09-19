Feature: CucumberJava

Scenario: Login functionality exists
Given I have open the browser
When I open i.ua website
Then Login button should exits

Scenario: Check of weather text
Given I have open the browser
When I open i.ua website
Then I click on weather picture
Then I see Weather write on the page

Scenario: Log in in i.ua
Given I have open the browser
When I open i.ua website
Then I make login
Then I see my personal profile page

Scenario: Send massage
Given I have open the browser
When I open i.ua website
Then I make login
Then I send letter
Then I see succesfull message
Then I click on letter
Then I getcheck 1 new letter

