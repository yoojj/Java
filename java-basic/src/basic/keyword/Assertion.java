package basic.keyword;

import org.junit.Test;

public class Assertion {

	// assert
	// : 조건이 참이 아닌 경우 예외 발생     
	// : 성공, 실패, 비활성화 상태에 따른 처리 방법 각각 필요
	// : 항상 실행된다는 보장이 없으므로 public 메소드에 사용이 적합하지 않음
	
	
	// 테스트와 디버깅시 활성화하고 배포시 비활성화 (코드에는 포함되고 실행시 JVM이 무시) 
	// java -ea -- 활성화
	// java -da -- 비활성화 

	
	// assert : 키워드
	// Assert : 클래스 

	

	@Test
	public void test() {
		
		try {
			
			this.insertNum(100);
			
		} catch(AssertionError e){
			e.printStackTrace();
		}
		
	}
	
	private void insertNum(int num) {
		
		assert num >= 1 && num <= 10 : "값이 조건에 맞지 않습니다.";
		
		System.out.println("입력된 값 :: " + num);
		
	}

}