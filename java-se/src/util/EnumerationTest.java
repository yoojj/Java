package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

import org.junit.Ignore;
import org.junit.Test;

public class EnumerationTest {

	// Enumeration
	// : 열거자  
	// : Vector, HashTable 객체에 저장된 원소에 접근하기 위한 인터페이스  
	// : 객체 순회중 객체 변경 여부와 상관없이 순회 완료  
	
	// + Iterator (jdk 1.2)
	
	
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
	
		final Enumeration<?> e = null;
		
		// 다음 원소가 있으면 true, 없으면 false 반환
		e.hasMoreElements();
		
		// 다음 원소 반환
		e.nextElement();
		
	}
	
	@Test @Ignore 
	public void hasMoreElementsTest() {
	
		final Vector<String> v = new Vector<>();
		
		v.add("A");
		v.add("B");
		v.add("C");
		
		final Enumeration<?> e = v.elements();
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
	@Test
	public void collectionTest() {
		
		final List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		final Enumeration<?> e = Collections.enumeration(list);
		
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		
	}
	
}
