package project1;

import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Baseclass{
	public ChromeDriver driver;
	@BeforeTest
	public  void precondition() throws InterruptedException {
		//Launch the browser.

		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Load the URL
				driver.get("https://dev.valarhr.com/");
				
			
}
	
	@AfterTest
	public void postcondition() {
		
		 
	driver.quit();
}

}