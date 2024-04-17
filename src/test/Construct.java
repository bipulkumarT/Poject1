package test;

import org.testng.annotations.Test;

public class Construct {
	
	@Test
	public void c2()
	{
	CallConst c = new CallConst(3);
	System.out.println(c.c1());

}
}
