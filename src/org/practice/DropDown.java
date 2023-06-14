package org.practice;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.Page.GetAppIdResponse;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/");
		
		driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[5]/a/img")).click();
		
		WebElement dropdown1 = driver.findElement(By.id("dropdown1"));
		dropdown1.click();
		Select s1 = new Select(dropdown1);
		s1.selectByIndex(3);
		System.out.println("d1 sucessful");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/select"));
		dropdown2.click();
		Select s2 = new Select(dropdown2);
		s2.selectByVisibleText("Selenium");
		System.out.println("/nd2 sucessful");

		
		WebElement dropdown3 = driver.findElement(By.id("dropdown3"));
		dropdown3.click();
		Select s3 = new Select(dropdown3);
		s3.selectByValue("2");
		System.out.println("/nd3 sucessful");

		
		WebElement dropdown4 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		dropdown4.click();
		Select s4 = new Select(dropdown4);
		List<WebElement> options = s4.getOptions();
		int size = options.size();
		System.out.println(size);
		System.out.println("d4 sucessful");
		
		

		WebElement dropdown5 = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		dropdown5.sendKeys("Selenium");
		Select s5 = new Select(dropdown5);
		s5.selectByIndex(1);
		System.out.println("/nd5 successfull");

		WebElement multidropdown = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select s = new Select(multidropdown);
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		List<WebElement> opt = s.getOptions();
		int i=1;
		for (WebElement x : opt) {
			System.out.println(i+"."+x.getText());
			i++;
		}
	}
		
		
		
		
	}

