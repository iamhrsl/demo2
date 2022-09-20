package popupHandling;

import java.util.ArrayList; 

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildPopuo {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/xml/");
		
		
		
		WebElement button=driver.findElement(By.xpath("Display the XML File »")).click();		
//		Actions act =new Actions(driver);
//		///////////////////////////////////////
//		act.moveToElement(button).perform();
//		/////////////////////////////////////////
//		Thread.sleep(2000);
//		WebElement sel=driver.findElement(By.linkText("Selenium"));
//		sel.click();
//		
//		String s1=driver.getWindowHandle();
//		System.out.println(s1+" main window  address");
//		/////////////////////////////////////////////////////////////
//		ArrayList<String> address =new ArrayList<String>(driver.getWindowHandles());
//		////////////////////////////////////////////////////////////
//		Thread.sleep(2000);
//		driver.switchTo().window(address.get(0));
//		sel.click();
////		driver.switchTo().window(address.get(1));
////		sel.click();
////		System.out.println(address.size());
//		for(int i=0;i<address.size();i++)
//		{
//			System.out.println(i+": no of adress");
//			driver.switchTo().window(address.get(i));
//			System.out.println(driver.getCurrentUrl());
//		}
//		
//	
////		Thread.sleep(3000);
////		driver.switchTo().window(address.get(0));
////		Thread.sleep(3000);
////		driver.switchTo().window(address.get(1));
//
	}

}
