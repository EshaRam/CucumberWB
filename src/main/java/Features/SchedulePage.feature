Feature: SchedulePage test
  Scenario: SchedulePage title check
    Given going to homepage
    When navigate to schedulePage
    Then check the schedule title
    And assert schedule title

    Scenario: SchedulePage calendar check
      Given going to homepage
      When navigate to schedulePage
      Then check the calendar and assert it
