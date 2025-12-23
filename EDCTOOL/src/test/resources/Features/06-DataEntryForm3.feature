Feature: Subject Visit Form 3

  Background:
    Given user open browser and enter url
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
      | 78    | 72  | Normal     | Rest      | No               |

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

  @regression
  Scenario: Verify that query popup should be appear with validation
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user enter "<sr no>" in sr no textbox
    And user click on save button to save the form 3
    Then verify that "Maximum Value" validation message should be appear while save the form

    Examples:
      | sr no |
      | 32001 |
      | 80000 |

  @regression
  Scenario: Verify that minimum value validation message should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user enter "<sr no>" in sr no textbox
    And user click on save button to save the form 3
    Then verify that "Minimum Value" validation message should be appear while save the form

    Examples:
      | sr no |
      | -11   |
      | -2021 |

  @smoke
  Scenario: Verify that insert audit log should be displayed after saving the form
    When user click on arrow to make the left menu sticky
    And user apply filter with site "ML_Site1" and subject "MS1-831"
    And user click on "MS1-831" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    And user enter "<sr no>" in sr no textbox
    And user enter "<bp>" in bp textbox
    And user select "<heart rate>" checkbox from heart rate
    And user select "<treatment>" from treatment checkbox
    And user select "<respiratory rate>" from Respiratory Rate dropdown
    And user click on save button to save the table
    And user navigate to the audit logs page
    Then verify that "TEST table" added log should be displayed with today date
    And verify that Respiratory Rate should be displayed into the data entry point

    Examples:
      | sr no | bp | heart rate | treatment | respiratory rate |
      | 1     | 12 | Normal     | Medicine  | Yes              |

  @smoke
  Scenario: Verify that delete audit log should be displayed after deleting the form
    When user click on arrow to make the left menu sticky
    And user apply filter with site "ML_Site1" and subject "MS1-831"
    And user click on "MS1-831" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on delete button to delete the form
    And user enter the "delete reason" in reason textbox
    And user click on ok button
    And user navigate to the audit logs page
    Then verify that "Data Entry deleted" deleted log should be displayed with today date
    And verify that Respiratory Rate should be deleted displayed into the data entry point

  @smoke
  Scenario: Verify that user should be able to delete the form
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
    And user click on delete
    Then verify that + icon should be enabled

    Examples:
      | sr no | bp | heart rate | treatment | respiratory rate |
      | 1     | 12 | Normal     | Medicine  | Yes              |

  @regression
  Scenario: Verify that Add button should be disabled when table form is opened
    When user apply filter with site "ML_Site1" and subject "MS1-813"
    And user click on "MS1-813" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on plus icon
    Then verify that Add button should be disabled

  @smoke
  Scenario: Verify that Add button should be enabled
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that add button should be enabled

  @regression
  Scenario: Verify that user should be able to enter the sr no in table view form
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user enter the "<sr no>" in sr no textbox

    Examples:
      | sr no |
      | 2313  |
      | 78990 |

  @regression
  Scenario: Verify that error message appear while enter the long number
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user enter the "<sr no>" in sr no textbox
    And user click on save button to save the multi raw form 3
    Then verify that "Maximum Value" validation message should be appear while save the form

    Examples:
      | sr no                              |
      | 231379234723747234798243798297842  |
      | 7899008908098080890890890890980808 |

  @regression
  Scenario: Verify that after clicking on close button form should be closed
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user click on multi raw close button
    Then verify that multi raw form should be closed

  @regression
  Scenario: Verify that row id filter dropdown should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-832"
    And user click on "MS1-832" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that row id dropdown filter should be displayed

  @regression
  Scenario: Verify that search button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-832"
    And user click on "MS1-832" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that search button should be displayed

  @regression
  Scenario: Verify that clear filters button should be displayed
    When user apply filter with site "ML_Site1" and subject "MS1-832"
    And user click on "MS1-832" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    Then verify that clear filter for form button should be displayed

  @smoke
  Scenario: Verify that user is able to apply the row id filter
    When user apply filter with site "ML_Site1" and subject "MS1-832"
    And user click on "MS1-832" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click the 1 row id
    And user click on search button

  @smoke
  Scenario: Verify that user is able to clear the filter
    When user apply filter with site "ML_Site1" and subject "MS1-832"
    And user click on "MS1-832" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click the 1 row id
    And user click on remove button

  @smoke
  Scenario: Verify that user should be able to fill the vertical form
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user enter the sr no "<sr no>" in vertical form
    And user enter the bp "<bp>" in vertical form
    And user select the heart rate "<heart rate>" in vertical form
    And user select the treatment "<treatment>" in vertical form
    And user select the respiratory rate "<respiratory rate>" in vertical form
    And user select the today date from date 1 vertical form
    And user select the today date from date 2 vertical form
    And user click on save button in vertical form

    Examples:
      | sr no | bp | heart rate | respiratory rate | treatment |
      | 12    | 43 | Normal     | Yes              | Rest      |

  @regression
  Scenario: Verify that heart abnormal textbox does not enable until the Abnormal checkbox is checked
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    Then verify that heart rate Abnormal textbox is disabled

  @regression
  Scenario: Verify that heart abnormal textbox is enabled after abnormal checkbox is checked
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the heart rate "Abnormal" in vertical form
    Then verify that heart rate Abnormal textbox is enabled

  @regression
  Scenario: Verify that heart abnormal textbox is disabled if Noraml heart rate is selected
    When user apply filter with site "ML_Site1" and subject "MS1-833"
    And user click on "MS1-833" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user select the heart rate "Abnormal" in vertical form
    Then verify that heart rate Abnormal textbox is enabled

  @smoke
  Scenario: Verify that user should be able to fill the vertical form with abnoraml heart value
    When user apply filter with site "ML_Site1" and subject "MS1-834"
    And user click on "MS1-834" to open the subject visit page
    And user enter "Form 3" in search textbox
    And user click on form option
    And user click on add button
    And user enter the sr no "<sr no>" in vertical form
    And user enter the bp "<bp>" in vertical form
    And user select the heart rate "<heart rate>" in vertical form
    And user enter the "50" in abnormal heart rate textbox
    And user select the treatment "<treatment>" in vertical form
    And user select the respiratory rate "<respiratory rate>" in vertical form
    And user select the today date from date 1 vertical form
    And user select the today date from date 2 vertical form
    And user click on save button in vertical form

    Examples:
      | sr no | bp | heart rate | respiratory rate | treatment |
      | 12    | 43 | Abnormal   | Yes              | Rest      |
