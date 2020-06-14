package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.junit.Ignore;
import org.junit.Test;

public class SerializableTest {

	// Serializable
	// : 객체 직렬화
	// : 객체를 바이트 형태로 변환하여 전송 가능한 형태로 만듬
	// : 전송시 패킷 형식으로 전송
	// : 메소드는 직렬화 대상에서 제외됨 
	// : 직렬화 제외시 transient 키워드 사용하면 기본 값이 전달됨 
	
	
	// serialVersionUID
	// : 객체 직렬화에 사용하는 값
	// : 정의하지 않으면 JVM이 해당 클래스의 해시 값을 이용하여 자동 생성
	// Serialization Specification
	// https://docs.oracle.com/javase/8/docs/platform/serialization/spec/serialTOC.html

	// ! 데이터를 파일에 저장하거나 네트워크를 통해 객체 전송시 serialVersionUID 정의 필수
	// ! 클래스 필드가 변할 경우 serialVersionUID이 동일하면 오류 발생이 없이 해당 데이터만 누락

	
	// 객체 전송 단계
	// 1. 직렬화된 객체를 바이트 단위로 분해 = 마샬링, 파싱
	// 2. 데이터 순서에 따라 전송
	// 3. 전송받은 데이터를 복구 = 언마샬링
	
	
	// 마샬링 적용 가능한 데이터
	// - Serializable 인터페이스 구현 클래스
	// - Externalizable 인터페이스 : 메소드를 통해 데이터 제어 
	

	// FS
	// FileInputStream, FileOutputStream

	// HTTP
	// HttpServletRequest, HttpServletResponse
	
	
	
	final static String PATH = "/home/jj/바탕화면/test/";
	
	
	
	@Test @Ignore
	public void writeTest() throws IOException {
		
		// JVM이 해석 가능한 바이너리 데이터로 저장
		final FileOutputStream f = new FileOutputStream(PATH + "test");
		final ObjectOutputStream o = new ObjectOutputStream(f);
		
		o.writeInt(10);
		o.writeBoolean(false);
		o.writeUTF("객체 직렬화 테스트");
		
		final Member member = new Member();
		member.setId("아이디");
		member.setPwd("!@#$");
		
		o.writeObject(member);
		
		o.flush();
	 	o.close();
	 	f.close();
	}
	
	@Test
	public void readTest() throws IOException, ClassNotFoundException {
		
		final FileInputStream f = new FileInputStream(PATH + "test");
		final ObjectInputStream o = new ObjectInputStream(f);

		// 저장한 순서와 동일한 순서로 읽음
		System.out.println(o.readInt());
		System.out.println(o.readBoolean());
		System.out.println(o.readUTF());

		final Member member = (Member) o.readObject();

		System.out.println("아이디 :: " + member.getId());
		System.out.println("비밀번호 :: " + member.getPwd());

	 	o.close();
	 	
	}
	
}



class Member implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String Id;
	private transient String pwd;
	
	public String getId() { return Id; }
	public void setId(String Id) { this.Id = Id;}
	
	public String getPwd() { return pwd; }
	public void setPwd(String pwd) { this.pwd = pwd;}

}