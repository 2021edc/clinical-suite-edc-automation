Feature: Subject Visit Form 3

  Background:
    Given user open browser and enter url
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that validation message should be appear if Date 1 is greater than date 2
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the today date from date 1 vertical form
    And user select the yesterday date from date 2 vertical form
    Then verify that validation message should be appear

  @regression
  Scenario: Verify that cancel button should be appear in pop up if Date 1 is greater than date 2
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the today date from date 1 vertical form
    And user select the yesterday date from date 2 vertical form
    Then verify that cancel button should be appear in warning popup

  @regression
  Scenario: Verify that ok button should be appear in pop up if Date 1 is greater than date 2
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the today date from date 1 vertical form
    And user select the yesterday date from date 2 vertical form
    Then verify that Ok button should be appear in warning popup

  @rgression
  Scenario: Verify that warning pop up should be close after clicking on ok button when Date 1 is greater than date 2
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the today date from date 1 vertical form
    And user select the yesterday date from date 2 vertical form
    And user click on ok button from warning pop up
    Then verify that warning pop up should be closed

  @rgression
  Scenario: Verify that warning pop up should be close after clicking on cancel button when Date 1 is greater than date 2
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the today date from date 1 vertical form
    And user select the yesterday date from date 2 vertical form
    And user click on cancel button from warning pop up
    Then verify that warning pop up should be closed
