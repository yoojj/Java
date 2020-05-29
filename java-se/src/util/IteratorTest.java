package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class IteratorTest {

	// Iterator
	// : 반복자, 열거자, 순환자  
	// : 컬렉션 객체에 저장된 요소에 접근하기 위한 인터페이스  
	// : 요소 읽기와 삭제 기능 지원  
	// : fail-fast 방식으로 객체 순회중 객체 변경이 감지되면 순회를 중단하고 예외 리턴  
	// : 단방향 순회만 지원하며 양방향 순회가 필요한 경우 ListIterator 사용   

	
	// + Enumeration  (jdk 1.0)
	// + ListIterator (jdk 1.2)
	// + Spliterator  (jdk 1.8)

	
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
		
		final Iterator<?> i = null;
		
		// 다음 요소가 있으면 true 없으면 false 반환
		i.hasNext();
		
		// 다음 요소 반환
		i.next();
		
		// next()로 반환된 요소 삭제 
		i.remove();
		
		// 조건 전까지 요소에 대해 주어진 작업 반복 (jdk8)
		i.forEachRemaining(null);

	}

	@Test @Ignore
	public void hasNextTest() {
		
		final Iterator<Integer> i = Arrays.asList(1,2,3,4,5).iterator();
		
		final List<Integer> list = new ArrayList<>();
		
		while(i.hasNext()) 
			list.add(i.next());
		
		list.forEach(System.out::println);
		
	}
	
	@Test
	public void forEachRemainingTest() {
		
		final Iterator<Integer> i = Arrays.asList(1,2,3,4,5).iterator();
		
		final List<Integer> list = new ArrayList<>();
		
		i.forEachRemaining(list::add);

		list.forEach(System.out::println);
		
	}
	
}