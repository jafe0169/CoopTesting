import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class NewExtract {
	

	public static void main(String[] args) {
String browser="Chrome";
		
		WebDriver driver = null;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		 else if (browser.equals("Mozila")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("InternetExplorerDriver")) {
			driver = new InternetExplorerDriver();

		}
		driver.get("https://edition.cnn.com/?refresh=1");
		List<WebElement> allLinks = driver.findElements(By.xpath("//*[@id=\"intl_homepage1-zone-2\"]/div[5]/div/div[1]/ul"));
		int totalNumberOfLinks = allLinks.size();
		System.out.println(totalNumberOfLinks);
		// getting one special link based on index
		WebElement tenthLink = allLinks.get(15);
		System.out.println(tenthLink.getText());
		System.out.println(tenthLink.getLocation().x + " - " + tenthLink.getLocation().y);
//		tenthLink.click();
//		WebElement fifteenthLink = allLinks.get(15);
//		fifteenthLink.click();
//		
		// getting all links
		for(int i=0; i< allLinks.size(); i++) {
			System.out.println(i + ") " + allLinks.get(i).getLocation().x +
					" - " + allLinks.get(i).getLocation().y +
					" displayedOnPage? :- " + allLinks.get(i).isDisplayed() +
					" interact :- " +allLinks.get(i).isEnabled());
		}
		for(WebElement w: allLinks) {
			System.out.println(" displayedOnPage? :- " + w.isDisplayed());
		}
			
	}

}
