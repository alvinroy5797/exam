package testpkg;

import org.testng.annotations.Test;

import Basepkg.Baseclass;

public class Admintest extends Baseclass{
	@Test
	public void adminverification() throws Exception
	{
		adminobj.adminmthd();
	}
	

}
