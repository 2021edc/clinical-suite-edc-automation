Feature: Subject Visit

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" opion from left side menu

  @smoke
  Scenario: Verify that Subject visit page should be opened
    When user click on "MS1-811" to open the subject visit page
    Then verify that subject visit page should be opened

  @regression
  Scenario: Verify that no match found error message should be displayed if form is not present
    When user click on "MS1-811" to open the subject visit page
    And user enter "sdadasdad" in search textbox
    Then verify that "No forms found matching" message should be displayed

    Examples:
      | search_term |
      | sdadasdad   |
      |             |

  @regression
  Scenario: Verify that search textbox should be empty after clicking on X icon
    When user click on "MS1-811" to open the subject visit page
    And user enter "sdadasdad" in search textbox
    And user click on X icon
    Then verify that text should be cleared

  @regression
  Scenario: Verify that subject form should be closed after clicking on close button
    When user click on "MS1-811" to open the subject visit page
    And user click on close button
    Then verify that page should be closed

  @smoke
  Scenario: Verify that user should be able to fill the form
    When user click on "MS1-811" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "test textarea" in the textarea
    And user enter the "3424234234324" in number textbox
    And user click on save button to save the form

  @smoke
  Scenario: Verify that System-generated Queries should be displayed
    When user click on "MS1-813" to open the subject visit page
    And user click on save button to save the form
    Then verify that "System-generated Queries" message should be displayed if mandatory fields not entered

  @regression
  Scenario: Verify that if number all field is not entered then it should give the query
    When user click on "MS1-813" to open the subject visit page
    And user click on save button to save the form
    Then verify that number all field query should be given

  @smoke
  Scenario: Verify that query description should be displayed for the number mandatory
    When user click on "MS1-813" to open the subject visit page
    And user click on save button to save the form
    Then verify that "Number All" query description should be displayed

  @smoke
  Scenario: Verify that user is not able to enter the alphabets in number field
    When user click on "MS1-813" to open the subject visit page
    And user enter the "eeee" in Number all textbox
    Then verify that alphabets should not be entered
