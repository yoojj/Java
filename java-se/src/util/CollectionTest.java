package util;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.Collectors;

import org.junit.Ignore;
import org.junit.Test;

public class CollectionTest {

	// Collection 
	// : Map을 제외한 모든 JCF의 루트 인터페이스    
	// : Collection을 구현한 클래스는 Collection 타입을 인수로 갖는 생성자가 존재해 컬렉션 타입 변환 가능    
	//   CollectionClass (Collection<? extends E> c)
	
	
	
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
	
	@Test @Ignore
	public void forEachTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
		
		for (Object o : c)
			System.out.println(o);
		
	}
	
	@Test @Ignore
	public void iteratorTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
		
		final Iterator<?> i = c.iterator();
		
		while(i.hasNext())
			System.out.println(i.next());
		
	}
	
	@Test @Ignore
	public void arrayTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
		
		final Object[] arr = c.toArray();
		
		for(int i = 0, len = arr.length ; i < len ; ++i) 
			System.out.println(arr[i]);
		
	}
	
	@Test @Ignore
	public void streamTest() {
		
		final Collection<Integer> c = Arrays.asList(1,2,3,4,5);
			
		final Collection<String> filter = c.stream().filter(i -> i <=3).map(Object::toString).collect(Collectors.toList());
		
		filter.forEach(System.out::println);
		
	}
	
}