package exception;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;

import org.junit.Test;

import xxx.NotSerializableVO;

public class NotSerializableExceptionTest {

	// NotSerializableException 
	// : Serializable 구현이 누락된 경우 발생 
	

	
	@Test
	public void test() throws FileNotFoundException, IOException {
		
		final NotSerializableVO vo = new NotSerializableVO();
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("vo.txt"));){
			  
			oos.writeObject(vo);
			
		} catch (NotSerializableException e) {
			e.printStackTrace();
		}
		
	}
	
}