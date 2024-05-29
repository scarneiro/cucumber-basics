Feature: Login Feature - Production
  In order to perform successful login
  As a User
  I have to enter correct username and password

  Scenario Outline: Login to Facebook Website as a  User on Production
    Given user navigates to Facebook website
    When user validates the homepage title
    Then user enters "<username>" username
    And user enters "<password>" password
    And user validates captcha image
    And user clicks on the signin button

    Examples:
    | username | password |
    | valid    | valid    |
    | invalid  | invalid  |
    | valid    | invalid  |
    | invalid  | valid    |
