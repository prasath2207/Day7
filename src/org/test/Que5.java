package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que5 {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pugal\\eclipse-workspace\\Day12\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement job = driver.findElement(By.xpath("(//h2[@class='mb-0'])[1]"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(true)", job);
		TakesScreenshot t=(TakesScreenshot)driver;
		File src=t.getScreenshotAs(OutputType.FILE);
		File dest=new File("P:\\selenium\\screenshot\\Que5.png");
		FileUtils.copyFile(src, dest);
		WebElement online = driver.findElement(By.xpath("//h3[text()='Online Classroom']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView(false)", online);
		
	}


}
