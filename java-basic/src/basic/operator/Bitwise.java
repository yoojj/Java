package basic.operator;

import org.junit.Ignore;
import org.junit.Test;

public class Bitwise {

	@Test
	public void AndTest() {
		
		// 피연산자의 비트 패턴을 비교해 모두 1이면 1을 반환하고 아니면 0을 반환
		
		int a = 0b0000_0000_0000_0000_1111_1111_1111_1111;
		int b = 0b0000_0000_0000_0000_0101_0101_0101_0101;
		
		int result = 0b0000_0000_0000_0000_0101_0101_0101_0101;
		
		System.out.println((a & b) == result);
		
	}
	
	@Test @Ignore 
	public void ORTest() {
	
		// 피연산자의 비트 패턴을 비교해 하나라도 1이면 1을 반환하고 모두 0이면 0을 반환 

		int a = 0b0000_0000_0000_0000_1111_1111_1111_1111;
		int b = 0b0000_0000_0000_0000_0101_0101_0101_0101;

		int result = 0b0000_0000_0000_0000_1111_1111_1111_1111;

		System.out.println((a | b) == result);
		
	}
	
	@Test @Ignore 
	public void XORTest() {

		// 피연산자의 비트 패턴을 비교해 다르면 1을 같으면 0을 반환
		
		int a = 0b0000_0000_0000_0000_1111_1111_1111_1111;
		int b = 0b0000_0000_0000_0000_0101_0101_0101_0101;

		int result = 0b0000_0000_0000_0000_1010_1010_1010_1010;

		System.out.println((a ^ b) == result);
		
	}
	
	@Test @Ignore 
	public void NOTTest() {
		
		// 피연산자의 비트 패턴을 반대로 함  
		
		int a = 0b0000_0000_0000_0000_1111_1111_1111_1111;
		int b = 0b1111_1111_1111_1111_0000_0000_0000_0000;
		
		System.out.println(~a == b);
		
	}

}