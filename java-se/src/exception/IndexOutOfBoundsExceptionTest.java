package exception;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class IndexOutOfBoundsExceptionTest {

	// IndexOutOfBoundsException
	// : 범위를 벗어나는 인덱스-사이즈로 접근을 시도 할 경우 발생  
	
	// + ArrayIndexOutOfBoundsException
	// + StringIndexOutOfBoundsException
	
	
	
	@Test
	public void test() {
		
		try {
			
			final List<String> list = new ArrayList<>();
			
			list.add(0, "0");
			
			System.out.println(list.get(1));		
			
		} catch(IndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
	}
	
}