package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import test.utilities.Readconfie;

public class BaseTest {
	
	Readconfie rc = new Readconfie();
	
	public String baseUrl= rc.getApplicationUrl();
	public String Username =rc.getUsername();
	public String password =rc.getpassword();
	public static WebDriver driver;
	public static Logger logger;
	
	//public Properties prop;
	
	@Parameters("browser")
	@BeforeClass
	
	public void setup(String br) throws IOException {
		

		 logger = Logger.getLogger("HybridFramework1");
		 PropertyConfigurator.configure("Log4j.properties");

		
			if(br.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",rc.getchromepath());
				driver=new ChromeDriver();
			}
			
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver",rc.getfirefoxpath());
				driver = new FirefoxDriver();
			}
			
			driver.get(baseUrl);
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
			
			
	
	
	

	@AfterTest
	public void teardown() {
		
		driver.close();
		
	}


	public String getScreenshotPath(String TestCaseName, WebDriver driver) throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destpath = System.getProperty("user.dir") + "\\Reports\\" + TestCaseName + ".png";

		File file = new File(destpath);
		FileUtils.copyFile(source, file);

		return destpath;


	}
	
	
	

}
