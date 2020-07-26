package util.zip;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.junit.Test;

public class ZipInputStreamTest {

	// ZipInputStream
	// : zip 파일 입출력을 위한 클래스 
	
	
	
	@Test
	public void test() {
	
		final String path = "/home/jj/바탕화면/test/zip/";
		
		try {
			
			ZipInputStream z = new ZipInputStream(new FileInputStream(path + "file.zip"));
			
			ZipEntry entry = null;
			
			while((entry = z.getNextEntry()) != null) {

				System.out.println(entry.getName());
				
				// 압축 해제
				FileOutputStream f = new FileOutputStream(path + entry.getName());
				for(int i = z.read(); i != -1; i= z.read()) {
					f.write(i);
				}
				
				f.close();
			}
			
			z.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}