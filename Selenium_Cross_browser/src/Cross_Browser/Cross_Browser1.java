package Cross_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser1 {
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	
	@Parameters("browser")
	@BeforeTest
	public void setup(String browserN)
	{
		if (browserN.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			} 
		else if (browserN.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", projectPath+"/Drivers/msedgedriver.exe");
			driver = new EdgeDriver();
			}
	}
	
		@Test
		public void testgoogle() throws Exception
		{
			driver.get("https://google.com");
			Thread.sleep(10000);
		}
		
		@Test
		public void testyahoo() throws Exception
		{
			driver.get("https://yahoo.com");
			Thread.sleep(10000);
		}
		
	@AfterTest
	public void finish() {
	driver.quit();
	System.out.println("Test run is successful");
	} 
}