package com.objects;
import java.util.List;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;


public class GoogleMapObjects{
	
	public GoogleMapObjects() {
		super();
	}	
		public SelenideElement searchbox = $x("//input[@id='searchboxinput']");

		public SelenideElement directionbtn = $x("//body/jsl[1]/div[3]/div[9]/div[8]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/div[1]/button[1]/img[1]");

		public SelenideElement sourcelbl = $x("//body/jsl[1]/div[3]/div[9]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/input[1]");

		public SelenideElement destinationlbl = $x("//body/jsl[1]/div[3]/div[9]/div[3]/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]");

		public SelenideElement firstRoute = $x("//div[@id='section-directions-trip-0']");

		public SelenideElement secondRoute = $x("//div[@id='section-directions-trip-1']");

		public SelenideElement routeName = $x("//span[contains(text(),'CA-99 S and I-80 W')]");

		public SelenideElement time = $x("//*[@id="pane"]/div/div[1]/div/div/div[3]/div[1]/h1/span[1]/span[1]");

		public SelenideElement distance = $x("//*[@id="pane"]/div/div[1]/div/div/div[3]/div[1]/h1/span[1]/span[2]");
}



