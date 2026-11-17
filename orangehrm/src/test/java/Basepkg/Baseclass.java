package Basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import pagepkg.Adminpage;
import pagepkg.Loginpage;


public class Baseclass 
{

	public static WebDriver driver;
	public Loginpage loginobj;
	public Adminpage adminobj;
	
	@BeforeTest
	public void setup()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void objmthd()
	{
		loginobj =new Loginpage(driver);
		adminobj = new Adminpage(driver);
	}
	
}
