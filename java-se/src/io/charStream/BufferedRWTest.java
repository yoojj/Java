package io.charStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class BufferedRWTest {

	// BufferedReader
	// BufferedWriter
	
	
	
	final String path = "/home/jj/바탕화면/test/";
	
	@Test @Ignore
	public void readerTest() {
		
		try {

			// 기본으로 8kb 버퍼 사용 
			final BufferedReader r = new BufferedReader(new FileReader(path + "file"), 8192);

			final StringBuilder sb = new StringBuilder();
			
			String data = null;
			while( (data=r.readLine()) != null ) {
				sb.append(data).append(System.lineSeparator());
			}
			
			System.out.println(sb);

			if( r != null ) r.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	@Test @Ignore
	public void writerTest() {
		
		try {

			final BufferedReader r = new BufferedReader(new FileReader(path + "file"));
			final BufferedWriter w = new BufferedWriter(new FileWriter(path + "new-file"));

			w.write("BufferedWriter" + System.lineSeparator());
			
			String data = null;
			while( (data=r.readLine()) != null ) {
				w.write(data + System.lineSeparator());
			}

			if( r != null ) r.close();
			if( w != null ) w.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
}