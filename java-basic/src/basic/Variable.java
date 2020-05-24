package basic;

import org.junit.Ignore;
import org.junit.Test;

public class Variable {

	final static String CONSTANT = "상수";
	
	static String staticVariable = "정적 변수";

	final String finalVariable = "최종 변수";
	
	String variable = "인스턴스 변수";
	
	
	
	@Test 
	public void test() {

		System.out.println(Variable.CONSTANT);
		System.out.println(Variable.staticVariable);
		
		Variable var = new Variable();
		
		System.out.println(var.finalVariable);
		System.out.println(var.variable);
		
	}
	
	@SuppressWarnings("unused")
	@Test @Ignore
	public void localVariable() {
		
		// 지역 변수 
		// : 메소드 안에서 선언된 변수 
		// : 선언된 메소드 안에서만 사용 가능 
		String localVariable = "지역 변수";
		
		System.out.println(localVariable);
		
		// 선언만 할 경우 에러가 나지 않으나 
		String str;
		
		// 초기화하지 않은 변수는 참조할 수 없음
		//System.out.println(str);
		
	}
	
	@Test @Ignore 
	public void parameterTest() {
		
		System.out.println(method("매개변수"));
		
	}
	
	public String method(String parameter) {
		return parameter;
	}
	
}