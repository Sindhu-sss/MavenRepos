package homepage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshotele {

	@Test
	public void elesshot() throws IOException, InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
	    File src=driver.findElement(By.id("username")).getScreenshotAs(OutputType.FILE);
	    File dst=new File("./photo/user.png");
	    FileUtils.copyFile(src, dst);
	    Thread.sleep(1000);
	    driver.close();
	}

}
