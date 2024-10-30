package test;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_First {

	@AfterTest
	public void Cookiesclose()
	{
		System.out.println("This block executes after all  Testcases");

	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hi there");

	}
	
	@BeforeSuite
	public void BSuite()
	{
		System.out.println("I will execute Before all  Testcases");
		//delete cookies
	}

	@Test
	public void Demo1()
	{
		System.out.println("Bye");

	}
	
	@BeforeTest
	public void Cookies()
	{
		System.out.println("This block executes before all  Testcases");
		
	}
	
	@AfterSuite
	public void ASuite()
	{
		System.out.println("I will execute after  all  Testcases");
		//delete cookies
	}
}
