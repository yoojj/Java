package io;

import java.io.File;
import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;

public class FileTest {

	// File
	// : 파일이나 디렉토리의 정보를 제공하여 생성, 변경, 제거 (실제 파일이나 디렉토리가 아님)
	// : OS의 파일 시스템에 의존 (파일 권한, 파일 위치 표기법 등 주의)
	
	
	
	final String path = "/home/jj/바탕화면/test/";
	final String file = "file.txt";
	
	@Test @Ignore
	public void test() throws IOException {
		
		final File f = new File(path, file);
		
		// 경로나 파일 존재 여부 반환 
		f.exists();
		
		// 경로 존재 여부 반환
		f.isDirectory();
		
		// 절대 경로 반환
		f.getAbsolutePath();
		
		// 정규 경로 반환 
		f.getCanonicalPath();
	
		// 부모 경로 반환
		f.getParent();
		
		// 부모 파일 반환  
		f.getParentFile();
		
		// 경로가 존재한다면 크기 반환
		f.getTotalSpace();
		f.getFreeSpace();
		f.getUsableSpace();

		// 경로 내에 존재하는 파일 반환
		f.list();
		
		// 파일 존재 여부 반환
		f.isFile();

		// 경로를 포함한 파일명 반환
		f.getPath();
		f.getAbsolutePath();
		
		// 숨은 파일인지 여부 반환
		f.isHidden();
		
		// 확장자를 포함한 파일명 반환
		f.getName();
		
		// 파일명 수정 
		f.renameTo(new File(path, "renameFile.txt"));
		
		// 파일이 마지막으로 수정된 시간 반환 
		f.lastModified();
		
		// 파일이 마지막으로 수정된 시간 변경
		f.setLastModified(0);
		
		// 해당하는 경로가 없다면 생성
		f.mkdir();
		f.mkdirs();
		
		// 해당하는 파일이 없다면 생성하고 참 반환
		f.createNewFile();
		
		// 해당 경로나 파일 삭제
		f.delete();
		
		// jvm 종료시 해당 경로나 파일 삭제 
		// 임시 파일을 사용한 경우 이를 제거하기 위해 사용 
		f.deleteOnExit();
		
		// 임시 파일 생성 
		File.createTempFile("", "");
		
	}

	@Test @Ignore
	public void filePermissionTest() {
		
		// 유닉스, 리눅스 환경에서 권한 확인 및 설정
		
		final File f = new File(path, file);
		
		// 해당 파일을 읽을 수 있는지 여부 반환
		f.canRead();
		
		// 해당 파일을 변경할 수 있는지 여부 반환
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
		
		final File f = new File(path);

		/*
		final String[] list = f.list();

		for(String file : list) {
			System.out.println(file);
		}	
		*/	

		final File[] files = f.listFiles();
		
		for(File file : files) {
		
			if(file.isFile()) {
				System.out.println(file.getName());
			}
			
		}
		
	}
	
}