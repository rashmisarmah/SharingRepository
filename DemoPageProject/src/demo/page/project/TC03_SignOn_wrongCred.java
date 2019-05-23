package demo.page.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC03_SignOn_wrongCred {
	
	@Test
	public void wrongCred(){
		
		String browser = "Mozilla";
		WebDriver driver = null;
		
		if(browser == "Mozilla"){
			System.setProperty("webdriver.gecko.driver", "/Users/Rashmi/Documents/NewWorkSpace/Projects/DemoPage/DemoPageProject/geckodriver");
			driver = new FirefoxDriver();
		}else if (browser == "Chrome"){
			System.setProperty("webdriver.chrome.driver", "/Users/Rashmi/Documents/NewWorkSpace/Projects/DemoPage/DemoPageProject/chromedriver");
			driver = new ChromeDriver();
		}
		
		//maximize the browser before launching
		driver.manage().window().maximize();
				
		//launch URL
		driver.get("http://newtours.demoaut.com/");

		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("abc");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("xyz");
		driver.findElement(By.xpath("//tr[4]/td/table/tbody/tr[2]/td[2]")).click();
		driver.findElement(By.name("login")).click();
		Assert.assertEquals("userName = abc", "Username = mercury. This is a bug.");
		Assert.assertEquals("password = xyz", "Password = mercury. This is a bug.");
		
		driver.quit();
		
	}

}
