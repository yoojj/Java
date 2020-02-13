package error;

import org.junit.Test;

public class OutOfMemoryErrorTest {

	// OutOfMemoryError
	// : 메모리 부족으로 발생하는 오류 

	// - heap 
	// - PermGen
	// - VM limit
	
	// +  StackOverflowError
	
	
	
	@Test
	public void vmLimit() {

		int[] array = new int[Integer.MAX_VALUE];
		
		for(int i = 0; i < array.length; ++i)
			array[i] = i + 1;
		
	}
	
}