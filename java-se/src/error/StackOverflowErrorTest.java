package error;

import org.junit.Test;

public class StackOverflowErrorTest {

	// StackOverflowError
	// : 스택 메모리 부족시 발생하는 오류   
	
	// : 재귀 호출로 인한 오류시 종료 시점을 확인하고 
	//   특별한 경우가 아니면 재귀 호출을 반복문으로 수정

	// : 수많은 메소드와 로컬 변수 사용으로 인한 스택 메모리 부족시
	//   JVM 옵션을 통해 스택 메모리 크기를 늘릴 것
	
	

	@Test
	public void test() {
		
		try {

			this.count(1);
			
		} catch (StackOverflowError e){
			e.printStackTrace();
        }
		
	}
	
	private void count(int i) {
	
		System.out.println(i);
		
		if( i <= 0 ) return;
		else count(++i);

	}
	
}