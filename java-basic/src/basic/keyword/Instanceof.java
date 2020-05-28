package basic.keyword;

import org.junit.Test;

public class Instanceof {

	class A {}
	class B extends A {}
	
	@Test 
	public void test() {
		
		final A a = new A();
		final B b = new B();
		
		System.out.println( a instanceof A );
		System.out.println( b instanceof A );
		System.out.println( b instanceof B );

		System.out.println( a instanceof B );
		
	}
	
}