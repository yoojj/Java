package nio;

import java.nio.charset.StandardCharsets;

import org.junit.Test;

public class StandardCharsetsTest {

	// StandardCharsets
	// - UTF_8 
	// - UTF_16 
	// - UTF_16BE 
	// - UTF_16LE 
	// - US_ASCII
	// - ISO_8859_1 

	
	
	@Test
	public void test() {
		
		final byte[] bytes = { 65, 66, 67, 68, 69 };
		final String str = new String(bytes, StandardCharsets.UTF_8);
		
		System.out.println(str);
		
	}
	
}