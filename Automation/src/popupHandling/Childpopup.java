package popupHandling;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
//import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpopup {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");

		List<WebElement> buttons=driver.findElements(By.xpath("//a[text()='Try it Yourself »']"));
//		System.out.println(buttons.size());
		buttons.get(0).click();
		buttons.get(1).click();
		buttons.get(2).click();
		buttons.get(3).click();
//		buttons.get(4).click();

		ArrayList<String> window=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(window.get(4));
//		buttons.get(2).click();
//		driver.switchTo().window(hand.get(1));

//		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//		driver.switchTo().alert().accept();
		driver.switchTo().window(window.get(1));
		driver.findElement(By.xpath("//a[@onclick='retheme()']")).click();
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		driver.switchTo().window(window.get(4));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().alert().accept();
		driver.switchTo().window(window.get(1));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.switchTo().alert().accept();
		
//		driver.close();
	
	}

}
