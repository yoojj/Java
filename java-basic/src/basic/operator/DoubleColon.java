package basic.operator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class DoubleColon {

	// Double Colon 
	// = Method Reference
	// : 메소드를 직접 참조하여 호출하는 연산자  
	
	
	
	@Test @Ignore
	public void doubleColonTest01() {
		
		final List<Integer> num = Arrays.asList(1,2,3,4,5);
		
		num.forEach( i-> System.out.println(i) );
		
		num.forEach(System.out::println);
		
	}
	
	@Test 
	public void doubleColonTest02() {
		
		final List<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		
		list.forEach(SomeClass::someStaticMethod);
		
		list.forEach((new SomeClass())::someMethod);
		
	}
	
	
}



class SomeClass {
	
	static void someStaticMethod(String str) {
		System.out.println( "static : " + str );
	}
	
	public void someMethod(String str) {
		System.out.println(str);
	}
	
}