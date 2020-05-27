package basic.exception;

import org.junit.Test;

public class TryCatch {

	@Test 
	public void test() {
		
		try {
			
			/* 예외 발생 가능성이 있는 영역 */
			
			final int[] array = {1,2,3,4,5};

			System.out.println(array[10]);
			
			System.out.println("예외 발생시 실행되지 않음");
		
		} catch(ArrayIndexOutOfBoundsException e) {
			
			/* 예외가 발생할 경우 처리 영역 */
			
			System.out.println(e.getMessage());
			
		} catch(Exception e) {
			
			// 예외 메시지 출력 
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
			
			// 예외 클래스나 발생한 메소드와 예외 메시지를 한 줄로 출력 
			System.out.println(e.toString());

			// 예외가 발생한 메소드와 오류 메시지 전체를 단계별로 출력 
			e.printStackTrace();
			
			for(StackTraceElement trace : e.getStackTrace()) {
				
				System.out.print(trace.getClassName() + "::");
				System.out.println(trace.getMethodName());	
				
			}
			
		}
		
	}

}