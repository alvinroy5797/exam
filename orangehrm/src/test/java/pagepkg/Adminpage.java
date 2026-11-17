package pagepkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adminpage 
{
	WebDriver driver;

@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")WebElement adminbtn;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")WebElement user;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")WebElement search;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")WebElement logout;
@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")WebElement logoutbtn;

public Adminpage(WebDriver driver) 
{
	this.driver=driver;
	PageFactory.initElements(driver ,this);
}

public void adminmthd() throws Exception
{
	adminbtn.click();
	Thread.sleep(2000);
	user.sendKeys("Admin");
	search.click();
}

public void screenshot() throws Exception
{
	File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(s,new File("C:\\Users\\nexus\\OneDrive\\Pictures\\Screenshots\new.png"));
}

public void logout()
{
	logout.click();
	logoutbtn.click();
}

}
