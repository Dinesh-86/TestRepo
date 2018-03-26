package TestNG1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnNG1 {
	public String url ="https://www.guru99.com/";
	public WebDriver driver;
	
	@BeforeTest
	public void launching_website()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\gayat\\Desktop\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}

	@Test
	public void gettitle()
	{
		 String expectedtitle = "Meet Guru99 - Free Training Tutorials & Video for IT Courses";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals(actualtitle, expectedtitle);	
		 	
	}
	
	@Test
	public void gettitle2()
	{
		 String expectedtitle = "Meeet Guru99 - Free Training Tutorials & Video for IT Courses";
		 String actualtitle= driver.getTitle();
		 Assert.assertEquals(actualtitle, expectedtitle);	
		 	
	}
	@AfterTest
	public void endsession()
	{
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
