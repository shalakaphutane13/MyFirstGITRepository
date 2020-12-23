package SNOW;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestCases {
	WebDriver driver;
	WebDriver wait;
	
	
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) throws InterruptedException {
	  driver.get("https://pisatest.myatos.net/home?id=sc_cat_item&sys_id=d58ddee9db529c10eeaf30d6f496191c&sysparm_category=fca9884f1bc1c8107c1ddceacd4bcb39&catalog_id=-1");
	  //driver.findElement(By.xpath("//input[@type='submit']")).click();
	  
	WebElement description=driver.findElement(By.cssSelector("textarea[name='description']"));
	
	description.click();
	description.sendKeys("Test");
	driver.findElement(By.xpath("//a/span[@id='select2-chosen-5']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='select2-result-label-39']")).click();

  }
  @BeforeMethod
  public void beforeMethod() {
	   
  }

  @AfterMethod
  public void afterMethod() {
	  
	  
	  
	  
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "DriverResource\\chromedriver.exe");
		     driver =new ChromeDriver();
		driver.manage().window().maximize();
		
		
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
