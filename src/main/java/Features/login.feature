Feature: login action test
  Scenario Outline: Whitebox login test
    Given user is on homepage
    When user navigate to login page
    And user enter "<username>" and "<password>"
    Then message displayed wrong
    Examples:
    |username|password|
    |easwari.theetha@gmail.com        | blahblah       |

