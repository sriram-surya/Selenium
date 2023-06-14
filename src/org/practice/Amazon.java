package org.practice;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.amazon.in/");
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone");
	
	
	driver.findElement(By.id("nav-search-submit-button")).click();
	
	List<WebElement> title = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
	List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
for (int i = 0; i < title.size(); i++) {
	
	
}
}
}