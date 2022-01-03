package windows_Auth;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class windows_auth_popup {
	public static void main(String[] args) {
		WebDriver driver = null;
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("http://the-internet.herokuapp.com/digest_auth");
		driver.get("http://admin:admin@the-internet.herokuapp.com/digest_auth");
	}
}