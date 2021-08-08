Feature: Google Maps to verify the route and distance from Chico, California to San Francisco, California.
 
 Background: 
    Given Launch Chrome browser
    And Navigate to Google Maps

    @TC01 @GoogleMap
    Scenario: Verify the coordinates for San Francisco, California
    And Click on search button and enter the location
    Then Verify the cordinates

    @TC02 @GoogleMap
    Scenario: Verify available route and distance
    And Click on search button and enter the location
    Then Click on direction button
    Then Enter the source and destination
    Then Verify the available route
    And Store the route title, distance in miles, and the travel time
    
