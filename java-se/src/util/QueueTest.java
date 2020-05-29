package util;

import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;

import org.junit.Ignore;
import org.junit.Test;

public class QueueTest {

	// Queue
	// : Queue 자료 구조를 따르는 인터페이스 
	// : 선입선출 FIFO 형태로 요소를 보관    
	// : 후단 tail에서 요소를 추가하고 전단 head에서 요소를 인출-삭제함  

	
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
		
		final Queue<?> que = null;
		
		// 후단에 요소 삽입
		// 저장을 실패하면 exception을 던짐 
		que.add(null);
		
		// 후단에 요소 삽입
		// 저장을 실패하면 false 반환 
		que.offer(null);
		
		// 전단에 있는 요소 반환 
		// 요소가 없으면 exception을 던짐 
		que.element();
		
		// 전단에 있는 요소 반환
		// 요소가 없으면 null 반환 
		que.peek();
		
		// 전단에 있는 요소 제거
		// 요소가 없으면 exception을 던짐
		que.remove();
		
		// 전단에 있는 요소를 반환하고 해당 요소 제거
		// 요소가 없으면 null 반환  
		que.poll();
		
	}
	
	@Test 
	public void removeTest() {
		
		final Queue<String> que = new PriorityQueue<>();

		try {
			
			que.remove();
			
		} catch(NoSuchElementException e) {
			e.printStackTrace();
		}
		
	}
	
}