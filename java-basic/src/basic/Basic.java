package     basic;

// 공백은 영향을 미치지 않음
public      class      Basic {

	/* package문과 import문을 제외한 모든 코드는 클래스 안에 존재 */

	

	private static int count = 10;
	
	// 프로그램 실행시 가장 먼저 호출되는 메소드  
	public static void main(String...args) {
		
		// JVM start 
		// 1. 클래스 로더에 의해 클래스들 로드
		// 2. 준비가 되면 메인 스레드 생성
		// 3. 메인 스레드가 엔트리 포인트가 지정된 클래스를 찾아 메인 메소드 호출

		// 메인 메소드를 포함한 클래스 = 실행 클래스
		// 프로그램 종료 = 메인 메소드 종료

		// 자바 프로그램은 하나의 메인 메소드를 포함해야 실행 가능
		// 애플릿과 서블릿은 메인 메소드 대신 유사한 메소드 사용

		

		System.out.println("메인 메소드 호출 :: " + (count--) );

		if( count != 0 ) {
			main();
		}

		// 오버로드한 메인 메소드 
		main("실행");
		
	}

	public static void main(int num, String ...str) {
		System.out.println("오버로드 가능하나 자동으로 호출되지 않음");
	}

	public static void main(String str) {
		System.out.println("오버로드한 메인 메소드 :: " + str);
	}

}