package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class FileNotFoundExceptionTest {

	// FileNotFoundException
	// : 지정된 경로에 파일이 없거나 파일에 접근할 수 없을 경우 발생

	// 1. 경로 확인
	// 2. 파일 여부 확인
	// 3. 파일 명 확인 (\r\n)
	// 4. 파일 권한 확인
	
	

	@Test
	public void test() {
		
		try(final FileReader file = new FileReader(new File(""));) {
		
			int data = 0;
			
			while( (data = file.read()) != -1) {
				System.out.println((char)data);
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}