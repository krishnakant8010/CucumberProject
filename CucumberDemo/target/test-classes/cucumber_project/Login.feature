@Firstdemo
Feature: Validating first PAGE 
I want to check  first testing 
 
 @Firsttesting
 Scenario: Check the first testing file
    Given I open Chrome Browser 
    And I enter the URL in the address bar 
   	Then Open the Login page
    And I enters the <username> and <password>
    And Users click on the Login button
    Then User is navaite to the Dashabord
    
Examples:
    |username|password|
    |indyfin123@outlook.com|SuperDuper@1|
    
    
    
    
    