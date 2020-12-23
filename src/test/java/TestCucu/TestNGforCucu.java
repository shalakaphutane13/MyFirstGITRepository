package TestCucu;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TestNGforCucu {
	WebDriver driver;
	WebDriverWait wait;
	
  @Test
  public void f() {
	  
	  driver.get("https://login.yahoo.com/?.intl=in&.lang=en-IN&src=fpctx&pspid=97684142&done=https%3A%2F%2Fin.yahoo.com%2F&add=1");
driver.findElement(By.xpath("//span[contains(text(),'Sign in')]")).click();
	  
	  System.out.println("current window"+ driver.getWindowHandles());
	  driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("shalaka.phutane@yahoo.com");
	  driver.findElement(By.cssSelector("input[name='signin']")).click();
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  
  @BeforeClass
  public void beforeClass()
  {
	  	System.setProperty("webdriver.chrome.driver", "DriverResource\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,10,2000); 
  }
  @AfterClass
  public void afterClass() {
  }

}
