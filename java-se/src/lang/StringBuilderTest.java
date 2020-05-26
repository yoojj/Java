package lang;

import org.junit.Test;

public class StringBuilderTest {

	// StringBuilder
	// : java5 부터 추가 
	// : String과 달리 변경 가능한 객체  
	// : StringBuffer와 동일한 기능을 하는 객체  
	// : StringBuffer와 달리 synchronization을 적용하지 않아 단일 스레드 환경에서 사용하기 적합  
	
	
	
	@Test 
	public void test() {
		
		final StringBuilder str = new StringBuilder();
		
		str.append(0);
		str.append(new Integer(1));
		str.append(1.5);
		str.append("모든 데이터 타입 추가");
		
		// 주어진 위치에 값 추가  
		str.insert(0, true);
		
		// 주어진 위치에 해당하는 문자 삭제 
		str.deleteCharAt(0);
		
		// 주어진 위치에 해당하는 문자열 삭제 
		str.delete(0, 18);
		System.out.println(str);
		
		// 문자열을 역순으로 변경
		str.reverse();
		System.out.println(str);
		
	}
	
}