package basic.keyword;

import org.junit.Ignore;
import org.junit.Test;

public class Final {

	// final 
	// : 메모리 주소-위치 변경 불가 
	
	
	// final + variable 
	// : 기본 타입에 사용할 경우 재할당 불가 = 상수 
	// : 참조 타입에 사용할 경우 객체 필드들이 final이 아니라면 재할당 가능  

	
	// final + method 
	// : 메소드 재정의 불가  
	
	
	// final + class
	// : 클래스 상속 불가 
	
	
	
	@Test @Ignore
	public void primitiveTest() {
		
		@SuppressWarnings("unused")
		final int num = 0;
		
		// num = 1; 불가 

	}
	
	@Test
	public void referenceTest() {
	
		User test = new User("테스트1");
		System.out.println(System.identityHashCode(test));
		
		test = new User("테스트2");
		System.out.println(System.identityHashCode(test));
		
		@SuppressWarnings("unused")
		final User user = new User("유저"); 

		// user = new User("새유저"); 불가 

	}
	
	class User {
		
		final String name;
		String age;
		
		public User(String name) {
			this.name = name;
		}

		public void setName(String name) {
			// this.name = name; 불가 
		}
		
		public void setAge(String age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "User [name=" + name + ", age=" + age + "]";
		}
		
	}
	
}