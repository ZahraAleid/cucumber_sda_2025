@ParallelFeature
Feature: sign in sauce demo
  As a user
  I want to sign in
  so that I can use the sauce demo application

  @positiveSignIn3 @SauceDemo
  Scenario: Sign in as problem user
    Given I am on sauceDemo application
    When I enter "problem_user" as username
    And I enter "secret_sauc" as password
    And I click on sign in button
    Then I should be redirected to Products page
    And I should see product inventory

  @positiveSignIn4 @SauceDemo
  Scenario: Sign in as problem user
    Given I am on sauceDemo application
    When I enter "visual_user" as username
    And I enter "secret_sauce" as password
    And I click on sign in button
    Then I should be redirected to Products page
    And I should see product inventory