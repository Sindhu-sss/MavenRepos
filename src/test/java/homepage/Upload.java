package homepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Upload {
	@BeforeMethod
	public void set()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
	}


	
	@Test
	public void runtest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();
	}
}
