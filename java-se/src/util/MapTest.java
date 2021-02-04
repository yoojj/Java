package util;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Test;

public class MapTest {

	// Map
	// : key-value pair 
	// : 키는 중복되지 않으며 중복될 경우 마지막 키가 사용됨
	// : 키와 값은 각각 객체로 기본 타입 사용시 자동으로 참조 타입으로 변경됨 
	
	// ! Collection 인터페이스를 구현하지 않음
	
	
	// 서브 인터페이스
	// - NavigableMap
	// - SortedMap
	// - ConcurrentMap
	// - ConcurrentNavigableMap
	
	
	
	@SuppressWarnings("null")
	@Test
	public void test() {
		
		final Map<?, ?> map = null;
		
		// 키-값 저장 
		map.put(null, null);
		
		// 해당 키의 값 반환 
		map.get(null);
		
		// 해당 키가 존재하면 true 반환 
		map.containsKey(null);
		
		// 해당 값이 존재하면 true 반환
		map.containsValue(null);
		
		// 해당 키의 값을 반환하고 해당 키와 값은 삭제 
		map.remove(null);
		
		// 모든 요소 제거 
		map.clear();
		
		map.forEach( (k, v) -> {
			System.out.println("key : " + k);
			System.out.println("value : " + v);
		});
		
	}
	
	@SuppressWarnings({ "null", "unused" })
	@Test
	public void entrySetTest() {
		
		final Map<?, ?> map = null;
		
		for(Entry<?, ?> e : map.entrySet()) {
			
			e.getKey();
			e.getValue();
			
		}
		
		final Iterator<?> i = map.entrySet().iterator();
		
	}
	
	@SuppressWarnings({ "null", "unused" })
	@Test
	public void keySetTest() {
		
		final Map<?, ?> map = null;
		
		final Set<?> set = map.keySet();
		
		final Iterator<?> i = set.iterator();
		
	}
	
}