package basic.exception;

import org.junit.Ignore;
import org.junit.Test;

public class TryCatchFinally {

	@Test @Ignore
	public void test() {
		
		try {
			
			System.out.println("try");
			
		} finally {
			
			/* try 영역이나 catch 영역 실행 후 무조건 실행되는 영역 */

			System.out.println("finally");
			
		}
		
	}
	
	@Test
	public void returnTest() {
		
		System.out.println(this.getStr("string"));
	
	}
	
	private String getStr(String str) {
		
		try {
			
			System.out.println("try" + 0/0);
			
			return str;
			
		} catch(Exception e){
			
			System.out.println(e.getMessage());
			
			return "error";
					
		} finally {

			System.out.println("finally");

		}
		
	}

}