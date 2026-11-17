package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage 
{
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")WebElement username;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")WebElement password;
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")WebElement loginbtn;
	@FindBy(xpath ="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[1]/a/div[2]/img")WebElement logo;

	public Loginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver ,this);
	}
	
	public void loginmthd() throws Exception
	{
		Thread.sleep(2000);
		username.sendKeys("Admin");
		password.sendKeys("admin123");
		loginbtn.click();
	}
	public void logomthd() throws Exception
	{
		Thread.sleep(7000);
		
		boolean logoinformation =logo.isDisplayed();
		if(logoinformation==true)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo not displayed");
		}
	}

}
