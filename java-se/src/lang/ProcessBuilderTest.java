package lang;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.Test;

public class ProcessBuilderTest {

	// ProcessBuilder
	// : 운영 체제 프로세스 제어, 외부 명령 실행
	// : Runtime.exec() 대체  

	
	
	@Test
	public void test() {
		
		final ProcessBuilder pb = new ProcessBuilder();
		
		pb.command(new String[] {"curl", "https://google.com"});

		try {
			
			final Process p = pb.start();

			final BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			
			String str = null;
			while( (str = br.readLine()) != null ) {	
				System.out.println(str);
			}
			
		    int exitCode = p.waitFor();
		    System.out.println("error code : " + exitCode);
		    
		} catch (IOException | InterruptedException  e) {
			e.printStackTrace();
		}
		
	}
	
}