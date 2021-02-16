package basic;

import org.junit.Ignore;
import org.junit.Test;

public class DataType {

	@Test @Ignore
	public void charTest() {
		
		char c = (char)-1;
		
		System.out.println(c);
		
	}
	
	@Test @Ignore
	public void byteTest() {

		byte b = (byte)-129;
		
		System.out.println(b == 127);
		
	}
	
	@Test @Ignore
	public void intTest() {
		
		int num = 2_147_483_647;
		System.out.println(++num == -2147483648); 
		
		// 부호없는 값 
		int unsigned = Integer.parseUnsignedInt("4294967295");
		
		String value = Integer.toUnsignedString(unsigned);
		
		System.out.println(value);
		
	}
	
	@Test @Ignore
	public void longTest() {
		
		long num = 9_223_372_036_854_775_807L;
		

		System.out.println(++num == -9223372036854775808L);
		
	}
	
}