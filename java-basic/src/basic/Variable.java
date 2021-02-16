package basic;

import org.junit.Ignore;
import org.junit.Test;

public class Variable {

	final static String CONSTANT = "상수";
	
	static String staticVariable = "정적 변수";

	final String finalVariable = "최종 변수";
	
	String variable = "인스턴스 변수";
	
	
	
	@Test @Ignore
	public void test() {

		System.out.println(Variable.CONSTANT);
		System.out.println(Variable.staticVariable);
		
		final Variable var = new Variable();
		
		System.out.println(var.finalVariable);
		System.out.println(var.variable);
		
	}
	
	@SuppressWarnings("unused")
	@Test @Ignore 
	public void localVariable() {

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
	
	private String method(String parameter) {
		return parameter;
	}
	
}