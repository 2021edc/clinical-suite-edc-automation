Feature: Subject Visit

  Background:
    Given user open browser and enter url
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that Subject visit page should be opened
    When user apply filter with site "ML_Site1" and subject "MS1-811"
    And user click on "MS1-811" to open the subject visit page
    Then verify that subject visit page should be opened

  @regression
  Scenario: Verify that no match found error message should be displayed if form is not present
    When user apply filter with site "ML_Site1" and subject "MS1-811"
    And user click on "MS1-811" to open the subject visit page
    And user enter "sdadasdad" in search textbox
    Then verify that "No forms found matching" message should be displayed

    Examples:
      | search_term |
      | sdadasdad   |
      |             |

  @regression
  Scenario: Verify that search textbox should be empty after clicking on X icon
    When user apply filter with site "ML_Site1" and subject "MS1-811"
    And user click on "MS1-811" to open the subject visit page
    And user enter "sdadasdad" in search textbox
    And user click on X icon
    Then verify that text should be cleared

  @regression
  Scenario: Verify that subject form should be closed after clicking on close button
    When user apply filter with site "ML_Site1" and subject "MS1-811"
    And user click on "MS1-811" to open the subject visit page
    And user click on close button
    Then verify that page should be closed

  @smoke
  Scenario: Verify that user should be able to fill the form
    When user apply filter with site "ML_Site1" and subject "MS1-811"
    And user click on "MS1-811" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "test textarea" in the textarea
    And user enter the "3424234234324" in number textbox
    And user click on save button to save the form

  @smoke
  Scenario: Verify that System-generated Queries should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    When user click on "MS1-813" to open the subject visit page
    And user click on save button to save the form
    Then verify that "System-generated Queries" message should be displayed if mandatory fields not entered

  @regression
  Scenario: Verify that if number all field is not entered then it should give the query
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user click on save button to save the form
    Then verify that number all field query should be given

  @smoke11
  Scenario: Verify that query description should be displayed for the number mandatory
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on save button to save the form
    Then verify that "Number All" query description should be displayed

  @smoke
  Scenario: Verify that user is not able to enter the alphabets in number field
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "eeee" in Number all textbox
    Then verify that alphabets should not be entered

  @regression:
  Scenario: Verify that maximum value validation message should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "123123123123" in Number all textbox
    And user click on save button to save the form
    Then verify that "Maximum Value" query description should be displayed

  @smoke
  Scenario: Verify that help text icon should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    Then verify that help text should be displayed

  @regression:
  Scenario: Verify that minimum value validation message should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "1" in Number all textbox
    And user click on save button to save the form
    Then verify that "Minimum Value" query description should be displayed

  @smoke
  Scenario: Verify that updated date point pop up should be appear
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "7" in Number all textbox
    And user click on save button to save the form
    Then verify that "Updated Data Points" label pop up should be displayed

  @smoke
  Scenario: Verify that user is able to select multiple options
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user select "<label>" checkbox

    Examples:
      | label |
      | Yes   |
      | No    |

  @smoke
  Scenario: Verify that checkbox mandatory selected
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user select "<label>" checkbox mandatory

    Examples:
      | label |
      | Yes   |
      | No    |

  @smoke
  Scenario: Verify that validation message should be displayed if checkbox mandatory is not selected
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "7" in Number all textbox
    And user click on save button to save the form
    Then verify that "Checkbox Mandatory" query description should be displayed

  @smoke
  Scenario: Verify that if Radio button selected No then select dropdown should be disabled
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user select the "No" from radio button mandatory
    Then verify that select dropdown should be disabled

  @smoke
  Scenario: Verify that if radio button is selected then select dropdown should be enabled
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user select the "Yes" from radio button mandatory
    Then verify that select dropdown should be enabled

  @smoke
  Scenario: Verify that "<value>" should be displayed in dropdown
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user select the "Yes" from radio button mandatory
    And user click on dropdown
    Then verify that "<value>" should be displayed in dropdown

    Examples:
      | value   |
      | Phase 1 |
      | Phase 2 |
      | Phase 3 |
      | Phase 4 |

  @smoke
  Scenario: Verify that Select box mandtory validation message should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user enter the "7" in Number all textbox
    And user select "Yes" checkbox mandatory
    And user select the "Yes" from radio button mandatory
    And user click on save button to save the form
    Then verify that "Please select value from select box" query description should be displayed

  @smoke
  Scenario: Verify that confirmartion pop up should be appear after clicking on close button
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on close button
    Then verify that confirmation pop up should be displayed

  @smoke
  Scenario: Verify that cancel button should be displayed in conformation popup
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on close button
    Then verify that cancel button should be displayed in confirmation popup

  @smoke
  Scenario: Verify that Yes button should be displayed in conformation popup
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter the "test textview" in the textview textbox
    And user click on close button
    Then verify that Yes button should be displayed in confirmation popup
