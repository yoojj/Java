public class UnnamedPackage {

	// unnamed package
	// = default package, anonymous package
	// : 패키지를 생성하지 않으면 생기는 이름없는 패키지   
	// : 디폴트 패키지에 존재하는 클래스들은 정식 이름이 없어 import 불가
	// : import 대신 리플렉션으로 사용 가능 
	
	
	
	public String unnamedPackageMethod(String str) {
		return "unnamed package " + str;
	}
	
}