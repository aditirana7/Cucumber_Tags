Feature: Checking google

  Scenario: Validate google search is working
    Given browser window is open
    And user is on google search page
    When user enters Automation Testing text in search box
    And hits enter
    Then user is navigated to search results
    Then print the title of the browser and close browser
