package lang;

import org.junit.Test;

public class CharSequenceTest {

	// CharSequence
	// : 문자 표현을 위한 슈퍼 인터페이스  
	// : String 클래스와 StringBuffer 클래스를 묶기 위해 java4 부터 추가  

	
	// 구현
	// - String
	// - StringBuffer 
	// - StringBuilder
	// - CharBuffer
	
	
	
	@Test 
	public void test() {
		
		// String으로 인스턴스화 됨 
		CharSequence str1 = "문자열"; 
		
		String str2 = "문자열";
		
		System.out.println( "str1 :: " + System.identityHashCode(str1) );
		System.out.println( "str2 :: " + System.identityHashCode(str2) );

		System.out.println( "str1 :: " + str1.hashCode() );
		System.out.println( "str1 :: " + str2.hashCode() );

		System.out.println( str1 == str2 );
		System.out.println( str1.equals(str2) );
		
	}
	
}