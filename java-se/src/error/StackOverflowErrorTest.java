package error;

import org.junit.Test;

public class StackOverflowErrorTest {

	// StackOverflowError
	// : 스택 메모리 부족으로 발생하는 오류   
	// : 일반적으로 재귀함수가 종료되지 않은 경우 발생   
	
	// + OutOfMemoryError
	
	

	@Test
	public void test() {
		
		count(1);
	}
	
	public void count(int i) {
	
		System.out.println(i);
		
		if( i <= 0 ) return;
		else count(++i);

	}
	
}