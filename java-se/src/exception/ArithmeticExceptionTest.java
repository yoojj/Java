package exception;

import org.junit.Test;

public class ArithmeticExceptionTest {

	// ArithmeticException
	// : 수학적으로 올바르지 못한 계산 시도시 발생 
	
	
	
	@Test
	public void test() {
		
		try {
			
			System.out.println( 10 % 0 );
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
		}
		
	}
	
}