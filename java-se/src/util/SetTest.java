package util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Ignore;
import org.junit.Test;

public class SetTest {

	// Set
	// : 순서와 상관없이 요소를 저장하며 중복되는 요소는 저장하지 않음 
	// : 중복 요소를 저장하지 않으므로 null 요소도 하나만 저장됨  
	// : hashCode()와 equals() 결과로 중복 여부를 확인
	// : hashCode() 리턴 값으로 저장 위치를 계산하여 인덱스 사용 불가 
	// : 속도는 빠르나 정렬에 대한 별도의 처리 필요
	
	
	// 구현
	// - EnumSet
	// - HashSet 
	// - LinkedHashSet 
	// - TreeSet   
	


	@SuppressWarnings({ "null", "unchecked", "rawtypes" })
	@Test @Ignore
	public void test() {
		
		final Set<?> s1 = null;
		final Set<?> s2 = null;
		
		// s2와 s1이 부분 집합이면 true 반환 
		s1.containsAll(s2);
		
		// s1을 s1과 s2의 합집합으로 만듬 
		s1.addAll((Collection) s2);
		
		// s1을 s1과 s2의 교집합으로 만듬
		s1.retainAll(s2);
		
		// s1을 s1과 s2의 차집합으로 만듬
		s1.removeAll(s2);
		
	}
	
	@Test @Ignore
	public void hashAndTreeTest() {
		
		final String[] arr = {"C", "B", "A", "A", "A", "c", "b", "a"};
		
		final Set<String> hashSet = new HashSet<>();
		Arrays.stream(arr).forEach( a -> hashSet.add(a) );
		System.out.println(hashSet);
		
		final Set<String> treeSet = new TreeSet<>();
		Arrays.stream(arr).forEach( a -> treeSet.add(a) );
		System.out.println(treeSet);
	
	}
	

	
	class UserA {
		
		private String name;

		public UserA(String name) {
			this.name = name;
		}
		
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (this.getClass() != obj.getClass()) return false;
			
			UserA other = (UserA) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			
			return true;
		}
		
		@Override
		public String toString() {
			return "UserA [name=" + name + "]";
		}
	
		
	}
	
	class UserB {
		
		private String name;

		public UserB(String name) {
			this.name = name;
		}
		
		public String getName() {return name;}
		public void setName(String name) {this.name = name;}

		@Override
		public String toString() {
			return "UserB [name=" + name + "]";
		}
	
	}

	@Test @Ignore 
	public void removeTest() {

		final Set<UserA> setA = new HashSet<>();
		final Set<UserB> setB = new HashSet<>();
		
		final UserA a = new UserA("A");
		final UserB b = new UserB("B");
		
		setA.add(a);setA.add(new UserA("A"));
		setB.add(b);setB.add(new UserB("B"));
		
		setA.remove(a);
		setB.remove(b);
		
		System.out.println(setA.size()==0);
		System.out.println(setB.size()==1);
		
	}
	
	@Test
	public void setToListTest() {
		
		final Set<String> set = new HashSet<>();
		
		set.add(null);
		set.add("1");
		set.add("2");
		set.add("3");

		final List<String> list = this.convertSetToList(set);
		
		list.forEach(System.out::println);
		
	}
	
	private <T> List<T> convertSetToList(Set<T> set) {
		
		final List<T> list = new ArrayList<>(); 
		
		for (T t : set) 
			list.add(t); 
		
		return list;
	}

}