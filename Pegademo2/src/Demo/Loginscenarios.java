package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Loginscenarios {

	WebDriver driver;
	String projectPath = System.getProperty("user.dir");
	@BeforeClass
	/*
	public void setup()
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}
	 */
	public void setup()
	{
		System.setProperty("webdriver.edge.driver", projectPath+"/Drivers/msedgedriver.exe");
		driver = new EdgeDriver();
	}
	@Test
	public void launch_app() throws Exception
	{
		driver.get("https://pega-86-demo.iqzsystems.io/prweb/app/default/b0aUC_g2NnC90uEC3dhEbKXJdQTMkXeP*/!STANDARD");
		Thread.sleep(10000);
	}

	@Test (dependsOnMethods = "launch_app")
	public void enter_user() throws Exception
	{
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUserID']"));
		username.sendKeys("tcapron");
		Thread.sleep(5000);
	}

	@Test (dependsOnMethods = "enter_user")
	public void enter_pswd() throws Exception
	{
		WebElement password = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		password.sendKeys("Password@123");
		Thread.sleep(5000);
	}

	@Test (dependsOnMethods = "enter_pswd")
	public void clicklogin() throws Exception
	{
		WebElement loginbutton = driver.findElement(By.xpath("//button[@id='sub']"));
		loginbutton.click();
		Thread.sleep(5000);
	}

	@Test (dependsOnMethods = "clicklogin")
	public void get_title() throws Exception
	{
		System.out.println("Page title is : " + driver.getTitle());
		Thread.sleep(5000);
	}

	@AfterClass
	public void finish()
	{
		driver.quit();
		System.out.println("Test is successful");
	}
	
}
