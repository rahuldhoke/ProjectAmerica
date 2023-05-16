package TestNGDetails;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertions {

			//2 types of asset hard and soft
		//hard when fails stops the execution
		//soft if fails execution is continued
		//we can also add custom messages to asserts
		
		@Test()
		public void ExampleAssert() {
		SoftAssert softAsst = new SoftAssert(); //creating object of soft assert
		softAsst.assertTrue(false,"soft assert");
		System.out.println("prnted");
		softAsst.assertTrue(false,"soft assert");
		Assert.assertTrue(false,"Asssert is failed"); //Hard aAssert
		System.out.println("After hard assert failed nothing is prnted");
		
		}
	

}
