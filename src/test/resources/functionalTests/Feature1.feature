Feature:Automated E2E Test for Gmail Website
Description: The purpose of this feature is to test E2E integration

Scenario: Customer opens email inbox

Given user is on Home Page
When user enters credentials
And user log into Gmail
Then user reads inbox

