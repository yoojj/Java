package basic.exception;

import java.util.Scanner;

import org.junit.Test;

public class TryWithResources {

	@Test
	public void test() {
		
		// try-catch-finally 대체
		
		try(final Scanner s = new Scanner(System.in)) {
			
			System.out.println("문자 입력 >>");
			String str = s.nextLine();
			System.out.println("결과 : " + str);
			
		} catch(Exception e){
			
			e.printStackTrace();
			
		} 
		
	}

}