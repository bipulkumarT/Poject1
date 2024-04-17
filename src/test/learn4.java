package test;

import org.testng.annotations.Test;

public class learn4 {
	
	@Test
	public void e1()
	{
		System.out.println(" e1 pass");
	}
	@Test(enabled =false)
	public void e2() {
		System.out.println("e2 pass");
	}
	@Test(dependsOnMethods = {"e1"})
	public void a1() {
		System.out.println("a1 pass");
	}
}
