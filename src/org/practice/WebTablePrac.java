package org.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePrac {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.guru99.com/test/write-xpath-table.html");
	
	List<WebElement> Webtable = driver.findElements(By.tagName("td"));
	System.out.println(Webtable.size());
	
	for (WebElement x : Webtable) {
		System.out.println( x.getText());
	}
	
	List<WebElement> firstrow = driver.findElements (By.tagName("tr"));
	
	for (WebElement i : firstrow) {
		System.out.println(i.getText());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
//	driver.navigate().to("http://www.leafground.com/");
//	
//	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[8]/a/img")).click();
//	
//	List<WebElement> rowscount = driver.findElements(By.tagName("tr"));
//	System.out.println(rowscount.size());
//	
//	List<WebElement> columncount = driver.findElements(By.tagName("th"));
//	System.out.println(columncount.size());
//	
//	List<WebElement> process = driver.findElements(By.xpath
//			("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
//	for (WebElement x : process) {
//		System.out.println(x.getText());
//		
//	}
//	
//	List<WebElement> td2 = driver.findElements(By.xpath("//td[2]"));
//	List<Integer> li = new ArrayList<>();
//	for (WebElement y : td2) {
//		String text = y.getText().replace("%", "");
//		li.add(Integer.parseInt(text));
//	}
//	System.out.println(li);
//	Integer min = Collections.min(li);
//	System.out.println(min);
//	String stringvalue = Integer.toString(min)+"%";
//	
//	//td[normalize-space()='Learn to interact with Elements']//following::td[1]
//	String finalvalue ="//td[normalize-space()="+"\""+ stringvalue +"\""+"]"+"//following::td[1]";
//	WebElement getvalue = driver.findElement(By.xpath(finalvalue));
//	getvalue.click();
//	
	
}
}
