package test;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;

@ExtendWith(ParameterProviderExample.class)
public class ChromeDriverParameter {
	
	@Test
	public void LoginTest(ChromeDriver driver) {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver.get("https://www.simplilearn.com/");
		
	}

}
