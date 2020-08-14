Feature: Homepage test
  Scenario: Whitebox slider image testing
    Given I'm on homepage
    When counts the number of slider images
    Then assert if its correct

    Scenario: logo testing
      Given  I'm on homepage
      When locate the logo
      Then assert if its present

      Scenario: footer test
        Given I'm on homepage
        When locate the link in footer
        Then assert footer link

