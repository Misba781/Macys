Feature: product search

  Background:
    Given i am at macys Homepage

  @test
  Scenario:Create a brand new user
    And i click on clickSearch

  @login
  Scenario: login account
    And click on signIn button
    And i enter valid email address
    And i enter valid password
    When i click on Sing In button
    Then i should be able to login


