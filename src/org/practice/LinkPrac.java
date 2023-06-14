package org.practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPrac {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.navigate().to("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img")).click();
	
	WebElement homepagelink = driver.findElement(By.linkText("Go to Home Page"));
	homepagelink.click();
	
	driver.navigate().back();
	
	WebElement wheretogo = driver.findElement(By.partialLinkText("Find where"));
	String attribute = wheretogo.getAttribute("href");
	System.out.println(attribute);
	
	WebElement verifybroken = driver.findElement(By.linkText("Verify am I broken?"));
	verifybroken.click();
	
	String title = driver.getTitle();
	if (title.contains("404")) {
		System.out.println("broken");
	}
	driver.navigate().back();
	
	WebElement homepagelink1 = driver.findElement(By.linkText("Go to Home Page"));
	homepagelink1.click();
	System.out.println("Go to Home Page successfully done");
	driver.navigate().back();

	
	List<WebElement> countoflinks = driver.findElements(By.tagName("a"));
	System.out.println(countoflinks.size());
}
}
