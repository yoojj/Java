package util;

import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

public class ArraysTest {

	// Arrays
	// : 배열을 위한 정적 메소드를 제공하는 유틸리티 클래스 
	
	
	
	@Test @Ignore
	public void test() {
		
		// 해당 배열을 리스트로 반환 
		Arrays.asList(new Object[0]);
		
		// 해당 배열에 주어진 인덱스부터 복사해 반환 
		Arrays.copyOf(new Object[0], 0);
		
		// 해당 배열에 주어진 인덱스 범위 만큼 복사해 반환 
		Arrays.copyOfRange(new Object[0], 0, 1);
		
		// 배열 얕은 비교
		Arrays.equals(new Object[0], new Object[0]);
		
		// 배열 깊은 비교 
		Arrays.deepEquals(new Object[0], new Object[0]);
		
		// 오름 차순 정렬 
		Arrays.sort(new Object[0]);
		
		// 주어진 값으로 배열을 채움
		Arrays.fill(new Object[0], 0);
		Arrays.setAll(new Object[0], x -> x );
		
	}
	
	@Test @Ignore 
	public void asListTest() {
	
		// Arrays.asList 
		// : 배열을 받아서 리스트 형태로 반환 
		// : 이때 리스트의 크기는 배열의 크기와 같고 변경 불가능 unmodifiable List
		// : 고정된 리스트를 원하는 경우나 배열에 리스트 기능을 이용하고 싶을 때 사용 
		
		final List<String> list = Arrays.asList(new String[5]);

		try {
			// 직접 변경 불가
			list.add(0, "add");
			
		} catch(UnsupportedOperationException e) {
			e.getMessage();
		}

		// 변경 가능
		list.set(0, "set");
		
		list.forEach(System.out::print);
		
	}
	
	@Test @Ignore 
	public void fillTest() {
		
		final Object[] arr = new Object[5];
		
		Arrays.fill(arr, 1);
		
		for(int i=0, len = arr.length ; i < len ; ++i) {
			System.out.println(arr[i]);
		}
		
	}
	
	@Test @Ignore 
	public void setAllTest() {
		
		final Object[] arr = new Object[5];
		
		Arrays.setAll(arr, x -> ++x );
		
		for(int i=0, len = arr.length ; i < len ; ++i) {
			System.out.println(arr[i]);
		}
		
	}
	
}