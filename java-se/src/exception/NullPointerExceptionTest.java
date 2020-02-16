package exception;
	
import org.junit.Ignore;
import org.junit.Test;

public class NullPointerExceptionTest {

	// NullPointerException
	// : 인스턴스를 생성하지 않았는데 객체의 변수에 접근하거나 메소드 호출시 발생
	

	
	@SuppressWarnings("null")
	@Test @Ignore
	public void primitiveTest() {
		
		try {
			
			final Integer integer = null;
			
			final int i = integer.intValue();
			
			System.out.println(i);
			
		} catch(NullPointerException e) {
			e.printStackTrace();
		}

	}
	
	@SuppressWarnings("null")
	@Test
	public void objectTest() {
		
		try {
			
			final Object o = null;
			
			System.out.println(o.toString());
			
		} catch(NullPointerException e) {
			e.printStackTrace();
		}
		
	}
	
}