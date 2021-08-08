package com.map.stepdefination;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.stepdefination.ContextSteps;

import org.slf4j.LoggerFactory;
import org.testng.Assert;

import java.util.Map;

import org.slf4j.Logger;

import com.objects.GoogleMapObjects;
import com.methods.GoogleMapMethods;

public class GoogleMap {

	GoogleMapMethods googlMpMethods =new GoogleMapMethods();
	GoogleMapObjects googlMpObj = new GoogleMapObjects();
	Logger LOGGER = LoggerFactory.getLogger(ContextSteps.class);

@Given("^Launch Chrome browser$")
	public void launch_chrome_browser() throws Throwable {
	googlMpMethods.LaunchChrome();
}

@And("^Navigate to Google Maps$")
	public void navigate_to_google_maps() throws Throwable {
	googlMpMethods.NaviagteURL();
}

//############## Scenario-1 #################

@And("^Click on search button and enter the location$")
	public void click_on_search_button_and_enter_the_location() throws Throwable {
	googlMpMethods.EnterLocation();
}

@Then("^Verify the cordinates$")
	public void verify_the_cordinates() throws Throwable {
	googlMpMethods.VerifyCordinates();
}

//############## Scenario-2 #################


@Then("^Click on direction button$")
	public void click_on_direction() throws Throwable {
	googlMpMethods.ClickDirection();
}

@Then("^Enter the source and destination$")
	public void enter_the_source_and_destination() throws Throwable {
	googlMpMethods.EnterSourceDestination();
}

@Then("^Verify the available route$")
	public void verify_the_available_route() throws Throwable {
	googlMpMethods.VerifyAvailableRoute();
}

@And("^Store the route title distance in miles and the travel time$")
	public void route_title_distance_in_miles_and_the_travel_time() throws Throwable {
	googlMpMethods.VerifyTitle();
	googlMpMethods.StoreData();
}
}












