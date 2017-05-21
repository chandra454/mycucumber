
	Feature: Title of your feature
	Scenario: Test Login with valid credentials
		Given Open Firefox  and start application
		When I enter valid "chandhu454" and "Chandhu__4455"
		Then user should able to login successfully
	
	Scenario: Test Login page
	Given i enter "Userid"
  And I enter "Pwd"
  When i click on login
  Then verify i am on login page	