package com.map.pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;  
import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 
import java.util.concurrent.TimeUnit;
import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import com.objects.GoogleMapObjects;

public class GoogleMapMethods {

GoogleMapObjects googlMpObj = new GoogleMapObjects();
public void LaunchChrome(){
 System.setProperty("webdriver.chrome.driver", "C:\\GoogleMap\\chromedriver.exe");  // NOTE: Change as per system or set in environment variable
 WebDriver driver=new ChromeDriver(); 
 driver.manage().window().maximize();
}

public void NaviagteURL(){
driver.navigate().to("https://maps.google.com/");
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
}

public void EnterLocation(){
googlMpObj.searchbox.click();
googlMpObj.searchbox.sendKeys("San Francisco, California");
googlMpObj.searchbox.sendKeys(Keys.ENTER);
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

public void VerifyCordinates(){
String url = driver.getCurrentUrl();
String xCordinate = "37.7576175";
String yCordinate = "-122.5773436";
String[] arr = url.split("/|,|@");
Assert.assertEquals(arr[9],xCordinate,"x-Cordinates are not same");
System.out.println("Verfied xcordinates);
Assert.assertEquals(arr[10],yCordinate,"y-Cordinates are not same");
System.out.println("Verfied ycordinates);
}

public void ClickDirection(){
googlMpObj.directionbtn.click();
driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
}

public void EnterSourceDestination(){
googlMpObj.sourcelbl.click();
googlMpObj.sourcelbl.sendKeys("Chico, California");
googlMpObj.destinationlbl.click();
googlMpObj.destinationlbl.sendKeys("San Francisco, California");
googlMpObj.destinationlbl.sendKeys(Keys.ENTER);
driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}

public void VerifyAvailableRoute(){
Assert.assertEquals(true,googlMpObj.firstRoute.isDisplayed());
Assert.assertEquals(true,googlMpObj.secondRoute.isDisplayed());
}

public void VerifyTitle(){
String RouteName = googlMpObj.routeName.getText();
System.out.println("Route name is "+getText());
}

public void StoreData(){
googlMpObj.firstRoute.click();
driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
String RouteName = googlMpObj.routeName.getText();
String Time = googlMpObj.time.getText();
String Distance = googlMpObj.distance.getText();
File file = new File("routes.txt");
Filewriter fw = new FileWriter(file);
fw.write("Route Name : "+RouteName);
fw.write("Estimated Time : "+Time);
fw.write("Total Distance : "+Distance);
fw.close();
}














