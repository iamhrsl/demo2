package demoAutomation;

import java.io.File; 
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		WebElement create=driver.findElement(By.partialLinkText("New Account"));
		create.click();
		
		Thread.sleep(2000);
		
		WebElement day=driver.findElement(By.id("day")) ;
		Select d=new Select(day);
		d.selectByIndex(17); //starts from 0 ie.11 will select.
		
//		ss("day");
		
		WebElement month=driver.findElement(By.id("month")) ;
		Select m=new Select(month);
		m.selectByValue("6");
		
//		ss("month");
		
		WebElement year=driver.findElement(By.id("year")) ;
		Select y=new Select(year);
		y.selectByVisibleText("2003");
		
//		ss("year");
		//Datetime
		Date s=new Date();
		System.out.println(s);
		String fileName=s.toString().replace(" ", "-").replace(":", "-");
		System.out.println(fileName);
		
		//screenshot
		File source3=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File Dest3=new File("D:\\Screenshot file\\"+fileName+".jpeg");
		FileHandler.copy(source3, Dest3);
		
		
	}
		
		
		
		
	
		
	
		
	

}
