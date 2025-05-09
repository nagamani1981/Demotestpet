package Demo.TestComponents;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import Demo.pageobjects.LandingPage;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;



public class BaseTest {
	
		public  WebDriver driver;
		public Properties prop;
		public LandingPage landing;
	public WebDriver initializeDriver() throws IOException
	{
		
	 prop= new Properties();
	FileInputStream fis=new FileInputStream(System.getProperty("user.dir")
			+"/src//main//java//Demo//resources//GlobalData.properties");

	prop.load(fis);
	String browserName=prop.getProperty("browser");
	System.out.println(browserName);

	if(browserName.equals("edge"))
	{
		WebDriverManager.edgedriver().setup();
		  driver = new EdgeDriver();
			//execute in chrome driver
		
	}
	else if (browserName.equals("firefox"))
	{
		WebDriverManager.firefoxdriver().setup();
		 driver= new FirefoxDriver();
		
	}
	else if (browserName.equals("chrome"))
	{
		//WebDriverManager.chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	}

	driver.manage().window().maximize();

	return driver;


	}
	@BeforeMethod
	public LandingPage launchApplication() throws IOException
	{
		driver=initializeDriver();
		landing=new LandingPage(driver);
		//landing.launchURL();
		landing.launchURL();
		
		return landing;
	}
	
	@AfterMethod
	public void teardown()
	{
		//driver.close();
	}

	public String getScreenShot(String testCaseName, WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		File file= new File(System.getProperty("user.dir")+"//reports//"+testCaseName+".png");
		FileUtils.copyFile(source,file);
		return System.getProperty("user.dir")+"//reports//"+testCaseName+".png";


	}

	}



