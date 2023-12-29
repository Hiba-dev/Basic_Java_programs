package annotations.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class1 {

	@Test 
	@Parameters({"url"})
	public void test1(String URL)
	{
		System.out.println("Test1 function is returned");
		System.out.println(URL);
	}
	
	@Test
	@Parameters({"var"})
	public void test2(String a)
	{
		System.out.println("Test2 function is returned");
		System.out.println(a);
	}

	@Test
	public void test3()
	{
		System.out.println("Test3 function is returned");
	}

	@Test
	public void test4()
	{
		System.out.println("Test4 function is returned");
	}
}
