package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_3rd {

	
	@BeforeClass
	public void Bf_Class()
	{
		System.out.println("This block executes before each Class");
	}
	
	
	@AfterClass
	public void Af_Class()
	{
		System.out.println("This block executes after each Class");
	}
	
	
	@Test
	public void Login_web()
	{
		//Selenium code
		System.out.println("Login web");

	}
	
	@AfterMethod
	public void Aft_Mthd()
	{
		System.out.println("This block executes after each Test");
	}

	@Test
	public void Login_mobile()
	{
		//Appium code
		System.out.println("Login mobile");
	}
	
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("This block executes before each Test");
	}

	@Test
	public void mobile1()
	{
		//Appium code
		System.out.println("Login mobile1");
	}
	
	@Test
	public void mobile2()
	{
		//Appium code
		System.out.println("Login mobile2");
	}
	
	@Test
	public void Login_API()
	{
		//API code
		System.out.println("Login API");

	}
	
}