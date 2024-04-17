package test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class learn5 {
	@Test
	public void afterClas() {
		System.out.println("after class");
	}
	@BeforeSuite
	public void beforeClas() {
		System.out.println("before class");
		
	}
	

}
