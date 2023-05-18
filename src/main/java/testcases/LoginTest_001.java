package testcases;

	import org.testng.Assert;
    import org.testng.annotations.Test;
    import objects.LoginPage;
   

	

	public class LoginTest_001 extends BaseClass {
		
		@Test
		public void logintest(){
			//open application
			driver.get("https://products.ncryptedprojects.com/fundraiser_v3.1/login");
			
			LoginPage lp=new LoginPage(driver);	
			
			lp.setusername();
			System.out.println("username is entered");
			
			lp.setpassword();
			System.out.println("password is entered");
			
			lp.clickLoginButton();
			System.out.println("login button is clickable");
			
			System.out.println(driver.getTitle());
			
			if(driver.getTitle().equals("My profile : Fundraiser")){
				Assert.assertTrue(true);
				System.out.println("this testcase is passed");
			}
			else{
				Assert.assertTrue(false);
				System.out.println("this test case is failed");
		}	
		}
        }
