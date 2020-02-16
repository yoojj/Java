package exception;

import org.junit.Test;

public class ArrayIndexOutOfBoundsExceptionTest {

	// ArrayIndexOutOfBoundsException
	// : 유효하지 않는 인덱스로 배열에 접근을 시도할 경우 발생 
	
	
	
	@Test
	public void test() {
		
		try {
			
			final int[] array = {1,2,3,4,5};
			
			System.out.println(array[5]);
		
		} catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
}