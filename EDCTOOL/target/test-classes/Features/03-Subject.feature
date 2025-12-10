Feature: Subject

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that user should be able to see the subject in left panel
    Then verify that "Subjects" should be displayed

  @smoke
  Scenario: Verify that Subjects  page opened after clicking on subjects option
    Then verify that "Subjects" title should be displayed

  @smoke
  Scenario: Verify that Add  button should be displayed
    Then verify that Add Subject button should be displayed

  @smoke
  Scenario: Verify that Add Subjects Details popup should be opened
    When user click on Add Subject button
    Then verify that "Add Subject Details" pop up should be opened

  @regression
  Scenario: Verify that error message should be displayed if site is not selected
    When user click on Add Subject button
    And user click on save button
    Then Verify that "Please select a site" error message should be displayed

  @regression
  Scenario: Verify that error message should be displayed if subject is not entered
    When user click on Add Subject button
    And select the "ML_Site1" option from site dropdown
    And user remove the default from subject name textbox
    And user click on save button
    Then Verify that "Please enter a subject ID" error message should be displayed

  @regression
  Scenario: Verify that error message should be displayed if add the space input in subject name
    When user click on Add Subject button
    And select the "ML_Site1" option from site dropdown
    And user enter the "   " as a subject name
    And user click on save button
    Then Verify that "Please enter a subject" error message should be displayed

  @regression
  Scenario: Verify that Add subject details pop up should be closed after clicking on cancel button
    When user click on Add Subject button
    And user click on cancel button to close the pop up
    Then verify that pop up should be closed

  @smoke
  Scenario: Verify that user should be able to add the subject
    When user click on Add Subject button
    And select the "ML_Site1" option from site dropdown
    And user click on subject id textbox
    And user click on save button
    Then Verify that "Subject added successfully" message should be displayed

  @smoke
  Scenario: Verify that Subject visit page should be opened
    When user click on "MS1-811" to open the subject visit page
    Then verify that subject visit page should be opened
