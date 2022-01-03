package Cross_Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Test{
	String projectPath = System.getProperty("user.dir");
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", projectPath+"/driver/chromedriver.exe");
		driver = new ChromeDriver();
	}
		@Test
		public void testgoogle() throws Exception
		{
			driver.get("https://google.com");
			Thread.sleep(10000);
		}
		

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