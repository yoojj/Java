package io;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

import org.junit.Ignore;
import org.junit.Test;

public class FileFilterTest {

	// FileFilter
	// FilenameFilter 
	
	// + PathMatcher.class 
	
	
	
	@Test @Ignore
	public void fileFilterTest() {
		
		final String path = "/home/jj/바탕화면/test/";

		final File f = new File(path);
		
		final FileFilter filter = (File pathname) -> {
			if( pathname.getName().endsWith(".txt") ) {
				return true;
			}
			return false;
		};
		
		final File[] listFiles = f.listFiles(filter);

		for(File file : listFiles) {
			System.out.println( file.getName() );
		}
		
	}
	
	@Test
	public void filenameFilterTest() {
		
		final String path = "/home/jj/바탕화면/test/";

		final File f = new File(path);
		
		final FilenameFilter filter = (File dir, String name) -> { 
			if( name.endsWith(".txt") ) {
				return true;
			}
			return false; 
		};
		
		final File[] listFiles = f.listFiles(filter);
		
		for(File file : listFiles) {
			System.out.println( file.getName() );
		}
		
	}
	
}