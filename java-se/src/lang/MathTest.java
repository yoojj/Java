package lang;

import org.junit.Ignore;
import org.junit.Test;

public class MathTest {

	// Math 
	// : 정적 변수와 정적 메소드만 존재  
	// : 엄격한 수학 계산이 필요한 경우 StrictMath 클래스 사용
	
	
	
	@Test @Ignore
	public void mathFieldTest() {
		
		// 오일러 수 
		System.out.println(Math.E);
		
		// 원주율
		System.out.println(Math.PI);

	}
	
	@Test 
	public void mathMethodTest() {
	
		// 최솟값
		System.out.println(Math.min(1, 2));

		// 최댓값
		System.out.println(Math.max(1, 2));
		
		// 제곱근
		System.out.println(Math.pow(5, 2));
		
		
		// long 타입을 int 타입으로 변환할 수 없을 때 예외 발생
		System.out.println(Math.toIntExact(1L));

	}
	
}