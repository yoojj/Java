package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.junit.Test;

public class InputMismatchExceptionTest {

	// InputMismatchException
	// : 맞지않는 데이터 타입 데이터를 입력 받을 경우 발생
	// : 데이터 타입 범위를 넘어선 경우 발생
	
	
	
	@Test
	public void test() {
		
		try(final Scanner s = new Scanner(System.in)) {
			
			System.out.println("숫자 입력 >>");
			int num = s.nextInt();
			System.out.println("결과 : " + num);
			
		} catch(InputMismatchException e){
			
			System.out.println("잘못입력했습니다. " );
			
			e.printStackTrace();
			
		} 
		
	}
	
}