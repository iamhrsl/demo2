package popupHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3schoolDemo {
	public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","D:\\Automation setup\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.w3schools.com");
	
	List<WebElement> button=driver.findElements(By.xpath("(//a[text()='Try it Yourself'])"));
	button.get(2).click();
	button.get(3).click();
	button.get(4).click();	
	
	ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());

	driver.switchTo().window(tab.get(1));
//	Thread.sleep(3000);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	
	


	
	}
}
