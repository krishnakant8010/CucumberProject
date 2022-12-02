Feature: Check Home page functionality

  Background: user is logged in
    Given User is on login page
    When user enters username and password
    And clicks on the login button
    Then user is navigated to the homepage

  Scenario: Check the logout link
    When users clicks on Setting link
    Then logout link is displayed

  Scenario: Verify quick the toolbar persent
    When click on the dashbaord link
    Then quick lanch toolbars is displayed
