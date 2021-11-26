package Demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterClass;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Parameters;
	import org.testng.annotations.Test;
	
public class Browser_scroll
	{ 
		WebDriver driver = null;
		String projectPath = System.getProperty("user.dir"); 
		@Parameters("browserName")
		
		@BeforeTest
		public void setup(String browserName) 
		{
			System.out.println("Browser name is : " + browserName);
			System.out.println("Thread ID : "+ Thread.currentThread().getId()); 
		if 	(browserName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} 
		else if (browserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", projectPath+"/Drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
		}
		@Test
		public void LaunchUrl() throws Exception 
		{
			driver.get("https://freecrm.com/");
			Thread.sleep(5000);
		}
		
		@Test(dependsOnMethods="LaunchUrl")
		public void twitterlaunch() throws InterruptedException 
		{
			WebElement element = driver.findElement(By.xpath("//a[@href='https://twitter.com/cogmento']"));
			element.click();
			
		}
		@Test(dependsOnMethods="twitterlaunch")
		public void facebooklaunch() throws InterruptedException
		{
			WebElement element = driver.findElement(By.xpath("//a[@href='https://www.facebook.com/cogmento']"));
			element.click();
			
		}
		@Test(dependsOnMethods="facebooklaunch")
		public void youtubelaunch() throws InterruptedException 
		{
			WebElement element = driver.findElement(By.xpath("//a[@href='https://youtu.be/ow44nHQPMJw']"));
			element.click();
			
		}
		@Test (dependsOnMethods = "youtubelaunch")
		public void get_title() throws Exception
		{
			System.out.println("Page title is : " + driver.getTitle());
			
		}
		@AfterClass
		public void finish()
		{
			driver.close();
			System.out.println("Test is successful");
		}
	}

