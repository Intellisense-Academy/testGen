package project1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GmailAccountSignout {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://mail.google.com/");
		WebElement b = driver.findElement(By.xpath("//span[text()='Create account']"));
		b.click();
		WebElement b1 = driver.findElement(By.xpath("//span[text()='For my personal use']"));
		b1.click();
		WebElement fn = driver.findElement(By.name("firstName"));
				fn.sendKeys("Bhavanni");
				WebElement ln = driver.findElement(By.name("lastName"));
				ln.sendKeys("Venkat");
				
				WebElement nb = driver.findElement(By.xpath("//span[text()='Next']"));
				nb.click();
				
				WebElement Month = driver.findElement(By.id("month"));
				Select dropdown1 = new Select(Month);
				dropdown1.selectByIndex(6);
				
				WebElement Day = driver.findElement(By.id("day"));
				Day.sendKeys("15");
				
				WebElement Year = driver.findElement(By.id("year"));
				Year.sendKeys("1998");
				
				WebElement gender = driver.findElement(By.id("gender"));
				Select dropdown2 = new Select(gender);
				dropdown2.selectByIndex(1);
				
				WebElement nb11 = driver.findElement(By.xpath("//span[text()='Next']"));
				nb11.click();
	
		
				
				WebElement r1 = driver.findElement(By.xpath("(//div[@class='t5nRo Id5V1'])[3]"));
				driver.executeScript("arguments[0].click();", r1);
				
		      
				WebElement eid = driver.findElement(By.xpath("//input[@name='Username']"));
				eid.sendKeys("bhavannivenkat32");
				Thread.sleep(500);
		       WebElement nb2 = driver.findElement(By.xpath("//span[text()='Next']"));
		       nb2.click();
		       
		       WebElement psw = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		       psw.sendKeys("Bhavavenkat@321");
		       Thread.sleep(500);
		       WebElement psw1 = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
		       psw1.sendKeys("Bhavavenkat@321");
		       Thread.sleep(500);
		       WebElement nb4 = driver.findElement(By.xpath("//span[text()='Next']"));
				nb4.click();
				Thread.sleep(500);
				WebElement num = driver.findElement(By.xpath("//input[@id='phoneNumberId']"));
				num.sendKeys("9094851159");
				Thread.sleep(500);
				WebElement next = driver.findElement(By.xpath("//span[text()='Next']"));
		     	driver.executeScript("arguments[0].click();",next);
		     	
				
	}
}