package homepage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	@Test
	public void bookticket()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
//		driver.findElement(By.xpath("//div[@class='close']")).click();
//		driver.findElement(By.xpath("//div[.='India']")).click();
//	    driver.switchTo().window("https://www.redbus.in/");
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Bengaluru");
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Mumbai (All Locations)",Keys.ENTER);
		driver.findElement(By.xpath("//label[.='Onward Date']")).click();
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody/tr[7]/td[5]")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
	}
	
}
