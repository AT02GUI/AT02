Feature: Login user
  I want to login to Pivotal page with valid acount

  Scenario: Login with valid credentials
    Given I am on Pivital Home Page
    When I put a valid user ariel.vallejos@fundacion-jala.org
    And I put a valid password AT02david
    Then I should see that I Logged on this url https://www.pivotaltracker.com/dashboard