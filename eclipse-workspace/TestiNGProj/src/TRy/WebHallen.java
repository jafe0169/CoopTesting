package TRy;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class WebHallen {
	//public String baseurl ="https://www.webhallen.com/se/";
     String driverPath="C:\\geckodriver.exe";
        public WebDriver driver = null;
		public String oldPw = "JensenEducation2020";
		public String newPw = "";
		public String temp = "";
		SoftAssert softAssert = new SoftAssert();
		
		
		@Test(priority = 1)
		public void doLogin() throws InterruptedException, IOException {
			System.out.println("Testing login test");
			String expectedResult = "Coop | Sveriges grönaste matkedja";
			String expectedID = "Jannatul.ferdoese@gmail.com";
			// Step 1
			driver.get("https://www.webhallen.com/se/");
			String actualResult = driver.getTitle();
			Assert.assertEquals(actualResult, expectedResult);
			// step 2
			driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div/div[2]/a[1]/strong")).click();
			
			driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div[3]/div/form/div/div/div[1]/input")).sendKeys("Jannatul.ferdoese@gmail.com	");
			driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div[3]/div/form/div/div/div[2]/input")).sendKeys(oldPw);
			driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div[3]/div/form/div/button")).click();
			softAssert.assertTrue(2 > 3, " Ja is failing");
			softAssert.assertTrue(2 == 2, "Ja is passing");
			
			
			
			
		
			
		
			/*
			
			// Step 3
			driver.findElement(By.xpath("//a[@class='Navigation-icon js-loginLink']")).click();
			driver.findElement(By.xpath("/html/body/main/header/div/div/nav[3]/ul/li[7]/a")).click();
			String actualId = driver.findElement(By.xpath("//*[@class=\"Card-text\"]")).getText();
			System.out.println(actualId);
			Assert.assertEquals(actualId, expectedID);
			System.out.println(oldPw + " -- " + newPw);
			*/
		}

		private char[] readvalue(String string, String string2) {
			
			return null;
		}

		private void copyData(String string) {
			

		}

		
		
		
      
     
      
     @BeforeTest
     public void launchBrowser() {
    	 System.out.println("lanching firefox browser");
    	 System.setProperty("webdriver.gecko.driver", "C:\\Software\\Drivers\\geckodriver.exe");
    	 driver = new FirefoxDriver();
    	// driver.get(baseurl);
    	 
     }
     
   //  @Test
     public void verifyHomePageTitle() 
     {
    	 //driver.get(baseurl);
         String expectedTitle = " För gamers och teknikentusiaster ";
         String actualTitle = driver.getTitle();
         Assert.assertEquals(actualTitle, expectedTitle);
         driver.close();
    	
    	 
     }
     @AfterTest
     public void pageTest() {
    	 
     }
     
   //  @Test
     public void verifylogin() {
    	 driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div/div[2]/a[2]"));
    	 System.out.println(driver.findElement(By.xpath("//*[@id=\"main-header\"]/div/div/div[3]/div/div/div[2]/a[2]")));
    	 
    	 
    	 
     }
     
}
