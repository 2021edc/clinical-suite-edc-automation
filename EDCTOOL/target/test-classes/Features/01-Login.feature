Feature: Login

  Background:
    Given user open "chrome" browser and enter url "https://dev.clinicalsuite.nxtrial.com/"

  @smoke
  Scenario: Verify that login page should be opened
    Then verify that "Log In" header should be visible

  @regression
  Scenario: Verify the login page title
    Then Verify that "EDC Tool" page title should be displayed

  @regression
  Scenario: Verify that validation message should be appear if username is not entered
    When user click on login button
    Then Verify that "Username is required" error message should be displayed

  @regression
  Scenario: Verify that validation message should be appear if password is not entered
    When user enter the "Neelam" in username textbox
    And user click on login button
    Then Verify that "Password is required" error message should be displayed

  @regression
  Scenario: Verify that error message appear if enter incorrect credentials
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    Then Verify that "Bad credentials" error message should be appear while enter incorrect credentials

    Examples:
      | username | password |
      | Neelam   | 123      |
      | saddad   | qdsadad  |

  @smoke @regression
  Scenario: Verify that Study & Role should be able to do the login into the system
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    Then Verify that Study & Role page should be opened

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |

  @smoke @regression
  Scenario: Verify that Study and Role dropdown should be opened
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    Then verify that Study dropdown should be displayed
    And verify that role dropdown should be displayed

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |

  @regression
  Scenario: Verify that login page should be opened after clicking on cancel button from study and role page
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    And user click on cancel button
    Then verify that "Log In" header should be visible

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |

  @smoke @regression
  Scenario: Verify that please select study error message should be displayed
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    And user click on submit button
    Then Verify that "Please select a study" error message should be displayed

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |

  @regression
  Scenario: Verify that please select role error message should be displayed
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    And user click on "Study-01" from dropdown
    And user click on submit button
    Then Verify that "Please select a role" error message should be displayed

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |

  @regression
  Scenario: Verify that user should be able to login into the system
    When user enter the "<username>" in username textbox
    And user enter the "<password>" in password textbox
    And user click on login button
    And user click on "Study-01" from dropdown
    And user click on "CRC" from role dropdown
    And user click on submit button
    Then Verify that username should be displayed into home page

    Examples:
      | username | password   |
      | Neelam   | Pranil@123 |
