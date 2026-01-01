Feature: Query

  Background:
    Given user open browser and enter url
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that all the mandtory fields query should be generated
    When user apply filter with site "ML_Site1" and subject "MS1-845"
    And user click on "MS1-845" to open the subject visit page
    And user enter "Form 1" in search textbox
    And user click on form option
    And user click on save button to save the form
    Then verify that "Textview", "Number All", "Checkbox Mandatory" and "Radiobutton Mandatory" query validation message should be appear

  @smoke
  Scenario: Verify that for all the mandtory fields query raised icon should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter "Form 1" in search textbox
    And user click on form option
    And user click on save button to save the form
    And user click on yes button
    Then verify that query raised icon should be displayed

  @smoke
  Scenario: Verify that updated data points box should be displayed after changing the fields
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on save button to save the form
    Then verify that Updated data points pop up should be displayed

  @smoke
  Scenario: Verify that when I select the "<reason>" from common reason dropdown then it should be applied in all dropdown
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "7" in Number all textbox
    And user select "Yes" checkbox mandatory
    And user select the "No" from radio button mandatory
    And user click on save button to save the form
    Then verify that Updated data points pop up should be displayed
    When user select the "<reason>" from common reason dropdown
    Then verify that "<reason>" should be displayed for the Textview field
    And verify that "<reason>" should be displayed for the Number All field
    And verify that "<reason>" should be displayed for the Checkbox Mandatory field
    And verify that "<reason>" should be displayed for the Radio button Mandatory field

    Examples:
      | reason                         |
      | Wrongly entered                |
      | Source changed                 |
      | Change due to validation field |
      | New Data                       |

  @regression
  Scenario: Verify that "<reason>" should be displayed in common reason dropdown
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "7" in Number all textbox
    And user select "Yes" checkbox mandatory
    And user select the "No" from radio button mandatory
    And user click on save button to save the form
    Then verify that Updated data points pop up should be displayed
    And verify that "<reason>" should be displayed in common reason dropdown

    Examples:
      | reason                         |
      | Wrongly entered                |
      | Source changed                 |
      | Change due to validation field |
      | New Data                       |

  @regression
  Scenario: Verify that reason is required error message should be displayed if user click on yes button without selecting any reason
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on save button to save the form
    Then verify that Updated data points pop up should be displayed
    When user click on yes button
    Then Verify that "Reason is required" error message should be displayed in toaster

  @regression
  Scenario: Verify that query pop up should be closed after clicking on No button
    When user apply filter with site "ML_Site1" and subject "MS1-850"
    And user click on "MS1-850" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on save button to save the form
    And user click on No button
    Then verify that help text should be displayed
