package basic.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.swing.Timer;

import org.junit.Ignore;
import org.junit.Test;

public class Lambda {

	// Lambda
	// : 이름없는 메소드
	// : 클래스에 종속되지 않으므로 메소드보다 함수에 가까움
	
	
	// 람다 (람다 파라미터) -> { 람다 바디 } 
	
	// 중괄호 생략 가능 
	// : 매개 변수가 하나이면서 타입 유추가 가능한 경우 
	// : 실행문이 1개 인 경우 
	
	

	@Test @Ignore
	public void lambdaTest01() {
		
		final List<Integer> list = Arrays.asList(1,2,3,4,5);
		final List<Integer> newList = new ArrayList<>();
		
		list.forEach( i -> newList.add(i+100) );
		
		System.out.println(newList);
		
	}
	
	@Test @Ignore
	public void lambdaTest02() throws InterruptedException {
		
		final Timer t = new Timer(3000, e -> System.out.println("람다!"));
		t.start();

		for(int i=0; i<10 ; i++){
			Thread.sleep(1000);
			System.out.println(i);
		}
		
	}
	
	@Test 
	public void lambdaTest03() {
		
		final LambdaInterface<String> test = value -> System.out.println("람다 :" + value);
		
		test.method("테스트");
		
	}

}