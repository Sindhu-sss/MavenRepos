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

public class Bstone {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//a[.='Visit Our Stores']")).click();
		List<WebElement> wels = driver.findElements(By.xpath("//div[@class='map-image']"));
		int i=1;
		String img="map";
		Thread.sleep(3000);
		for(WebElement ele:wels)
		{
			Thread.sleep(4000);
			File sorc= ele.getScreenshotAs(OutputType.FILE);
			File dest=new File("./photo/"+img+i+".png");
			FileUtils.copyFile(sorc, dest);	
		    i++;
		}
		driver.close();
	}
	
}
