package packTestone;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class JUnit_Sample1 
{
	@BeforeClass
	public static void a1()
	{
		System.out.println("Before Method");
		
	}
	
	@AfterClass
	public static void b1()
	{
		System.out.println("After Method");
	}
	
	@Test
	public void x1()
	{
		System.out.println("This test method of 'X1'");
	}
	
	@Test
	public void c1()
	{
		System.out.println("this method of 'C1' bureau");
	}
	
	@Ignore@Test
	public void d1()
	{
		System.out.println("this is method of d1");
	}

}
