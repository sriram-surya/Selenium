package org.practice;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioandCheckBoxPractice {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");

	WebDriver driver = new ChromeDriver();

	driver.get("http://www.leafground.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[7]/a/img")).click();
	
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]")).click();
	
	WebElement check = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
	boolean selected = check.isSelected();
	System.out.println(selected);
	
	WebElement op1  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
	
	WebElement op2  = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
	
	if (op1.isSelected()) {
		op1.click();
	}
	if (op2.isSelected()) {
		op2.click();
	}
	
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[1]")).click();
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[2]")).click();
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[3]")).click();
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[4]")).click();
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[5]")).click();
	driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/input[6]")).click();

	


	////*[@id="contentblock"]/section/div[3]/input[2]
	
//	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[6]/a/img")).click();
//	
//	driver.findElement(By.id("yes")).click();
//	
//	WebElement Unchecked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
//	
//	
//	WebElement checked = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
//
//	if (Unchecked.isSelected()) {
//		Unchecked.click();
//		System.out.println("true op1");
//	}
//	
//	if (checked.isSelected()) {
//		checked.click();
//		System.out.println("true op2");
//	}
//	
//	driver.findElement(By.xpath("/html/body/div/div/div[3]/section/div[3]/div/div/input[1]")).click();
}
}
