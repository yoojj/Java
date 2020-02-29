package lang;

import org.junit.Ignore;
import org.junit.Test;

import xxx.Temp;

public class ClassTest {

	// Class
	// : 클래스 로드시 JVM에 의해 자동 생성되는 클래스 == 생성자 없음 
	// : 실행중인 클래스와 인터페이스의 정보를 담는 클래스   

	
	
	@Test @Ignore
	public void classTest01() throws ClassNotFoundException {
		
		// 정적 - 컴파일 타임 
		//final Class<?> c = String.class;
				
		// 동적 - 런타임 
		//final Class<?> c = Class.forName("java.lang.String");
		
		// 객체 생성
		final Class<?> c = new String().getClass();
		
		System.out.println( c.getName() );
		System.out.println( c.getSimpleName() );
		
	}
	
	@Test
	public void classTest02() throws Exception {

		// 동적 객체 생성  
		final Class<?> c = Temp.class;
		
		final Object obj = c.newInstance();
		
		System.out.println( obj instanceof Temp );

	}
	
}