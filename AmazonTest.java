package com.mindtree.seleniumclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']")).sendKeys("refrigerator");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		WebElement first = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[3]"));
		String pri = first.getText();
		String ex = ".00";
		String price1 = pri.concat(ex);
		System.out.println(price1);
		
		driver.findElement(By.linkText("Samsung 192 L 2 Star Direct Cool Single Door Refrigerator (RR19A241BGS/NL, Grey Silver)")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> it= ids.iterator();
		//String pid =it.next();
		String cid =it.next();
		
		driver.switchTo().window(cid);
		
		WebElement eg = driver.findElement(By.xpath("(//span[@class='a-color-price'])[4]"));
		String price2 = eg.getText();
		System.out.println(price2);
		
		if(price1.equals(price2))
		{
			System.out.println("Price is Same on both tab");
		}else {
			System.out.println("Price is Different");
		}
		
	
		
		
		
	}

}
