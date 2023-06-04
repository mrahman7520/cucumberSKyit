package step_definitions;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import base.Base;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Base{
	@Before
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		System.out.println("before run");
	}
	
	@After
	public void tearDown() {
		driver.quit();
		System.out.println("after run");
	}
}
