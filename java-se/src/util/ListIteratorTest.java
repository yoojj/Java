package util;

import java.util.ListIterator;

import org.junit.Ignore;
import org.junit.Test;

public class ListIteratorTest {

	// ListIterator
	// : Iterator를 상속한 인터페이스
	// : 요소에 대해 CRUD 기능을 지원하며 단방향 순회 및 양방향 순회 가능 
	// : List 인터페이스를 구현한 클래스에서만 사용 가능  
	


	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
	
		final ListIterator<?> i = null;
		
		// 요소 추가 
		i.add(null);
		
		// 이전 요소가 있으면 true 없으면 false 반환
		i.hasPrevious();
		
		// 다음 요소가 있으면 true 없으면 false 반환
		i.hasNext();
		
		// 이전 요소 반환
		i.previous();
		
		// 다음 요소 반환
		i.next();
		
		// 이전 요소의 인덱스 반환
		i.previousIndex();
		
		// 다음 요소의 인덱스 반환
		i.nextIndex();
		
		// previous()나 next()로 반환한 요소를 주어진 요소로 변경  
		i.set(null);
		
		// previous()나 next()로 반환된 요소 삭제 
		i.remove();
		
	}
	
}