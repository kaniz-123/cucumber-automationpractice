Feature: Sanity Test for Automation Practice Website
  # Given, When, Then, And, But
  Background: This is a set up that runs before each scenerio
    Given I navigate to 'automation practice' website in the browser
@sanity
    Scenario: Navigation to Evening Dresses tab successful
      Given I hoverover on 'WOMEN' tab in home page
      And I click on 'Evening Dresses' tab in navigation menu
      Then I see 'Evening Dresses' title in evening dresses page