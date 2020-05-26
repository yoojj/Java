package util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.Ignore;
import org.junit.Test;

public class ScannerTest {

	// Scanner
	// : 키보드 입력을 읽어 문자열로 얻거나 파일을 읽어 문자열로 얻는 기능을 지원하는 클래스  
	
	
	
	@Test @Ignore
	public void inputStreamTest() {
	
		final Scanner s = new Scanner(System.in);

		System.out.println("문자 입력 >>");
		String str = s.nextLine();
		System.out.println("결과 : " + str);
		
		System.out.println("숫자 입력 >>");
		int num = s.nextInt();
		System.out.println("결과 : " + num);
		
		s.close();
		
	}
	
	@Test
	public void fileTest() throws FileNotFoundException {
		
		final String path = "/home/jj/바탕화면/test/file";
		
		final Scanner s = new Scanner(new File(path));
		
		while(s.hasNext()) {			
			System.out.println(s.next());
		}
		
		s.close();
		
	}
	
}