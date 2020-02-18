package TRy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.net.PasswordAuthentication;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.omg.CORBA.portable.InputStream;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/*
public class Coop {
	public WebDriver driver = null;
	public String oldPw = "Coop2020";
	public String newPw = "Coop202011";
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
	/*
	 * @Test public void copyData(String dataRef,File srcFile) throws IOException {
	 * String filepath=System.getProperty("user.dir")+"//"+" \\textdata"; File f=new
	 * File(filepath); f.mkdir(); //String textfile=filepath + "//"+ String
	 * Datafilename = filepath + "\\" + dataRef+".txt"; f= new File(Datafilename);
	 * 
	 * File var=new File(filepath); FileUtils.copyFile(srcFile, f);
	 */

	/*
	 * //Utility method //@Test //@Parameters("testRef") public void
	 * captureScrShot(String testRef) throws IOException {
	 * 
	 * String refPath = System.getProperty("user.dir") + "\\scrShot"; // String
	 * refPath="scrShot"; File file = new File(refPath); if (!file.exists()) { if
	 * (file.mkdirs()) { System.out.println("Directory is created! at " + refPath);
	 * } else { System.out.println("Failed to create directory!"); } } else {
	 * System.out.println("Folder already exist at " + refPath);
	 * 
	 * } String scrShotFile = refPath + "\\" + testRef + ".png"; file = new
	 * File(scrShotFile); file.createNewFile(); File scrShotDesired =
	 * ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	 * FileUtils.copyFile(scrShotDesired, file); }
	 */
	/*
	 * public void createFIle() throws IOException { String savePath =
	 * System.getProperty("user.dir") ; File saveLocation = new File(savePath);
	 * if(!saveLocation.exists()){ saveLocation.mkdir(); File myFile = new
	 * File(savePath, "out.txt"); PrintWriter textFileWriter = new PrintWriter(new
	 * FileWriter(myFile)); textFileWriter.write("Hello Java");
	 * textFileWriter.close(); } }
	 */
	/*
	 * public void loadingTestFile(String dataRef, File srcFile) throws IOException
	 * {
	 * 
	 * String dataPath = System.getProperty("user.dir") + "\\password.txt"; File
	 * file = new File(dataPath); file.mkdir(); String textFile = dataPath +
	 * "\\" + ".txt"; file = new File(textFile); FileUtils.copyFile(srcFile, file);
	 * System.out.println("FileUtils.copyFile(srcFile, file)");
	 * 
	 * }
	 */
	/*
	public void readFile() throws IOException {
		String path = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
		System.out.println("Reading file from "+path);
		try {
			File file =new File(path);
    		
    		if(file.exists()){
    			System.out.println("File exist in "+path);
    			FileReader fr = new FileReader(path);
    			BufferedReader br = new BufferedReader(fr);
    			String line = br.readLine();
    			while (line != null) {
    				System.out.println(line);
    				line = br.readLine();
    			}
    			br.close();
    		}else {
    			System.out.println("File doesn't exist in "+path);

    		}
			
		} catch (Exception ex) {

		}
	}
	*/

	
	public void count() throws IOException
	    {	
		String path = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
		System.out.println("Reading file from "+path);
	    	
	    	try{
	    		
	    		File file =new File(path);
	    		
	    		if(file.exists()){
	    			
	    		    FileReader fr = new FileReader(file);
	    		    LineNumberReader lnr1 = new LineNumberReader(fr);
	    		    
	    		    int linenumber = 0;
	    		    
	    	            while (lnr1.readLine() != null){
	    	        	linenumber++;
	    	            }
	    	 
	    	            System.out.println("Total number of lines : " + linenumber);
	    	 
	    	            lnr1.close();
	    	        
	    		     
	    		}else{
	    			 System.out.println("File does not exists!");
	    		}
	    		
	    	}catch(IOException e){
	    		e.printStackTrace();
	    	}
		
}
	


		public boolean isVarPresnt(String path, String var) throws IOException{
        	 //path = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
    		System.out.println("Reading file from "+path);
    		
    		FileReader file=new FileReader(path); 
    		BufferedReader reader = new BufferedReader(file);
    		//String text = "";
    		  String line = reader.readLine();
    		  while (line != null)
    		  {
    		   
    		  if(line.startsWith(var)) {
    		    	reader.close();
    		    	return true;
    		    }
    		     line = reader.readLine();

    		    
    		  }
    		  reader.close();
    		  return false;
    		  
		
      

}
		
		public String readvalue(String path, String var) throws IOException{
			path = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
    		System.out.println("Reading file from "+path);
    		
    		File copyFile = new File(path);
			String[] words ; //Array
			FileReader r = new FileReader(copyFile);
			BufferedReader bfr = new BufferedReader(r);
			String s = "";
			while ((s=bfr.readLine())!= null) {
			words=s.split(" ");
			if (words[0].equals(var)) {
				return words[2];
    		
    		
			}}
			return s;}
	}
	
*/
	
        
    