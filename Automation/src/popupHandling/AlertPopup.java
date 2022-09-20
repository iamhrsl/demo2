package popupHandling;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\Automation setup\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
//		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='submit']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//a[text()='Bank Project']")).click();
		Alert alt=driver.switchTo().alert();
		
		
		System.out.println(alt.getText());
		alt.accept();
		
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		driver.close();		

	}

}
