package org.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonBox {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img")).click();
	
	WebElement position = driver.findElement(By.id("position"));
	Point location = position.getLocation();
	int x = location.x;
	int y = location.y;
	System.out.println("xvalue: " + x);
	System.out.println("yvalue: "+ y);
	
	
	WebElement colorbtn = driver.findElement(By.id("color"));
	String cssValue = colorbtn.getCssValue("/nbackground-color");
	System.out.println(cssValue);
//	String backgroundcolor = Color.fromString(cssValue).asHex();
//	System.out.println(backgroundcolor);
	
	WebElement sizeofthebutton = driver.findElement(By.id("size"));
	int height = sizeofthebutton.getSize().getHeight();
	int width = sizeofthebutton.getSize().getWidth();
	System.out.println("/nHeight is: "+height+"Width is: "+width);
	
	driver.findElement(By.id("home")).click();
}
}
