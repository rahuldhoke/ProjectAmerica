package TestNGDetails;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnTest {
	
	//@Before and @After
	// Note -- If 3 classes are defined in xml file.. First @before method will exeucte
	//Then all @Test methods from all 3 classes 
	//final at at last @After will be exeucted 
	//Imp NOte : @Before and @Afte is applicble for only 1 department or 1 Test/foldes
	
	//Before and After Suite
	//Suite is related to xml file
	//Suite is parent to test folder in xml
	//Applicable to all classes like above scope entire xml file
	
	//Before After method
	//If 4 test cases in a class, then before each test case before method will be exeucted eg 4 times
	
	//BeforeClass
	//Before executing anything from that class , thsi annoantion will get exeucted
	@AfterClass
	public void ExeBeforeClass() {
		System.out.println("BEfore ClassMethod Exeucted - class AnnTest");
	}
	
	@AfterTest
	public void TestAnnotation1() {
		System.out.println("TestAnnotation Demo1");
	}
	
	@Test
	public void TestAnnoation2() {
		System.out.println("TestAnnotation Demo2");
	}
	
	
	@BeforeTest
	public void TestAnnoation3() {
		System.out.println("TestAnnotation Demo3");
	}

}
