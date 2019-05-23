//This Test Case follows the below steps in short:
//Register -> Sign-On with correct Username/Password -> Book a flight -> Logout.
//This is an End to End Test Case.

package demo.page.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC05_Reg_SignOn_E2E {
	
	
	@Test
	public void registerSignOn(){
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
		driver.findElement(By.xpath("//input[@name='register']")).click();
		
		//Sign-In to the new user
		driver.findElement(By.linkText("sign-in")).click();
		driver.findElement(By.name("userName")).click();
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).sendKeys("mercury"); 
		driver.findElement(By.xpath("//form/table/tbody/tr[2]/td[2]")).click();
		driver.findElement(By.xpath("//input[@name='login']")).click();
		driver.findElement(By.name("passCount")).click();
		driver.findElement(By.name("fromPort")).click();
		Select s1 = new Select(driver.findElement(By.name("fromPort")));
		s1.selectByVisibleText("Frankfurt");
		driver.findElement(By.name("fromMonth")).click();
		Select s2 = new Select(driver.findElement(By.name("fromMonth")));
		s2.selectByVisibleText("July");
		driver.findElement(By.name("fromDay")).click();
		Select s3 = new Select(driver.findElement(By.name("fromDay")));
		s3.selectByVisibleText("20");
		driver.findElement(By.name("toPort")).click();
		Select s4 = new Select(driver.findElement(By.name("toPort")));
		s4.selectByVisibleText("London");
		driver.findElement(By.name("toMonth")).click();
		Select s5 = new Select(driver.findElement(By.name("toMonth")));
		s5.selectByVisibleText("July");
		driver.findElement(By.name("toDay")).click();
		Select s6 = new Select(driver.findElement(By.name("toDay")));
		s6.selectByVisibleText("30");
		driver.findElement(By.xpath("(//input[@name='servClass'])[2]")).click();
		driver.findElement(By.name("airline")).click();
		Select s7 = new Select(driver.findElement(By.name("airline")));
		s7.selectByVisibleText("Blue Skies Airlines");
		driver.findElement(By.xpath("//input[@name='findFlights']")).click();
		driver.findElement(By.xpath("(//input[@name='outFlight'])[2]")).click();
		driver.findElement(By.xpath("(//input[@name='inFlight'])[2]")).click();
		driver.findElement(By.xpath("//input[@name='reserveFlights']")).click();
		
		//passenger details
		driver.findElement(By.name("passFirst0")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("rashmi");
		driver.findElement(By.name("passLast0")).click();
		driver.findElement(By.name("passLast0")).sendKeys("sarmah");
		driver.findElement(By.name("creditCard")).click();
		driver.findElement(By.name("pass.0.meal")).click();
		Select s8 = new Select(driver.findElement(By.name("pass.0.meal")));
		s8.selectByVisibleText("Low Calorie");
		Select s9 = new Select(driver.findElement(By.name("creditCard")));
		s9.selectByVisibleText("MasterCard");
		driver.findElement(By.name("creditnumber")).click();
		driver.findElement(By.name("creditnumber")).sendKeys("1234567890");
		driver.findElement(By.name("cc_exp_dt_mn")).click();
		driver.findElement(By.name("cc_exp_dt_mn")).sendKeys("01");
		driver.findElement(By.name("cc_exp_dt_yr")).click();
		driver.findElement(By.name("cc_exp_dt_yr")).sendKeys("2002");
		driver.findElement(By.name("cc_frst_name")).click();
		driver.findElement(By.name("cc_frst_name")).sendKeys("R");
		driver.findElement(By.name("cc_mid_name")).click();
		driver.findElement(By.name("cc_mid_name")).sendKeys("R");
		driver.findElement(By.name("cc_last_name")).click();
		driver.findElement(By.name("cc_last_name")).sendKeys("S");
		driver.findElement(By.xpath("//form/table")).click();
		driver.findElement(By.name("billAddress1")).click();
		driver.findElement(By.xpath("//tr[9]")).click();
		driver.findElement(By.name("billAddress1")).sendKeys("P1");
		driver.findElement(By.xpath("//tr[11]")).click();
		driver.findElement(By.name("billCity")).sendKeys("P2");
		driver.findElement(By.name("billCountry")).click();
		Select s10 = new Select(driver.findElement(By.name("billCountry")));
		s10.selectByVisibleText("CZECH REPUBLIC");
		driver.findElement(By.xpath("//input[@name='buyFlights']")).click();
		driver.findElement(By.xpath("//td[3]/a/img")).click();
		
		driver.quit();
		
	}

}
