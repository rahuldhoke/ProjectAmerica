package TestNGDetails;

import org.testng.annotations.Test;

public class XMLFile {
//RMB on Project >> TestNG >> ConvertToTestNG
//Hierrachy Test Suite >> Test Name ??Classes
//TestSuite is like department -- Home Loan 
	//All Classes contains test cases
	//Suite can have multple modules
	
// Main Advantage thousand classes can be executed using xml file
	
	
	/*
	 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test thread-count="5" name="Test">
    <classes>
      <class name="TestNGDetails.AnnTest"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->


	 */
	
	@Test
	public void XMLFILE() {
		System.out.println("XMLFILE Demo1");
	}
}
