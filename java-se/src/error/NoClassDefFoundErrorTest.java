package error;

import org.junit.Test;

import xxx.Temp;

public class NoClassDefFoundErrorTest {

	// NoClassDefFoundError
	// : 컴파일시 해당 클래스가 존재하나 런타임시 해당 클래스를 찾을 수 없거나
	//   해당 클래스가 있는 경우 정적 변수, 정적 블록 초기화시 예외가 발생하는 경우 발생  
	
	// + ClassNotFoundException

	
	
	@SuppressWarnings("unused")
	@Test
	public void test() {

		try {
			
			// Temp.class 제거 후 실행 
			final Temp t = new Temp();
			
		} catch (NoClassDefFoundError e){
			e.printStackTrace();
        }
	
	}
	
}