package TestNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GermanyIsCalling {
	//launching an empty browser
	WebDriver driver;
	@BeforeMethod
	public void OpenBrowser() throws InterruptedException {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url of germany is calling
		driver.get("https://app.germanyiscalling.com/common/login/");
		Thread.sleep(2000);
	}
	@Test 
	//login with valid credentials of germany is calling website
	public void Login() throws InterruptedException {
		driver.findElement(By.id("username")).sendKeys("vijaykumar02k2@gmail.com");
		driver.findElement(By.id("password")).sendKeys("@Vi123456");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//to get the title after login
		String title=driver.getTitle();
		Reporter.log(title, true);
		SoftAssert s=new SoftAssert();
		s.assertEquals("Upload your CV | Germany Is Calling", title);
		Thread.sleep(2000);
		Reporter.log(driver.getCurrentUrl(),true);
		Thread.sleep(2000);
		s.assertAll();
		Thread.sleep(2000);
	}
   //To close the browser
	@AfterMethod
	public void Closebrowser() {
		driver.close();
	}
}
