Feature: Subject Visit Form-2

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" opion from left side menu

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
