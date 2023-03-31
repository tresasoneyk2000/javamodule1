package com.ust.test;



import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
	@Test
	public void TestGoogle() throws Exception{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).
	sendKeys("ust trivandrum",Keys.ENTER);
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.quit();

}}
