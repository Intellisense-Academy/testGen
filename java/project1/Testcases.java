package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcases extends Baseclass {

	@Test(priority = 1, description = "valid username and Invalid password")

	public void test1() throws InterruptedException {

		// Enter the username
		WebElement fn = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		fn.sendKeys("riyaz@rabiyat.fusion");

		// Enter the password
		WebElement psw = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		psw.sendKeys("fusion123");

		// Click on the Login button
		WebElement login = driver.findElement(By.xpath("//button[@class='login-button']"));
		login.click();

		// Add validation to check for error message
		String errorMessage = driver.findElement(By.xpath("//span[text()='Incorrect Password !']")).getText();
		Assert.assertEquals(errorMessage, "Incorrect Password !", "Error message mismatch.");

		// print Error message
		WebElement incorrectPassword = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		System.out.println("Alert Message : " + incorrectPassword.getText());
		// Thread.sleep(2000);
		fn.clear();
		psw.clear();
	}

	@Test(priority = 2, description = "Invalid username and valid password ")

	public void test2() throws InterruptedException {

		// Enter the username
		WebElement fn = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		fn.sendKeys("riyaz@rabiyat1231.fusion");

		// Enter the password
		WebElement psw = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		psw.sendKeys("fusion");

		// click on login button
		WebElement logout = driver.findElement(By.className("login-button"));
		logout.click();
		// Thread.sleep(500);

		// Add validation to check for error message
		String userDoesNot1 = driver.findElement(By.xpath("//span[text()='User does not Exist']")).getText();
		Assert.assertEquals(userDoesNot1, "User does not Exist", "Error message mismatch.");

		// print the error message
		WebElement userDoesNot = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		System.out.println("Alert Message : " + userDoesNot.getText());

		fn.clear();
		psw.clear();
	}

	@Test(priority = 3, description = "Invalid username and Invalid password ")

	public void test3() throws InterruptedException {

		// Enter the username
		WebElement fn = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		fn.sendKeys("riyaz@rabiyat321.fusion");

		// Enter the password
		WebElement psw = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		psw.sendKeys("apple123");

		// Click on the Login button
		WebElement login1 = driver.findElement(By.xpath("//button[@type='submit']"));
		login1.click();
		// Thread.sleep(500);

		String userDoesNot = driver.findElement(By.xpath("//span[text()='User does not Exist']")).getText();
		Assert.assertEquals(userDoesNot, "User does not Exist", "Error message mismatch.");

		WebElement userDoesNot1 = driver.findElement(By.xpath("//span[@class='ng-star-inserted']"));
		System.out.println("Alert Message : " + userDoesNot1.getText());
		fn.clear();
		psw.clear();
	}

	@Test(priority = 4, description = "valid username and valid password ")

	public void test4() throws InterruptedException {
		// valid username and valid password

		// Enter the username
		WebElement fn = driver.findElement(By.xpath("//input[@formcontrolname='username']"));
		fn.sendKeys("riyaz@rabiyat.fusion");

		// Enter the password
		WebElement psw = driver.findElement(By.xpath("//input[@formcontrolname='password']"));
		psw.sendKeys("fusion");

		// Click on the Login button
		WebElement login = driver.findElement(By.xpath("//button[@class='login-button']"));
		login.click();

		// Thread.sleep(12000);

		// Add validation to ensure login was successful
		String expectedUrl1 = driver.findElement(By.id("dashboard-tab")).getText();
		Assert.assertEquals(expectedUrl1, "Dashboards", "Error message mismatch.");

		// Print the Title
		System.out.println("Login Page : " + expectedUrl1);

	}

	@Test(priority = 5, description = "logout for valid inputs")

	public void test5() throws InterruptedException {
		// logout for valid inputs
		// Click on the Logout button
		WebElement b1 = driver.findElement(By.xpath("//div[@class='hover-base ng-star-inserted']//p[1]"));
		Actions opt = new Actions(driver);
		opt.moveToElement(b1).perform();

		WebElement logout = driver.findElement(By.xpath("//span[text()='Log Out']"));
		logout.click();

		String welcomepage = driver.findElement(By.xpath("//p[text()='Welcome, Please login into your account']"))
				.getText();
		System.out.println("Logout page : " + welcomepage);

	}
}
