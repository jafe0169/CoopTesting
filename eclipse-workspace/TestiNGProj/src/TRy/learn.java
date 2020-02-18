package TRy;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class learn {
	public WebDriver driver = null;
	public String oldPw = "Coop202011";
	public String newPw = "Coop2020";
	public String temp = "";
	SoftAssert softAssert = new SoftAssert();

	@Test(priority = 1)
	public void doLogin() throws InterruptedException, IOException {
		System.out.println("Testing login test");
		String expectedResult = "Coop | Sveriges grönaste matkedja";
		String expectedID = "jensen2020@gmail.com";
		// Step 1
		driver.get("https://www.coop.se");
		String actualResult = driver.getTitle();
		Assert.assertEquals(actualResult, expectedResult);
		// step 2
		driver.findElement(By.xpath("//*[@class=\"Navigation-info\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginEmail\"]")).sendKeys("jensen2020@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginPassword\"]")).sendKeys(oldPw);
		driver.findElement(By.xpath("//*[@class=\"Button Button--green js-submit\"]")).click();
		softAssert.assertTrue(2 > 3, " Ja is failing");
		// captureScrShot("scrShotName1");
		// copyData("file,datafile");
		softAssert.assertTrue(2 == 2, "Ja is passing");
		// captureScrShot("scrShotName2");
		CoopExtension read=new CoopExtension();
		read.readFile();
		CoopExtension  str=new CoopExtension();
		str.Findstr();
		//readFile();
		//count();
		//readvalue(( System.getProperty("user.dir") + "\\savedUserInfo\\password.txt"));
		readvalue("path","old");
		System.out.println(readvalue("path"," newPw "));
		//boolean isVariablePresent = isVarPresnt( System.getProperty("user.dir") + "\\savedUserInfo\\password.txt", "old");
		//System.out.println("Variable old present ="+isVariablePresent);
		// Thread.sleep(2000);
		// Step 3
		driver.findElement(By.xpath("//a[@class='Navigation-icon js-loginLink']")).click();
		driver.findElement(By.xpath("/html/body/main/header/div/div/nav[3]/ul/li[7]/a")).click();
		String actualId = driver.findElement(By.xpath("//*[@class=\"Card-text\"]")).getText();
		System.out.println(actualId);
		Assert.assertEquals(actualId, expectedID);
		System.out.println(oldPw + " -- " + newPw);
	}

	private void copyData(String string) {
		// TODO Auto-generated method stub

	}

	@AfterTest
	public void testPostCondition() {
		softAssert.assertAll();
		driver.quit();
	}

	@BeforeTest
	public void testPreCondition() {
		System.out.println("Loading preconditions");
		String browser = "Chrome";
		if (browser == "FireFox") {
			driver = new FirefoxDriver();
		} else if (browser == "Chrome") {
			driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(priority = 2, dependsOnMethods = { "doLogin" })
	public void changePassword() throws IOException {
		System.out.println("Change password test");
		driver.findElement(By.xpath("//*[@class=\"Card-text u-textSmall u-colorGreen\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"OldPassword\"]")).sendKeys(oldPw);
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys(newPw);
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys(newPw);
		driver.findElement(By.xpath("//button[text()='Ändra']")).click();
		// captureSecrenShot("scrShotName3");
		
		swap();
	}

	@Test(priority = 3, dependsOnMethods = { "doLogin" })
	public void doLogout() {
		System.out.println("Logout test");
		System.out.println(oldPw + " -- " + newPw);
	}

	public void swap() {
		temp = oldPw;
		oldPw = newPw;
		newPw = temp;
		System.out.println(oldPw + " -- " + newPw);
	}
}
