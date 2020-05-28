package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

public class CollectionTest {

	// Collection 
	// : Map을 제외한 모든 JCF의 루트 인터페이스    
	

	
	@SuppressWarnings("null")
	@Test @Ignore
	public void test() {
		
		final Collection<?> c = null;
		
		// 요소 추가
		c.add(null);
		
		// 해당 요소 제거
		c.remove(null);
		
		// 모든 요소 제거
		c.clear();
		
		// 요소 포함 여부 반환 
		c.contains(null);

		// 요소 개수 반환 
		c.size();
		
		// 비었으면 true 반환
		c.isEmpty();
		
		// 요소를 배열로 반환 
		c.toArray();
		
		// Iterator 반환 
		c.iterator();
		
		// jdk8
		c.spliterator();
		
		// jdk8
		c.stream();
		
		// jdk8
		c.parallelStream();
		
		// jdk8
		c.removeIf(null);
		
	}
	
	@Test
	public void streamTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
			
		final List<String> list = c.stream().filter(i -> i <=3).map(Object::toString).collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
	}
	
}