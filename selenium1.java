package com.mindtree.seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium driver");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='gNO89b']")).click();
		
	}
}
