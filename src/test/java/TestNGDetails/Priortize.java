package TestNGDetails;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Priortize {
	//YOu can created multiple Test and in that test you can add multiple classses and execute
	//Based on Test tag , we can categorize classes belonging to respective Test tag

	
	@AfterClass
	public void ExeBeforeClass() {
		System.out.println("BEfore ClassMethod Exeucted - class Prioritize");
	}
	
	@Test
	public void Priortize1() {
		System.out.println("Priortize Demo1");
	}
	
	@Test
	public void Priortize2() {
		System.out.println("Priortize Demo2");
	}
	
	@Test
	public void Priortize3() {
		System.out.println("Priortize Demo2");
	}
	
	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("beforesuite Demo2");
	}
	
	@AfterSuite
	public void AfterSuite() {
		System.out.println("aftersuite Demo2");
	}

}
