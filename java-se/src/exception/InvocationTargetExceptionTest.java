package exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class InvocationTargetExceptionTest {

	// InvocationTargetException
	// : 리플렉션 예외 
	// : 메소드나 생성자 호출시 발생 
	
	
	public int method() {
		return 10/0;
	}
	
	@Test
	public void test() throws Exception {
		
		try {
			
			final Class<?> c = Class.forName("exception.InvocationTargetExceptionTest");
		
			final Object i = c.newInstance();	
	
			final Method m = InvocationTargetExceptionTest.class.getMethod("method");
			
			m.invoke(i);
			
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
	}
	
}