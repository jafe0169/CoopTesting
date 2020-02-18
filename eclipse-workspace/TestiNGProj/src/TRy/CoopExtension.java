package TRy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.util.Properties;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CoopExtension {
	public WebDriver driver = null;
	
	
	public void captureScrShot(String testRef) throws IOException {
		  
		  String refPath = System.getProperty("user.dir") + "\\scrShot"; // String
		  refPath="scrShot"; File file = new File(refPath); if (!file.exists()) { if
		  (file.mkdirs()) { System.out.println("Directory is created! at " + refPath);
		  } else { System.out.println("Failed to create directory!"); } } else {
		  System.out.println("Folder already exist at " + refPath);
		  
		  } String scrShotFile = refPath + "\\" + testRef + ".png"; file = new
		  File(scrShotFile); file.createNewFile(); File scrShotDesired =
		  ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(scrShotDesired, file); }
	
	
	

		public void printDataToConsole() throws IOException {
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
		public void dataCountToConsole() throws IOException
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
	       	 path = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
	   		System.out.println("Reading file from "+path);
	   		
	   		FileReader file=new FileReader(path); 
	   		BufferedReader reader = new BufferedReader(file);
	   		String text = "";
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
		
		
		public String readValue(String dataFilePath, String Var) throws IOException {	
			String dataPath=System.getProperty("user.dir")+ "\\savedUserInfo\\password.txt";	
		//	dataFilePath = dataPath + "\\" + "password.txt";
			System.out.println(dataPath);
			FileReader reader = new FileReader(dataPath);
			BufferedReader bfr = new BufferedReader(reader);
			String[] words = null;
			String x ="";
			while ((x= bfr.readLine())!=null)
			{
				words = x.split(" = ");
				if (words[0].equals(Var)) {
					return words[1];
				}
			}
			return "! Error ! ";
		}
}
		
		
		
		
		
	

	/*	
		public  void readValue(String datapath,String var) throws IOException { // This function searches the text for the    string
			datapath = System.getProperty("user.dir") + "\\savedUserInfo\\password.txt";
         File file1 = new File("datapath");
            System.out.println("Reading file from "+datapath);
           // FileReader file=new FileReader(datapath); 
            BufferedReader read=new BufferedReader(new FileReader(file1));
           String st;
          
           while ((st = read.readLine()) != null) 
             System.out.println(st); 
           } 
}
*/
           
	
            
     
   
   

            
		    

		   

		   
		  
		  
		
		
	

			
		
