package org.practice;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.Page.GetAppIdResponse;
import org.openqa.selenium.interactions.Actions;

public class SeleniumParc {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[18]/a/img")).click();
	
	driver.findElement(By.linkText("Download Excel")).click();
	Thread.sleep(3000);
	
//	driver.findElement(By.linkText("Download PDF")).click();
//	Thread.sleep(3000);
//
//	driver.findElement(By.linkText("Download Text")).click();
//	Thread.sleep(3000);
	
	File f = new File("C:\\Users\\sha");
	File[] listFiles = f.listFiles();
	
	for (File x : listFiles) {
		if (x.getName().equals("Download Excel ")) {
			System.out.println("present Download Excel");
		}
//		if (x.getName().equals("Download PDF ")) {
//			System.out.println("present Download PDF");
//		}
//		if (x.getName().equals("download Text ")) {
//			System.out.println("present Download Text");
//		}
		break;
		
	}


	
	
	

//	driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[17]/a/img")).click();
//	
//	Actions a = new Actions (driver);
//	
//	driver.findElement(By.id("tags")).sendKeys("s");
//	
//	 Thread.sleep(5000);
//	 
//	 List<WebElement> li= driver.findElements(By.xpath("//*[@id=\'ui-id-1']/li"));
//	
//	 System.out.println(li.size());
//	 
//	 for (int i = 0; i <li.size(); i++) {
//		System.out.println(li.get(i).getText());
//	}
	 
//	 for (WebElement i : li) {
//		if (i.getText().equals("Web Services")) {
//			i.click();
//			break;
//		}
//	}
	
	
	
	
	
	
	
//	List<WebElement> selectable = driver.findElements(By.xpath("/html/body/div/div/div[2]/div[2]/ol/li"));
//	
//	Actions a = new Actions (driver);
//	
//	a.keyDown(Keys.CONTROL)
//	.click(selectable.get(0))
//	.click(selectable.get(1))
//	.click(selectable.get(2))
//	.click(selectable.get(3))
//	.click(selectable.get(4))
//	.click(selectable.get(5))
//	.click(selectable.get(6))
//	.keyUp(Keys.CONTROL)
//
//	.perform();
//	



	
	
	
	
}
}
