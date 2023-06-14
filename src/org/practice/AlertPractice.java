package org.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[9]/a/img")).click();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button")).click();
		
		Alert a = driver.switchTo().alert();
		a.accept();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button")).click();
		a.dismiss();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button")).click();
		a.sendKeys("surya");
		a.accept();
		
		driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/button")).click();
		String text = a.getText();
		System.out.println(text);
		a.accept();
	}
}
