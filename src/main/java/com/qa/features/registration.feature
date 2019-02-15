Feature: User register for cvs account

Scenario Outline: CVS Registration test scenario

Given User is already on Home page for registration
When user is already on homepage
Then user clicks on create an account link for registration and verifies title of the registration page
Then user enters in first step of registration "<firstName>" and "<lastName>" and "<emailAddress>" and "<password>" and "<confirmPassword>" and "<name>"
Then user clicks on continue button
Then user enter "<streetAddress>" and "<city>" and "<State>" and "<zipCode>" and "<phoneNumber>" and "<Month>" and "<Day>" and "<Year>"
Then user select gender from drop down menu
Then user click create account button to complete registration
Then close the registration browser



Examples: 
| firstName| lastName| emailAddress| password| confirmPassword|  name|streetAddress| city| State| zipCode| phoneNumber| Month| Day| Year|
|Vichi|Leonard|sammy@korio.com|hhb12345|hhb12345| Krish|123 anywhere|Anycity| NJ|07035|1234569632|01|29|1985|
|Jose|Aan|bryan@korio.com|hhb12345|hhb12345|Momo|1666 anywhere|Anycity| MI|48212|1239856632|02|21|1995|
|John|Smith|hendrik@korio.com|hhb12345|hhb12345| Krish|123 anywhere|Anycity| NJ|07035|1234569632|01|29|1985|
|Jony|islam|adnan@korio.com|hhb12345|hhb12345|Momo|1666 anywhere|Anycity| MI|48212|1239856632|02|21|1995|
|Adiie|Adnan|safwan@korio.com|hhb12345|hhb12345| Krish|123 anywhere|Anycity| NJ|07035|1234569632|01|29|1985|
|Nishat|Aryan|peter@korio.com|hhb12345|hhb12345|Momo|1666 anywhere|Anycity| MI|48212|1239856632|02|21|1995|
|Brayn|Smith|googly@korio.com|hhb12345|hhb12345| Krish|123 anywhere|Anycity| NJ|07035|1234569632|01|29|1985|
|Ivvan|Iftekhar|ivaanbhai@korio.com|hhb12345|hhb12345|Momo|1666 anywhere|Anycity| MI|48212|1239856632|02|21|1995|
