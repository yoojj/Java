package lang;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Ignore;
import org.junit.Test;

public class IntegerTest {

	// Integer
	// : 래퍼 객체 
	// : int 타입을 감싸는-포장하는 객체  

	
	
	@SuppressWarnings("unused")
	@Test @Ignore
	public void test() {
	
		final String str = "100";
		
		// 문자열을 int 타입의 값으로 반환 
		int primitive = Integer.parseInt(str);
		
		// 문자열을 객체로 반환
		Integer object = Integer.valueOf(str);
		
		// 두 값을 비교하여 일치하면 0 반환 
		// 원본 값이 크면 1반환하고 주어진 값이 크면 -1 반환
		object.compareTo(100);
		
		// 값을 바이트로 반환  
		object.byteValue();
		
		// 값을 더블로 반환 
		object.doubleValue();
		
		// 값의 부호 반환 -1, 0, 1
		System.out.println(Integer.signum(-100));
		
		// 값을 2진수 문자열로 반환 
		System.out.println("2진수 :: " + Integer.toBinaryString(100));
		
		// 값을 비트로 변환하여 1의 개수 반환 
		System.out.println("카운트 :: " + Integer.bitCount(100));
		
		// 값을 8진수 문자열로 반환 
		System.out.println(Integer.toOctalString(100));
		
		// 값을 16진수 문자열로 반환 
		System.out.println(Integer.toHexString(100));
		
	}
	
	@SuppressWarnings("unused")
	@Test
	public void convertTest() {
		
		final int[] intArray = {1,2,3,4,5};
		
		final Integer[] array1 = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
		final List<Integer> array2 = Arrays.stream(intArray).boxed().collect(Collectors.toList());
		
		final Integer[] array3 = IntStream.of(intArray).boxed().toArray( Integer[]::new );
		final List<Integer> array4 = IntStream.of(intArray).boxed().collect(Collectors.toList());
		
		for(Integer i : array1) {
			System.out.print(i);
		}
		
		array2.forEach(System.out::print);
		
	}
	
}