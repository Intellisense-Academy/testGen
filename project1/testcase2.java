package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testcase2 {
	@Test
	public  void runloginout2() throws InterruptedException {
		//Launch the browser.

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//Load the URL
		driver.get("https://dev.valarhr.com/");
		
		//Enter the username
		WebElement fn = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		fn.sendKeys("riyaz@rabiyat123.fusion");
		
		//Enter the password
		WebElement psw = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		psw.sendKeys("fusion");
		
		//Click on the Login button
		WebElement login = driver.findElement(By.xpath("//button[@class='login-button']"));
		login.click();
		
		//Print the Title
		System.out.println("Title Name : "+driver.getTitle());
		
		
		//Click on the Logout button
		WebElement b1 = driver.findElement(By.xpath("//div[@class='hover-base ng-star-inserted']//p[1]"));
		Actions opt = new Actions(driver);
		opt.moveToElement(b1).perform();
		
		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();
		
		driver.close();
		
}

}
