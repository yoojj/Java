package util;

import java.util.Vector;

import org.junit.Ignore;
import org.junit.Test;

public class VectorTest {
	
	// Vector 
	// : List 인터페이스 구현
	// : 객체를 동적 배열로 저장하기 위한 클래스   
	// : 요소를 순회하기 위해 Enumeration과 Iterator 사용 가능  
	// : 멀티 스레드에 안전하도록 동기화되어 처리 속도가 조금 늦음
	// : 동기화 사용 여부와 상관없이 동기화되므로 오버 헤드가 존재   

	

	@Test @Ignore
	public void test() {
		
		final Vector<Object> v = new Vector<>();
		
		v.add("a");
		v.add("b");
		v.add("c");
		v.add("d");
		
		v.remove(3);
		
		// 요소 개수 반환
		System.out.println(v.size());

		// 값 반환
		System.out.println(v.get(0));
		
		for(Object obj : v) {
			System.out.println(obj);
		}
		
	}
	
	@Test 
	public void vectorCapacityTest() {
		
		final Vector<?> v1 = new Vector<>();
		final Vector<?> v2 = new Vector<>(5);
		
		System.out.println("v1 capacity : " + v1.capacity());
		System.out.println("v2 capacity : " + v2.capacity());
	
	}

}