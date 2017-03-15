package example;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class Test1 {

	@Test
	public void testA(){
		Reporter.log("This is test 1",true);
	}
}
