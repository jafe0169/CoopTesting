import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NormalTestNGWork {
	@Test
	public void doLogin() {
		String browser="Chrome";
		String expTitle="Rediffmail";
		
		WebDriver driver = null;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		 else if (browser.equals("Mozila")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("InternetExplorerDriver")) {
			driver = new InternetExplorerDriver();

		}

		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String actulTittle= driver.getTitle();
		
		Assert.assertEquals(actulTittle, expTitle);
		
		
		driver.quit();
		
		
		
	}

}
