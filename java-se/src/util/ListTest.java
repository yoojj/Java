package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

public class ListTest {

	// List
	// : 약 20개 메소드를 지원하는 인터페이스    
	// : 요소-데이터 중복 가능
	// : 배열과 유사하나 배열은 크기가 고정이고 리스트는 가변  
	// : 리스트 중간에 요소 삽입 및 삭제가 가능하나 이때 다른 요소들이 이동하므로 사용시 유의 

	
	// 구현
	// - Vector
	// - Stack 
	// - ArrayList
	// - LinkedList 
	
	
	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
	
		final List<String> list = null;
		
		// 요소 추가 
		list.add(null);
		
		// 해당 인덱스에 요소 추가 
		list.add(0, null);
		list.set(0, null);
		
		// 해당 인덱스에 존재하는 요소 반환 
		list.get(0);		
		
		// 해당 요소가 존재하면 요소의 인덱스를 반환하고 존재하지 않으면 -1 반환  
		list.indexOf(null);
		
	}
	
	@Test @Ignore
	public void indexOfTest() {
		
		final List<Integer> list = Arrays.asList(1,2,3,4,5);

		System.out.println(list.indexOf(null) == -1);
		
	}
	
	@Test @Ignore
	public void listToArrayTest() {
		
		final List<?> list = Arrays.asList("a", "b", "c");
		
		//final String[] arr = list.toArray(new String[list.size()]);
		final String[] arr = list.stream().toArray(String[]::new);
		
		Arrays.stream(arr).forEach(System.out::print);
	
	}
	
	@Test @Ignore
	public void arrayToListTest() {
		
		final String[] arr = {"a", "b", "c"};
		
		final List<?> list = Arrays.stream(arr).collect(Collectors.toList());
		
		final ArrayList<?> arrayList = Arrays.stream(arr).collect(Collectors.toCollection(ArrayList::new));
		
		list.forEach(System.out::print);
		
		arrayList.forEach(System.out::print);
		
	}
	
}