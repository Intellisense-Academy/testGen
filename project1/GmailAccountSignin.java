package project1;

import java.time.Duration;


import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailAccountSignin {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	driver.get("https://mail.google.com/");
	WebElement email = driver.findElement(By.name("identifier"));
	email.sendKeys("devi1002venkat@gmail.com");
	WebElement b = driver.findElement(By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]"));
	b.click();

}
}
