package sql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class DriverManagerTest {

	// DriverManager
	// : JDBC 드라이버 관리
	
	
	
	private String url;
	private String user;
	private String password;
	
	@Before
	public void before() throws IOException {

		final Properties p = new Properties();
		final InputStream i = getClass().getClassLoader().getResourceAsStream("sql/db.properties");	
		
		p.load(i);
		
		this.url = (String) p.get("JDBC.ConnectionURL");
		this.user = (String) p.get("JDBC.Username");
		this.password = (String) p.get("JDBC.Password");

		i.close();
		
	}
	
	@Test @Ignore
	public void test() throws SQLException {
		
		// 해당 드라이버 등록 
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		// 해당 드라이버를 찾음  
		DriverManager.getDriver("");

		// 해당 디비에 연결 시도 
		DriverManager.getConnection("");

	}
	
	@Test @Ignore
	public void driverTest() throws SQLException, ClassNotFoundException {
		
		// DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		
		// 해당 클래스의 인스턴스가 생성되고 이후 DriverManager에 등록 	
		// Class.forName("com.mysql.cj.jdbc.Driver");
		
		// JDBC4부터는 JDBC 드라이버 자동 로드
		final Driver driver = DriverManager.getDriver("jdbc:mysql:");
		
		System.out.println(driver);
		
	}
	
	@Test 
	public void connectionTest() throws SQLException {
		
		final Connection c = DriverManager.getConnection(url, user, password);
		
		System.out.println(c);
	
		c.close();
		
	}

}