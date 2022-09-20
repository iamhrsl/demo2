package pan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class IdentificationClass {
	
	WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstname']")
		WebElement fname;
		
	@FindBy(xpath="//input[@name='lastname']")
		WebElement lname;
	
	@FindBy(xpath="//input[@name='reg_email__']")
		WebElement mail;
	
	@FindBy(xpath="//input[@name=\"reg_passwd__\"]")
		WebElement pass;
	
	@FindBy(xpath="//select[@name=\"birthday_day\"]")
			WebElement date;
	
	@FindBy(xpath="//select[@name=\"birthday_month\"]")
		private WebElement month;
	
	@FindBy(xpath="//select[@name=\"birthday_year\"]")
		private WebElement year;
	
	@FindBy (xpath="//label[contains(text(),'Male')]")
		 WebElement malegender;
	
	@FindBy (xpath="//label[contains(text(),'Female')]")
		 WebElement femalegender;
	
	@FindBy(xpath="(//button[contains(text(),'Sign Up')])[1]")
		 WebElement signup;
	
	@FindBy(xpath="//input[@name='reg_email_confirmation__']")
		 WebElement reemail;
	
	IdentificationClass(WebDriver d)
	{
		driver=d;
		PageFactory.initElements(d, this);
	}
	
	
	public  void setfname(String fname1) {
		fname.sendKeys(fname1);
	}
	
	public  void setlast(String lname1) {
		lname.sendKeys(lname1);
	}
	
	public void email(String S1) {
		mail.sendKeys(S1);
	}
	
	
	public  void setdate(int B) {
		Select date1=new Select(date);
		date1.selectByIndex(B);
	}
	
	public  void setmonth(int M) {
		Select month1=new Select(month);
		month1.selectByIndex(M);
	}
	
	public  void setyear(String Y) {
		Select year1=new Select(year);
		year1.selectByValue(Y);
	}
	
	public void male() {
		malegender.click();
	}
	
//	public void female() {
//		femalegender.click();
//	}
	
	public void password(String p) {
		pass.sendKeys(p);
	}
	
	public void remail(String o) {
		reemail.sendKeys(o);
	}
	
	public void sign() {
		signup.click();
	}
	
}
