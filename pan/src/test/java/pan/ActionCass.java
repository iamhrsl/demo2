package pan;

import java.time.Duration;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class ActionCass {
	
	WebDriver driver;
	
	@BeforeTest
	public void openbrowser() {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation setup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/reg/");
		
	}
	
	@Test
	public void Action() throws InterruptedException{
		
		
		
		IdentificationClass ele = new IdentificationClass(this.driver);

		ele.setfname("harshal");
		ele.setlast("khapare");
		ele.email("harshalkhapare112@gmail.com");
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='reg_email_confirmation__']")));
		ele.remail("harshalkhapare112@gmail.com");
		ele.password("password123");
		ele.setdate(10);
		ele.setmonth(6);
		ele.setyear("1997");
		ele.male();
		ele.sign();
//		ele.reemail.isDisplayed();

	}

	WebDriver WebDriverWait(WebDriver driver2, Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

	
//	
//	@Test
//	public void selection(){
//		IdentificationClass ele = new IdentificationClass(driver);
//		ele.malegender.isDisplayed();
//				
//	}


	
}
	
