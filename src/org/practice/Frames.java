package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[10]/a/img")).click();
	
	WebElement f1 = driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[1]/iframe"));
	driver.switchTo().frame(f1);
	

	driver.findElement(By.id("Click")).click();
	
	driver.switchTo().defaultContent();
	
	
	WebElement frame = driver.findElement(By.xpath("//*[@id=\'wrapframe\']/iframe"));
	driver.switchTo().frame(1);
	driver.switchTo().frame("frame2");
	
//	WebElement frame2 = driver.findElement(By.xpath("/html/body/iframe"));
//	driver.switchTo().frame(frame2);
	//
	
	driver.findElement(By.id("Click1")).click();
}
}
