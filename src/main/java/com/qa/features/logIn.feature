Feature: CVS LogIn feature
Scenario: CVS LogIn test scenario

Given User opens Browser
Then User is already on Home page
When title of Home page

Then user logs into the app
Then user is successfully logged in
Then close the browser

Scenario Outline: CVS LogIn using Top Panel LogIn scenario

Given User opens the browser
When User is at the home page
Then User click on Top panel signin link and enters "<username>" and "<password>"
Then user close the browser

Examples:
| username| password|
| abdurrahman@gmail.com| hhb12345| 
| wrongemail@yahoo.com| wrongp@ssword| 

Scenario: CVS signin test scenario using Gherkin language

Given User opens cvs in browser
When title of  signin page
Then user click on signin link and user enters "abdurrahman@gmail.com" and "hhb12345"
Then close the browser for this scenario