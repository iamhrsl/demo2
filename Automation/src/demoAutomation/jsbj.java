package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jsbj {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/xml/");
		
		WebElement button=driver.findElement(By.xpath("(//*[contains(text(),'Display the XML File »')])[2]"));
		button.click();

	}

}
