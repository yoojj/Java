package math;

import java.math.BigDecimal;
import java.math.MathContext;

import org.junit.Ignore;
import org.junit.Test;

public class BigDecimalTest {

	// BigDecimal
	// : 정확한 실수 연산을 위한 기능을 지원하는 클래스  


	
	@Test @Ignore 
	public void test() {

		System.out.println(BigDecimal.ZERO);
		System.out.println(BigDecimal.ONE);
		System.out.println(BigDecimal.TEN);
	
	}

	@Test @Ignore
	public void arithmeticTest() {

		final BigDecimal a = new BigDecimal("10.5");
		final BigDecimal b = new BigDecimal("3");

		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));

	}
	
	@Test @Ignore 
	public void divideTest() {
		
		final BigDecimal a = new BigDecimal("10.5");
		final BigDecimal b = new BigDecimal("3");
	
		// 정밀도 지정 
		// - 32 : 7 자리
		// - 64 : 16 자리
		// - 128 : 32 자리 
		System.out.println(a.divide(b, MathContext.DECIMAL32));
		System.out.println(a.divide(b, MathContext.DECIMAL64));
		System.out.println(a.divide(b, MathContext.DECIMAL128));
				
		// 올림
		System.out.println(a.divide(b, BigDecimal.ROUND_UP));
		
		// 특정 소수자리에서 올림
		System.out.println(a.divide(b, 5, BigDecimal.ROUND_UP));
		
		// 내림 
		System.out.println(a.divide(b, BigDecimal.ROUND_DOWN));
		
		// 결과가 양수인 경우 올리고 음수인 경우 내림
		System.out.println(a.divide(b, BigDecimal.ROUND_CEILING));
		
		// 결과가 양수인 경우 내리고 음수인 경우 올림
		System.out.println(a.divide(b, BigDecimal.ROUND_FLOOR));

		// 결과가 .5보다 크면 올림
		System.out.println(a.divide(b, BigDecimal.ROUND_HALF_UP));
		
		// 결과가 .5보다 크면 올리고 작으면 내림
		System.out.println(a.divide(b, BigDecimal.ROUND_HALF_DOWN));
		
		try {
			
			// 결과가 정확하지 않을 경우 오류 발생    
			System.out.println(a.divide(b, BigDecimal.ROUND_UNNECESSARY));
			
		} catch(ArithmeticException e) {
			e.getStackTrace();
		}
		
	}

}