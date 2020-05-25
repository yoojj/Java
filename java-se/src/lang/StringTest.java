package lang;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class StringTest {

	// String
	// : String으로 저장되는 문자열은 char의 배열 형태로 저장
	// : char은 한 글자의 아스키 코드 값을 담음
	// : 비공개 불변 값으로 저장 
	// public final class String { private final char value[]; }

	

	// String interning
	// : 클래스가 로드되면 모든 문자열 리터럴은 상수 풀에 위치 하며
	// : 중복되는 문자열 리터럴은 상수 풀 안의 같은 상수-인스턴스를 참조 
	// : 인스턴스를 재사용하므로 메모리 절약
	
	
	// String constant pool
	// : 플라이웨이트 패턴 구현
	// : java7 이전에는 PermGen 영역에 위치했으나 메모리 크기 문제로 (PermGen 영역은 고정된 크기)
	//   java7 이후에는 Heap 영역에 위치하여 GC의 대상이 됨    

	
	
	// ==
	// : 메모리 상 동일한 주소를 가르키는지 비교 
	
	// equals()
	// : 정의한 알고리즘 조건을 만족하는지 여부 검사  
	
	@Ignore 
	public boolean equals(Object obj) {
		
		if( this == obj ) { return true; }
		
		// 값 비교 
		if( obj instanceof String ) { }
		
		return false;
	}
	
	
	
	// + CharSequence.class
	// + Collator.class
	
	
	
	@SuppressWarnings("unused")
	@Test @Ignore
	public void test() {
	
		// 암시적 객체 
		String literal = "문자열";
		
		// 명시적 객체 
		String object = new String("문자열");
		
	}
	
	@Test @Ignore 
	public void internTest() {
		
		// intern()
		// : String pool에 있는 문자열들과 비교하여 존재하면 반환 
		// : String pool에 해당 문자열이 없을 경우 새로 생성하고 반환   
		
		String str1 = "문자열";
		String str2 = "문자열";
		String str3 = new String("문자열").intern();
		String str4 = new String("문자열");
		
		System.err.println( "str1 :: " + System.identityHashCode(str1) );
		System.err.println( "str2 :: " + System.identityHashCode(str2) );
		System.err.println( "str3 :: " + System.identityHashCode(str3) );
		System.err.println( "str4 :: " + System.identityHashCode(str4) );
		
		str4 = str4.intern();
		
		// == 연산자를 이용한 비교가 equals() 보다 빠름 -- 최적화 의미 아님 
		System.out.println( str1 == str4 );
		System.err.println( "변경된 str4 :: " + System.identityHashCode(str4) );
		
	}

	@Test @Ignore
	public void charAtTest() {
		
		// charAt(int index)
		// : 주어진 인덱스에 위치하는 문자 반환 
		
		final String str = "ABCDE";
		
		try {
			
			System.out.println(str.charAt(10));
			
		} catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
		
	}
	
	@Test @Ignore 
	public void compareToTest() {
		
		// compareTo(String str)
		// : 두 개 문자열을 유니 코드 값으로 비교하여 동일하면 0 반환 
		
		System.out.println( "B".compareTo("A") );
		System.out.println( "B".compareTo("B") );
		System.out.println( "B".compareTo("C") );
		
	}
	
	@Test @Ignore
	public void concatTest() {
		
		// concat(String str)
		// : 문자열 결합
		
		System.out.println( "A".concat("B").concat("C") );
		
	}
	
	@Test @Ignore
	public void substringTest() {
		
		// substring(int begin, int end)
		// : 주어진 위치에 있는 문자열 반환 
		// : 시작 위치만 범위에 포함
		
		final String str = "문자열 반환";

		System.out.println( str.substring(0) );
		System.out.println( str.substring(0,3) );
		
	}
	
	@Test @Ignore
	public void joinTest() {
		
		// join()
		// : java8에 추가된 메소드 
		
		final String str = String.join(",", "a", "b", "c");
		System.out.println( str );
		
		final List<String> list = Arrays.asList("a", "b", "c");
		final String listStr = String.join(":", list);
		System.out.println( listStr );

	}
	
	@Test @Ignore
	public void equalsIgnoreCaseTest() {
	
		// equalsIgnoreCase
		// : 대소문자 구분없이 문자열이 일치하는지 비교
		
		final String str = "string";
		System.out.println("string".equals(str));
		System.out.println("STRING".equalsIgnoreCase(str));
		
	}
	
	@Test @Ignore
	public void syntacticSugar() {
		 
		// 1. 리터럴 또는 String 객체가 + 연산자를 만날 경우 컴파일러에 의해
		// 2. 처음 인수를 StringBuilder 생성자에 할당하여 인스턴스 생성   
		// 3. append() 메소드를 호출하여 나머지 인수 전달
		// 4. toString() 호출 
		
		final String str = "한 줄로 + 연산자를 통해 " + "문자열을 연결할 경우 " + "StringBuilder로 자동 컴파일";
		System.out.println(str);
		
	}
	
	@Test 
	public void reflectionTest() throws IllegalArgumentException, IllegalAccessException, 
		SecurityException, NoSuchFieldException {
		
		String str = "string!";
		String str1 = "string!";
		
		System.out.println(str);
		System.out.println(str == str1);
		System.out.println(str.hashCode());
		
		this.edit(str);
		
		System.out.println("***** edit *****");
		System.out.println(str);
		System.out.println(str == str1);
		System.out.println(str.hashCode());
		
	}
	
    private void edit(String str) throws IllegalArgumentException, IllegalAccessException, 
    	SecurityException, NoSuchFieldException {
    	
		final Field strValue = String.class.getDeclaredField("value");
		strValue.setAccessible(true);
		strValue.set(str, str.toUpperCase().toCharArray());
        
    }

}