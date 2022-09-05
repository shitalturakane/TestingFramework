package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage	login;
	@BeforeMethod
	public	void	setup()
	{
	initalization();
	login	=	new	LoginPage();
	}
	@Test
	public	void	verifyAppTitleTest()
	{
	String	actTitle	=	login.verifyAppTitle();
	System.out.println(actTitle);
	}
	/*@Test
	public	void	verifyKiteLabelTest()
	{
	String	actLabel	=	login.verifyKiteLabel();
	System.out.println(actLabel);
	}*/
	@Test
	public	void	verifyKiteLogoTest()
	{
	boolean	result	=	login.verifyKiteLogo();
	System.out.println(result);
	}
	@Test
	public	void	loginZerodhaAppTest()	throws	Throwable
	{
	login.loginZerodhaApp();
	}
	@AfterMethod
	public	void	exit()
	{
	driver.close();
	}
}
