package naming;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.Ignore;
import org.junit.Test;

public class InitialContextTest {
	
	@Test @Ignore
	public void bindTest() throws NamingException {
		
		final Context context = new InitialContext();
		
		context.bind("JNDI context", "object");
		
	}
	
	@Test @Ignore
	public String lookupTest() throws NamingException {
	
		final Context context = new InitialContext();
		
		return (String) context.lookup("JNDI context");
		
	}
	
}