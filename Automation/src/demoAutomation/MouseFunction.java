package demoAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseFunction {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation setup\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		
		driver.manage().window().maximize();
		

//		act.scrollByAmount(0, 200);
	
//		Thread.sleep(2000);

		WebElement drag = driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement Drop =driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act =new Actions(driver);

		act.dragAndDrop(drag, Drop).perform();
		
//		driver.close();	
		}

}
