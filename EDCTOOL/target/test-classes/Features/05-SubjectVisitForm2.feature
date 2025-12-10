Feature: Subject Visit Form-2

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that form 2 page should be opened
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that Form 2 title should be displayed in header

  @smoke
  Scenario: Verify that user should be able to select the date from date picker
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select today date from dropdown

  @smoke
  Scenario: Verify that  after selecting the unknown date checkobox date, month and year dropdown should be displayed
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select the unknown date checkbox
    And verify that date, month and year checkbox should be displayed

  @smoke
  Scenario: Verify that  user is able to select the date from the date dropdown
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select the unknown date checkbox
    And user sleect the date "5" from from date dropdown
    And user select the month "5" from date dropdown
    And user select the year "2025" from date dropdown

  @smoke
  Scenario: Verify that Submit for Review button should be displayed
    When user click on "MS1-815" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that Submit for review button should be displayed

  @regression
  Scenario: Verify that user is able to select hours and minutes
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select "05" from hours dropdown
    And user select the "07" from minutes dropdown

  @regression
  Scenario: Verify that for time 12 hours 12 should not be displayed
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that "12" should be shown in hours dropdown

  @regression
  Scenario: Verify that for time 12 hours 60 mins should be displayed
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that "60" should be shown in mins dropdown

  @regression
  Scenario: Verify that user is able to select time 24 hours and minutes
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select "05" from time 24 hours dropdown
    And user select the "07" from time 24 minutes dropdown

  @smoke
  Scenario: Verify that for time 12 hours 12 should not be displayed
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that "24" should not be shown in time 24 hours dropdown

  @smoke
  Scenario: Verify that for time 12 hours 60 mins should be displayed
    When user click on "MS1-813" to open the subject visit page
    When user enter "Form 2" in search textbox
    And user click on Form 2 option
    Then verify that "60" should not be shown in time 24 mins dropdown

  @smoke
  Scenario: Verify that usershould be able to select the hrs, mins, sec and AM/PM
    When user click on "MS1-813" to open the subject visit page
    And user enter "Form 2" in search textbox
    And user click on Form 2 option
    And user select "11" hrs from time 12 hrs with sec dropdown
    And user select the "13" mins from time 12 hrs with sec dropdown
    And user select the "14" sec from time 12 hrs with sec dropdown
    And user select the "AM" from time 12 hrs with sec AMPM dropdown
