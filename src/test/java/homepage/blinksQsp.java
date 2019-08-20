package homepage;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class blinksQsp {

	@Test
	public void bluest() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.qspiders.com");
		driver.findElement(By.xpath("//button[@class='close'][1]")).click();
		List<WebElement> blinks=driver.findElements(By.tagName("a"));
		for(WebElement we:blinks)
		{
		System.out.println(we);
		}
		
		}
}
