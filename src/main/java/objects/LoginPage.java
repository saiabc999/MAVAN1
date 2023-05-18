package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//create Globalizeddriver object
	public WebDriver ldriver;
	
	
	//create one parameterized Constructor
	public LoginPage(WebDriver rdiver){
		
		
    //you will eliminate the Ambiguity issue
	ldriver=rdiver;
		
	
	PageFactory.initElements(rdiver, this);
		
	}
	
	@FindBy(id="user_email")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(id="user_password")
	//@CacheLookup//optional
	WebElement txtuserpassword;
	
	@FindBy(name="submitLogin")
	WebElement btnLogin;
	
	public void setusername(){
	txtusername.sendKeys("buyer.ncrypted@gmail.com");
		
	}
	
	public void setpassword(){
	txtuserpassword.sendKeys("123456");
	}
	
	public void clickLoginButton(){
	btnLogin.click();
		
	}
    }  
	
	

