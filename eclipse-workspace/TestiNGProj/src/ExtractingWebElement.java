
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;

//import TRy.test;

public class ExtractingWebElement {
	public static void main(String[] args) throws InterruptedException {
		String browser = "Chrome";

		WebDriver driver = null;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Mozila")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("InternetExplorerDriver")) {
			driver = new InternetExplorerDriver();

		}

		// driver.manage().timeouts().implicitlyWait(20, TimeUnit:Secound)
		driver.get("https://edition.cnn.com/");
		// String actulTittle= driver.getTitle();

		// Assert.assertEquals(actulTittle, expTitle);
		/*
		 * List<WebElement> allLinks= driver.findElements(By.xpath("//a")); int
		 * totalnumberOfLinks=allLinks.size();
		 * System.out.println(totalnumberOfLinks+"result");
		 * 
		 * //getting one special link based on index WebElement
		 * tentLink=allLinks.get(9); System.out.println(tentLink.getText());
		 * System.out.println(tentLink.getLocation());
		 * 
		 * //getting all links for(int i=0;i<allLinks.size();i++) {
		 * System.out.println(allLinks.get(i).getLocation().x
		 * +"-"+allLinks.get(i).getLocation().y+
		 * "displayOnpage:="+allLinks.get(i).isDisplayed()+"interact :"+
		 * allLinks.get(i).isEnabled()); }
		 * 
		 * for(WebElement w:allLinks) {
		 * System.out.println("displayOnpage:="+w.isDisplayed());
		 * 
		 * }
		 
		// getting all around
		// List<WebElement> allLinksNew = driver.findElements(By.tagName("cn__title "));

		List<WebElement> allLinksNew = driver.findElements(
				By.tagName("//*[@id=\"intl_homepage1-zone-2\"]/div[5]/div/div[1]/ul/li[1]/article/div/div[2]/h3"));
		int totalnumberOfLinks1 = allLinksNew.size();
		// System.out.println(((WebElement) totalnumberOfLink1.getText());
		// System.out.println(((WebElement) allLinksNew.getLocation());
		System.out.println(totalnumberOfLinks1);
		for (int j = 0; j < allLinksNew.size(); j++) {
			System.out.println(allLinksNew.get(j));
		}
		//*[@id="intl_homepage1-zone-2"]/div[5]/div/div[1]/ul
		*/
		
		WebElement boxAroundTheWorld=driver.findElement(By.xpath("//*[@id=\"intl_homepage1-zone-2\"]/div[5]/div/div[1]"));
		List<WebElement> desiredLinks = driver.findElements(By.tagName("a"));
		System.out.println(desiredLinks);
		for (int j = 0; j < desiredLinks.size(); j++) {
			System.out.println(j +")"+desiredLinks.get(j).getText());
		

		//driver.quit();

	}
	}
	}
