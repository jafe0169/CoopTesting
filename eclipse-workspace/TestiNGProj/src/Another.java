import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Another {

	public static void main(String[] args)throws InterruptedException {
		
		String browser = "Mozila";

		WebDriver driver = null;
		if (browser.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("Mozila")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("InternetExplorerDriver")) {
			driver = new InternetExplorerDriver();
			
	}
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
         driver.get("https://www.americangolf.co.uk");
         driver.manage().window().maximize();
       //  /html/body/div[2]/div[2]/header/nav/div/div[1]
         
         WebElement allLinks= driver.findElement(By.xpath("/html/body/div[2]/div[2]/header/nav/div/div[1]")); 
		 List<WebElement> allLinks1= driver.findElements(By.tagName("a")); 
		 
		 for(int i=0;i<allLinks1.size();i=i+1) {
		        System.out.println(allLinks.getText()) ; //get(i).getText());
		      
				allLinks1.get(i).click();
				 driver.navigate().back();
		 }
		 
		 
		
		 for(WebElement link:allLinks1){
			 System.out.println(link.getText() + " - " );
			 }
		
		 
     driver.quit();

}
}
