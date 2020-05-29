package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

import org.junit.Ignore;
import org.junit.Test;

public class EnumerationTest {

	// Enumeration
	// : 열거자  
	// : Vector, Stack, HashTable 객체에 저장된 요소에 접근하기 위한 인터페이스  
	// : 요소 읽기만 가능하며 수정이나 삭제 등의 기능은 지원하지 않음  
	// : fail-safe 방식으로 객체 순회중 객체 변경 여부와 상관없이 순회를 완료 
	
	// + Iterator 
	// + ListIterator 
	// + Spliterator 
	
	
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
	
		final Enumeration<?> e = null;
		
		// 다음 요소가 있으면 true 없으면 false 반환
		e.hasMoreElements();
		
		// 다음 요소 반환
		e.nextElement();
		
	}
	
	@Test @Ignore 
	public void hasMoreElementsTest() {
	
		final Vector<String> v = new Vector<>();
		
		v.add("a");
		v.add("b");
		v.add("c");
		
		final Enumeration<?> e = v.elements();
		
		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		
	}
	
	@Test 
	public void collectionToEnumerationTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
		
		final Enumeration<?> e = Collections.enumeration(c);

		while(e.hasMoreElements()) 
			System.out.println(e.nextElement());
		
	}
	
}