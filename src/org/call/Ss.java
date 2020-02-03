package org.call;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ss {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Chaitanya\\eclipse-workspace\\ScreenShot\\Library\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("charan");
	driver.findElement(By.id("pass")).sendKeys("123");
	TakesScreenshot tk =(TakesScreenshot)driver;
	File defltlocation = tk.getScreenshotAs(OutputType.FILE);
	File destlocation = new File("C:\\Users\\Chaitanya\\eclipse-workspace\\ScreenShot\\sss\\charan.png");
	FileUtils.copyFile(defltlocation,destlocation);
	driver.findElement(By.id("u_0_b")).click();
	driver.quit();
	
		
	}

}
