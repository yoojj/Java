package util;

import java.util.Random;

import org.junit.Test;

public class RandomTest {

	// Random 
	// : 난수 발생을 위한 seed 값 지정 가능  
	
	
	
	@Test
	public void test() {
	
		final Random ran = new Random();
		
		// int 범위의 난수 반환 
		System.out.println(ran.nextInt());
		
		// 주어진 범위의 난수 반환 
		// 0 ~ 9
		System.out.println(ran.nextInt(10));
		
		// 5 ~ 24
		System.out.println(ran.nextInt(20) + 5);
		
	}
	
}