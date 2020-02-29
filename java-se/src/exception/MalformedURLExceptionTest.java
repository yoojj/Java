package exception;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class MalformedURLExceptionTest {

	// MalformedURLException
	// : URL의 protocol의 형식이 잘못되거나 누락되는 경우 발생 
	
	
	
	@Test
	public void test() {
		
		try {
			
			final URL url = new URL("www.ggggoogle.com");
			
			System.out.println(url.getProtocol());

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}
	
}