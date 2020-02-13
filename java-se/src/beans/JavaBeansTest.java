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
	public void javaBeansTest() throws IntrospectionException, ClassNotFoundException, 
		InstantiationException, IllegalAccessException {
		
		final Class<?> c = Class.forName("bean.JavaBeans");
		final Object o = c.newInstance();
		
		final BeanInfo info = Introspector.getBeanInfo( o.getClass() );	
		final PropertyDescriptor[] pd = info.getPropertyDescriptors();
		
		for(PropertyDescriptor p : pd ) {
			System.out.println( p.getName() );
		}
		
	}

}