package basic;

import org.junit.Ignore;
import org.junit.Test;

public class Block {
	
	// Block
	// : 클래스와 메소드가 구현되는 영역 
	// : 0개 이상의 명령문을 중괄호 기호로 그룹화한 영역  
	// : 블록문에서 선언된 변수는 해당 블록에서만 사용 가능
	// : 외부 블록에서 선언된 변수는 내부 블록에서 사용 가능 
	
	

	static {
		
		// 클래스 초기화 블록, 정적 초기화 클록 
		// : JVM에 의해 클래스가 로드되는 시점에 한 번만 실행 
		
		System.out.println("1. Static initialization");
		
	}
	
	{
		
		// 인스턴스 초기화 블록
		// : 인스턴스 생성시 생성자보다 먼저 실행
		
		// 인스턴스 생성
		// 1. super 생성자 호출 및 실행  2. 인스턴스 초기화 블록 실행  3. 생성자 실행 
		
		System.out.println("2. Instance initialization");
		
	}
	
	public Block(){
		System.out.println("3. Constructor");
	}
	
	class Child extends Block {
		
		{
			System.out.println("child :: Instance initialization");
		}
		
		public Child() {
			System.out.println("child :: Constructor");
		}
		
	}
	
	@Test @Ignore
	public void test() {
		new Child();
	}

	

	{{{ num = 10; }}}
	
	int num = 0;
	
	@Test @Ignore
	public void feildInitTest() {
		System.out.println(num);
	}
	
	{ num = 100; }
	
	
	
	@Test
	public void doubleBraceInitTest() {
		
		// 이중 괄호 초기화
	
		final Block b = new Block() {{ 
			// 바깥 괄호 : 익명 내부 클래스
			// 안쪽 괄호 : 초기화 블록 - 객체 생성과 함께 필드 초기화 
			num = 999; 
		}};
		
		System.out.println( b.num );
		
	}

}