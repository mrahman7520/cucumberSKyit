package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() throws MalformedURLException {
// 		WebDriverManager.chromedriver().setup();
// 		driver = new ChromeDriver(); 
// 		driver.manage().window().maximize();
// 		System.out.println("before run");
		
         ChromeOptions opt = new ChromeOptions();
		
	 driver = new RemoteWebDriver(new URL("http://3.145.197.131:4444"),opt);
		
	}
	
	@After
	public void tearDown() {
		driver.quit();
		System.out.println("after run");
	}
}
