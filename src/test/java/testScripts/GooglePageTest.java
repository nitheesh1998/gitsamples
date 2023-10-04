package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GooglePageTest {

	public static void main(String[] args) {
//		ChromeOptions options = new ChromeOptions();
//		options.setBrowserVersion("113");
//		WebDriver driver = new ChromeDriver(options);
		
		WebDriver driver= new ChromeDriver();
//		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.google.com/");
//		WebElement srcBox = driver.findElement(By.id("APjFqb"));
		WebElement srcBox = driver.findElement(By.name("q"));
		srcBox.sendKeys("Java Tutorial");
		srcBox.sendKeys(Keys.ENTER);
		String strTitle = driver.getTitle();
		System.out.println("Page Title : ....."+ strTitle);
		
		driver.navigate().back();
	
		System.out.println("URL....."+ driver.getCurrentUrl());
		System.out.println("Page Title after back : ....."+ driver.getTitle());
		driver.navigate().forward();
	}
}
