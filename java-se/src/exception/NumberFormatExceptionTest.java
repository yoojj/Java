package exception;

import org.junit.Test;

public class NumberFormatExceptionTest {

	// NumberFormatException
	// : 문자열을 숫자 타입으로 변환할 수 없는 경우 발생  

	
	
	@Test
	public void test() {
		
		try {
			
			// 공백을 변환할 때 발생
			//String str = "1 0";
			
			// 문자열을 변환할 때 발생
			//String str = "one";
			//String str = "0.1"; 
			String str = "0,1"; 
			
			int i = Integer.parseInt(str);
			
			System.out.println(i);
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		
	}
	
}