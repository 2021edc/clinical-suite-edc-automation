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
