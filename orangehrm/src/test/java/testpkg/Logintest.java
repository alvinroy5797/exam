package testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;

public class Logintest extends Baseclass
{
	@Test
	public void loginverification() throws Exception 
	{
		loginobj.loginmthd();
	}
	@Test
	public void logoverification() throws Exception
	{
		loginobj.logomthd();
	}

}
