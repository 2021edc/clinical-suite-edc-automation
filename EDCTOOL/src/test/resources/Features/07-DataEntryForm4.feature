Feature: Data Entry Form 4

  Background:
    Given user open browser and enter url
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that user is able to remvoe the file
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "<fileName>" file
    Then verify that file should be uploaded
    When user click on remove file button
    Then verify that file should be removed

    Examples:
      | fileName  |
      | dummy.pdf |

  @regression
  Scenario: Verify that start upload button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that start upload button should be displayed

  @regression
  Scenario: Verify that pause button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that pause button should be displayed

  @regression
  Scenario: Verify that resume button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that resume button should be displayed

  @regression
  Scenario: Verify that Stop & Cancel button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that Stop & Cancel button should be displayed

  @regression
  Scenario: Verify that Remove all button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that remove all button should be displayed

  @regression
  Scenario: Verify that resume button should be disabled
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that resume button should be disabled

  @regression
  Scenario: Verify that stop & cancel button should be disabled
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that stop & cancel button should be disabled

  @regression
  Scenario: Verify that pause button should be disabled
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user upload the "dummy.pdf" file
    Then verify that file should be uploaded
    And verify that pause button should be disabled

  @regression
  Scenario: Verify that  Date 1 is not equals to date 2  validation message should be appear
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user select today date from date 1 in form
    And user select the yesterday date from date 2 in form
    Then verify that validation message should be appear

  @regression
  Scenario: Verify that  Date 2 is not equals to date 1 validation message should be appear
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user select today date from date 2 in form
    And user select the yesterday date from date 1 in form
    Then verify that validation message should be appear

  @smoke
  Scenario: Verify that validation message does not appear if Date 3 and date 4 are same
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user select today date from date 3 in form
    And user select today date from date 4 in form
    Then verify that validation message should not be appear

  @regression
  Scenario: Verify that  validation message does not appear if date 4 and date 3 are same
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 4" in search textbox
    And user click on form option
    And user select today date from date 4 in form
    And user select today date from date 3 in form
    Then verify that validation message should not be appear
