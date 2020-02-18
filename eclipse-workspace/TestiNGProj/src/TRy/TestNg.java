package TRy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNg {
	public WebDriver ed=null;
	public String temp="";
	
	@Test(priority=0)
	   public void DoLogIn() {
			System.out.println("Testing login ");
			String browser = "Chrome"; // XLS; XML
			// ************Without concept of Driver Interface************
			if (browser.equals("Mozila")) {
				FirefoxDriver fd = new FirefoxDriver();
				fd.get("https://www.coop.se/");
				// click
			} else if (browser.equals("Chrome")) {
				ChromeDriver cd = new ChromeDriver();
				cd.get("https://www.coop.se/");
				// click
			} else if (browser.equals("IE")) {
				InternetExplorerDriver ie = new InternetExplorerDriver();
				ie.get("https://www.coop.se/");
			} else if (browser.equals("edge")) {
				EdgeDriver ed = new EdgeDriver();
				//Step 1
				ed.get("https://www.coop.se/");
				System.out.println(ed.getTitle());
				String expectedId="";
				String actualText=ed.getTitle();
				Assert.assertEquals(actualText, expectedId);
				//Step 2
				ed.findElement(By.xpath("/html/body/main/header/div/div/nav[2]/ul/li[1]/a/span")).click();
				ed.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("jannatul.ferdoese@gmail.com");
				ed.findElement(By.xpath("//*[@id=\"loginPassword\"]")).sendKeys("ApuChowdhury80");
				ed.findElement(By.xpath("/html/body/main/div[3]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[2]/div/div[2]/span")).click();				
				Assert.assertTrue(2>3,"hello");
				SoftAssert softassert=new SoftAssert();
				softassert.assertTrue(2>3);
				softassert.assertTrue(2==2);
				//step3
				
				
				 ed.findElement(By.xpath("//a[@class=\"Navigation-icon js-loginLink\"]")).click();
				 ed.findElement(By.xpath("/html/body/main/header/div/div/nav[3]/ul/li[7]/a")).click();
				 String actualId = ed.findElement(By.xpath("//*[@class=\"Card-text\"]")).getText();
				System.out.println(actualId);
				Assert.assertEquals(actualId, expectedId);
				softassert.assertAll();
			
				//ed.quit();
				
				
	   }
			}
	 @Test(priority=1)
   public void Password() {
		System.out.println("Testing  password");
   }
   @Test(priority=2)
   public void ChangePassword() {
	   
		System.out.println("Testing login test change password");
		ed.findElement(By.xpath("//*[@class=\"Card-text u-textSmall u-colorGreen\"]")).click();
		ed.findElement(By.xpath("//*[@id=\"OldPassword\"]")).sendKeys("ApuChowdhury80");
		ed.findElement(By.xpath("/html/body/main/div[2]/div/form/div[2]/input")).sendKeys("hello");
		ed.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("hello");
		ed.findElement(By.xpath("/html/body/main/div[2]/div/form/button")).click();
		
		
		/*String temp ="";
		tem=oldpw;
		newPw=temp;
		
		*/
	
   
  }
   @BeforeTest
        public void testDataMgmt() {
	   System.out.println("Excuting Before Test");
   }
   
   @AfterTest
      public void testLogoinReport () {
	   System.out.println("Excuting after Test");
	   
   }
   @BeforeMethod
   public void alllogin() {
	   
   }
   @AfterMethod
   public void alllogout() {
	   ed.quit();
	   
	   
   }
   
   

}

