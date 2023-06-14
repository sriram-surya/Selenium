package org.practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UplodeFile {
public static void main(String[] args) throws AWTException, InterruptedException {
	

	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\sha\\eclipse-workspace 2\\SeleniumPractice\\drivers\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://www.leafground.com/");
	
	driver.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[19]/a/img")).click();
	
	
	
	Thread.sleep(3000);
	
	StringSelection s = new StringSelection("C:\\Users\\sha\\Downloads\\L diagram");
	
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
	
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyRelease(KeyEvent.VK_ENTER);




	
}
}
