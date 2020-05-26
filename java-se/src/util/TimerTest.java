package util;

import java.util.Timer;
import java.util.TimerTask;

import org.junit.Test;

public class TimerTest {

	// Timer 
	// : 일정 시간에 특정 작업을 실행하기 위해 사용하는 클래스     

	
	
	@Test
	public void test() throws InterruptedException {
		
		final Timer time = new Timer(true);
		
		time.schedule(new Task(), 1000);
		
		// junit에서 테스트하기 위해 사용
		Thread.sleep(1000);
		
	}
	
	class Task extends TimerTask {

		@Override
		public void run() {
			System.out.println("task!");
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}