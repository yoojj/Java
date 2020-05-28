package basic.exception;

import org.junit.Test;

public class UserDefinedExceptionTest {

	@Test
	public void test() throws UserDefinedException {
		
		try {
			
			System.out.println(0/0);
		
		} catch (Exception e) {
			
			throw new UserDefinedException();
			
		}
	  
	}
	
}