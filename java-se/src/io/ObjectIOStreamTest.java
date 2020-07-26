package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Ignore;
import org.junit.Test;

public class ObjectIOStreamTest {

	// ObjectOutputStream
	// ObjectOutputStream
	// : 객체 입출력 지원 클래스
	

	
	final String path = "/home/jj/바탕화면/test/";
	final String file = "object.dat";
	
	@Test @Ignore
	public void outputTest() throws FileNotFoundException, IOException {
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(path + file));
	
		out.writeObject("Object Output Test");
		
		out.close();
		
	}
	
	@Test
	public void inputTest() throws FileNotFoundException, IOException, ClassNotFoundException {
	
		ObjectInputStream in = new ObjectInputStream(new FileInputStream(path + file));
		
		Object obj = in.readObject();
		
		System.out.println(">> " + obj);
		
		in.close();
		
	}
	
}