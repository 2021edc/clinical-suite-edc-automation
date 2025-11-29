Feature: Forgot Password

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"

  @smoke
  Scenario: Verify that forgot password link should be displayed
    Then Verify that Forgot password link should be displayed

  @smoke
  Scenario: Verify that Forgot Password page should be opened
    When user click on forgot password link
    Then Verify that "Forgot Password?" page should be opened

  @regression
  Scenario: Verify that validation message should be displayed if email format is incorrect
    When user click on forgot password link
    And user enter the "<email>" in email address textbox for forgot password
    And user click on reset button
    Then Verify that "Please enter a valid email address" error message should be displayed for incorrect email

    Examples:
      | email       |
      | adadadasd   |
      | ggadgaghjd@ |
      
  @regression
  Scenario: Verify that "Please enter your email address" validation message should be displayed if email format is incorrect
    When user click on forgot password link
    And user enter the "<email>" in email address textbox for forgot password
    And user click on reset button
    Then Verify that "Please enter your email address" error message should be displayed for incorrect email

    Examples:
      | email       |
      |             |

  @smoke
  Scenario: Verify that Login page should be opened after clicking on login button
    When user click on forgot password link
    And user click on login button from forgot password page
    Then verify that "Log In" header should be visible
    
  @smoke
  Scenario: Verify that user should be able to do the reset password
  	When user click on forgot password link
  	And user enter the "<email>" in email address textbox for forgot password
    And user click on reset button
    Then verify that success toast should be displayed 
    
    Examples:
	| email                               |
	| shreyansh.shah@primeservicescro.com |
