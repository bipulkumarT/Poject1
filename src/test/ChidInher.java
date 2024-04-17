package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChidInher extends ParentInher {
	
	@Test
	public void c()
	{
		p();
	}
	
	@BeforeTest
	public void d()
	{
		System.out.println("Before Test");
	}

}
