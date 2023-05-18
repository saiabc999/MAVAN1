package testcases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	//common functionalities
	//open application//close application//take screenshot 
	//global variable
	public static WebDriver driver;
	
	@BeforeClass
	public void openapplication(){
		
		//System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();//local variable
	}
	
	@AfterClass
	public void closeApplication(){
		driver.close();
	}

}

