package beans;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.io.Serializable;

import org.junit.Test;

@SuppressWarnings("serial")
public class JavaBeansTest implements Serializable {

	@Test
	public void test() throws IntrospectionException, ClassNotFoundException, 
		InstantiationException, IllegalAccessException {
		
		final Class<?> c = Class.forName("beans.JavaBeans");
		final Object o = c.newInstance();
		
		final BeanInfo info = Introspector.getBeanInfo( o.getClass() );	
		
		System.out.println( info.getBeanDescriptor().getDisplayName() );
		
		final PropertyDescriptor[] pd = info.getPropertyDescriptors();
		
		for(PropertyDescriptor p : pd) {
			
			if (p.getName().equals("class")) continue;
			
			System.out.println( p.getName() );
			System.out.println( p.getReadMethod() );
			
		}
		
	}

}