Feature: Login Action

#  Scenario Outline: Successful Login with Valid Credentials
#    Given User is on Home Page
#    When User Navigate to LogIn Page
#    And User enters <username> and <password>
#    Then Message displayed Login Successfully
#
#    Examples:
#      |username|password|
#      |orson|zhu15913141134|


  Scenario: Successfully pay for the bill
    Given I rent a house
    When Today is the end of the month
    Then I need to pay the bill