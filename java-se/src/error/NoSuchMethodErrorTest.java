package error;

import org.junit.Test;

import xxx.Temp;

public class NoSuchMethodErrorTest {

	// NoSuchMethodError
	// : 존재하지 않는 메소드 호출시 발생
	// : 컴파일시에는 컴파일러에 의해 체크되며 런타임시 발생하는 오류     
	// : 라이브러리, 모듈, 프레임워크 사용중 문제가 된다면 종속성과 버전 확인
	
	
	
	@Test
	public void test() {

		// Temp 클래스의 메소드를 변경하고 터미널로 실행
		final Temp temp = new Temp();
		
		temp.method();
		
	}
	
}