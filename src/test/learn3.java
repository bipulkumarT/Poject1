package test;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class learn3 {
	@BeforeTest
	public void b1()
	{
		System.out.println("great");
	}
	
	@Parameters({"url"})
	@Test
public void b2(String s) {
	//System.out.println(s);
		Assert.assertTrue(false);
}
	

}
