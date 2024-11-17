
@tag
Feature: Launch application tutorialninja.com

@tutorialninjaPOM
  Scenario: Open the url tutorialninja.com 
    Given opening browser and launchin tutorialninja.com POM
    When navigate to select euro currency POM
    And click on euro currency POM
    
