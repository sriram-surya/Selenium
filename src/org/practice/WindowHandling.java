package org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Enter;

public class WindowHandling {
	public static void main(String[] args) throws AWTException, InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/ ");
		driver.manage().window().maximize();
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@id=\'inputValEnter\']"));
		searchbox.sendKeys("i phone 7");
		
		WebElement searchbtn = driver.findElement(By.xpath("//*[@id=\'sdHeader\']/div[4]/div[2]/div/div[2]/button/span"));
		searchbtn.click();
		

		
//	driver.get("http://www.leafground.com/");
//	driver.manage().window().maximize();
//	

//	WebElement windowbtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
//	windowbtn.click();
//	
//	driver.findElement(By.id("home")).click();
//	String windowHandle = driver.getWindowHandle();
//	System.out.println(windowHandle);
//	driver.close();
//	
//	driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();
//	driver.getWindowHandles().size();
//	
//	driver.findElement(By.xpath("//*[@id=\"color\"]")).click();
//	Set<String> windowHandles = driver.getWindowHandles();
//	for (String x : windowHandles) {
//		if (windowHandle.equals(windowHandles)) {
//			driver.switchTo().window(windowHandle);
		// }

	}
}
