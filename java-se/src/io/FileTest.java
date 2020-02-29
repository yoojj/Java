package io;

import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class FileTest {

	// File
	// : 실제가 파일이나 디렉토리가 아니고 
	// : 파일이나 디렉토리의 정보를 제공하여 생성, 변경, 제거 
	// : OS 파일 시스템에 의존하므로 주의 (파일 권한, 파일 위치 표기법 등)
	
	
	
	@Test @Ignore
	public void test() {
	
		final String path = "/home/jj/바탕화면/test/";
		
		final String file = "file.txt";
		
		final File f = new File(path, file);
		
		// 해당하는 경로나 파일이 존재하는지 여부 반환 
		f.exists();
		
		// 경로가 존재하는지 여부 반환
		f.isDirectory();
		
		// 경로 반환
		f.getParent();
		f.getParentFile();
		try {
			f.getCanonicalPath();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 경로가 존재한다면 크기 반환
		f.getTotalSpace();
		f.getFreeSpace();
		f.getUsableSpace();
		
		// 파일이 존재하는지 여부 반환
		f.isFile();
		
		// 숨은 파일인지 여부 반환
		f.isHidden();
		
		// 확장자 포함한 파일명 반환
		f.getName();
		
		// 파일명 수정 
		f.renameTo(new File(path, "renameFile.txt"));
		
		// 해당하는 경로가 없다면 생성
		f.mkdir();
		f.mkdirs();
		
		// 해당하는 파일이 없다면 생성하고 참 반환
		try {
			f.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 경로와 파일명 함께 반환
		f.getPath();
		f.getAbsolutePath();
		
		// 해당하는 경로나 파일 삭제
		f.delete();
		
		// jvm 종료시 해당 경로나 파일 삭제 
		// 임시 파일이 필요한 경우 사용 
		f.deleteOnExit();
		
	}

	@Test @Ignore
	public void filePermissionTest() {
		
		// 유닉스, 리눅스 환경에서 권한 확인 및 설정
		
		final String path = "/home/jj/바탕화면/test/";
		
		final String file = "file.txt";
		
		final File f = new File(path, file);
		
		// 해당 파일을 읽을 수 있는지 여부 반환
		f.canRead();
		
		// 해당 파일을 쓰기가 가능한지 여부 반환
		f.canWrite();
		
		// 해당 파일을 실행할 수 있는지 여부 반환
		f.canExecute();
		
		// 해당 파일의 읽기 권한 설정
		f.setReadable(true);
		
		// 해당 파일의 쓰기 권한 설정
		f.setWritable(true);
		
		// 해당 파일의 실행 권한 설정
		f.setExecutable(true);
		
	}
	
	@Test
	public void fileListTest() {
		
		final String path = "/home/jj/바탕화면/test/";

		final File f = new File(path);
		
		final String[] list = f.list();
		for(String file : list) {
			System.out.println( file );
		}	
		
		final File[] listFiles = f.listFiles();
		for(File file : listFiles) {
		
			if( file.isFile() ) {
				System.out.println( file.getName() );
			}
			
		}
	}
	
}