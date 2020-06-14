package sql;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

public class DriverPropertyInfoTest {

	// DriverPropertyInfo

	
	
	private String url;
	
	@Before
	public void before() throws IOException, SQLException {

		final Properties p = new Properties();
		final InputStream i = getClass().getClassLoader().getResourceAsStream("sql/db.properties");	
		
		p.load(i);
		
		this.url = (String) p.get("JDBC.ConnectionURL");

		i.close();
		
	}
	
	@Test
	public void test() throws SQLException {
		
		final Driver driver = DriverManager.getDriver(url);

		final DriverPropertyInfo[] props = driver.getPropertyInfo(url, null);
		
		for(DriverPropertyInfo p : props) {
			System.out.println(p.name + " :: " + p.value);
		}
		
	}
	
}