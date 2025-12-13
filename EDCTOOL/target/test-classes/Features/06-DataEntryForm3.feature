Feature: Subject VIisit Form 3

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"
    And user login with "Shreyansh" username and "Shreyans@123" as a password
    And user select study "TEST2025" and role "CRC" from dropdown and click on submit button
    When user click on "Subjects" option from left side menu

  @smoke
  Scenario: Verify that user should be able to open the form 3
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that form 3 should be opened

  @smoke
  Scenario: Verify that Take Vitals every 2 hrs message should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that "Take Vitals every 2 hrs" form 3 title message should be displayed

  @smoke
  Scenario: Verify that multi row table should be open after clicking on plus icon
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    Then verify that multirow table should be opened

  @smoke
  Scenario: Verify that fields should be displayed in form
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    Then verify that Sr no textbox should be displayed
    And verify that bp textbox should be displayed
    And verify that Heart Rate checkbox should be displayed

  @regression
  Scenario: Verify that user should be able to fill the form
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user enter "<sr no>" in sr no textbox
    And user enter "<bp>" in bp textbox
    And user select "<heart rate>" checkbox from heart rate
    And user select "<treatment>" from treatment checkbox
    And user select "<respiratory rate>" from Respiratory Rate dropdown

    Examples:
      | sr no | bp  | heart rate | treatment | respiratory rate |
      | 1     | 12  | Normal     | Medicine  | Yes              |
      | 9     | 120 | Abnormal   | Rest      | No               |
      | 34    | 180 | Normal     | Surgery   | Yes              |
      | 48    | 220 | Abnormal   | Medicine  | No               |
      | 23    | 123 | Abnormal   | Medicine  | Yes              |
      | 78    | 72  | Normal     | Rest      | NO               |

  @smoke
  Scenario: Verify that after clicking on close icon field should be removed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user click on close icon
    Then verify that form should be closed

  @regression
  Scenario: Verify that user is able to select the multiple treatment option
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user select "Medicine" from treatment checkbox
    And user select "Surgery" from treatment checkbox
    And user select "Rest" from treatment checkbox

  @regression
  Scenario: Verify that user is able to select the mulitple heart rate
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user select "Normal" checkbox from heart rate
    And user select "Abnormal" checkbox from heart rate

  @smoke
  Scenario: Verify that Add row button is disabled while any entry is pending
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    Then verify that plus icon should be disabled
