package log4jpractice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class log4j {

	public static void main(String[] args) {
		

		Logger K= Logger.getLogger("Log4j1");
		PropertyConfigurator.configure("log4j.Properties");
		
		 System.setProperty("webdriver.chrome.driver", "./sai1.drivers/chromedriver.exe");
		 WebDriver d1=new ChromeDriver();
		 K.info("Browser opened sucessfully");
		 
		 
		 d1.get("https://demo.guru99.com/test/newtours/");
		 d1.manage().window().maximize();
		 K.info("Home page is opened");
		 
		 
		 d1.findElement(By.name("userName")).sendKeys("Admin");
		 d1.findElement(By.name("password")).sendKeys("Admin123");
		 d1.findElement(By.name("submit")).click();
		 K.info("Application loggin sucessfully");
		 
	}

}
