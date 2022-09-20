package demoAutomation;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class DateAndTime {
	
//	public static void ss{
		
//	}

	public static void main(String[] args) throws IOException {
		
//		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver.exe");
//		
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//	
////		//Datetime
		Date s=new Date();
		System.out.println(s);
		String fileName=s.toString().replace(" ", "-").replace(":", "-");
		System.out.println(fileName);
			
		//screenshot
		
		

	}

}
