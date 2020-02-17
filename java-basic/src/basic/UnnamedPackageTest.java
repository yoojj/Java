package basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class UnnamedPackageTest {

	@Test
	public void unnamedPackageTest() throws IllegalAccessException, IllegalArgumentException, 
		InvocationTargetException, NoSuchMethodException, SecurityException, ClassNotFoundException, 
		InstantiationException {
			
		Class<?> c = Class.forName("UnnamedPackage");

		System.out.println( c );
	
		Method m = c.getMethod("unnamedPackageMethod", String.class);	
		
		System.out.println( m );
			
		Object i = c.newInstance();	
		Object o = m.invoke(i, "호출");
		
		System.out.println( o );
		
	}
	
	
}