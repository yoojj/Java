package lang.reflect;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.Test;

public class ArrayTest {
	
	@Test
	public void test() {
		
		final int len = 5;
		
		final Object obj = Array.newInstance(Integer.class, len);
		
		for(int i=0; i<len ; ++i) {
			Array.set(obj, i, i);
		}
		
		System.out.println(Arrays.toString((Object[]) obj));
		
	}

}