package basic.operator;

import org.junit.Ignore;
import org.junit.Test;

public class IncrementAndDecrement {

	@Test @Ignore
	public void increment() {

		int num = 0;
		int result = ++num;
		
		System.out.println(num);
		System.out.println(result);
		
	}
	
	@Test
	public void decrement() {
		
		int num = 1;
		int result = --num;
		
		System.out.println(num);
		System.out.println(result);
		
	}
	
}