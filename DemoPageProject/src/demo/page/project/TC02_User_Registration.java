//This Test Case follows the below steps in short:
//Register Only.


package demo.page.project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC02_User_Registration {
	
	@Test
	public void registerDemoPage() {
		String browser = "Mozilla";
		WebDriver driver = null;
		
		
		if(browser == "Mozilla"){
			//System.setProperty("webdriver.gecko.driver", "/Users/Rashmi/Documents/NewWorkSpace/Projects/DemoPage/DemoPageProject/geckodriver");
			driver = new FirefoxDriver();
		}else if (browser == "Chrome"){
			//System.setProperty("webdriver.chrome.driver", "/Users/Rashmi/Documents/NewWorkSpace/Projects/DemoPage/DemoPageProject/chromedriver");
			driver = new ChromeDriver();
		}
		
		//maximize the browser before launching
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//launch URL
		driver.get("http://newtours.demoaut.com/");
		
		
		//find REGISTER and click on it.
		driver.findElement(By.linkText("REGISTER")).click();
		
		//filling contact information
		driver.findElement(By.name("firstName")).click();
		driver.findElement(By.name("firstName")).sendKeys("Rashmi");
		driver.findElement(By.name("lastName")).sendKeys("Sarmah");
		driver.findElement(By.name("phone")).sendKeys("1234");
		driver.findElement(By.id("userName")).sendKeys("rsmisrmh29@gmail.com");
		
		//filling mailing information
		driver.findElement(By.name("address1")).sendKeys("P4");
		driver.findElement(By.name("city")).sendKeys("Prague");
		driver.findElement(By.name("state")).sendKeys("Prague");
		driver.findElement(By.name("postalCode")).sendKeys("14700");
		
		//to select the Country
		Select s = new Select(driver.findElement(By.name("country")));
		s.selectByVisibleText("CZECH REPUBLIC");
		
		//filling user information
		driver.findElement(By.id("email")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("confirmPassword")).sendKeys("mercury");
		
		//clicking on REGISTER button
		//driver.findElement(By.name("register")).click();
		driver.findElement(By.xpath("//input[@name='register']")).isDisplayed();
		driver.findElement(By.xpath("//input[@name='register']")).click();
		

		
		//check if registration was successful on console
		/*String expectedUrl = "http://newtours.demoaut.com/create_account_success.php";
		driver.get(expectedUrl);
		try{
		  Assert.assertEquals(expectedUrl, driver.getCurrentUrl());
		  System.out.println("Registration Successful.");
		}
		catch(Throwable pageNavigationError){
		  System.out.println("Registration was not Successful.");
		}*/
		
		
		
		driver.quit();	
		
		}
		
	
	}

