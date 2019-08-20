package homepage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class newmap {
	public class mapshot {

		@Test
		public void run() throws IOException, InterruptedException
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");	
		
		driver.findElement(By.xpath("//a[.='Visit Our Stores']")).click();

		List<WebElement> stores = driver.findElements(By.xpath("//div[@class='map-wrap']"));
		int i=1;
		for(WebElement we:stores)
		{
			Thread. sleep(3000);
			File src = we.getScreenshotAs(OutputType.FILE);
			File dest = new File("./photo/"+(i++)+".png");
			FileUtils.copyFile(src, dest);
		}
		driver.close();
		}
	}

	
}
