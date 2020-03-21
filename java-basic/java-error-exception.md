# Java Error & Exception   
: 프로그램 오류를 Error와 Exception으로 구분하여 지원     
: Error와 Exception 클래스는 Throwable 클래스를 확장      

- [Error](#error)
- [Exception](#exception)
	- [Exception Handling](#exception-handling)


**종류**    
- 복구 불가능 오류
- 복구 가능 오류

**시점에 따라**
- 런타임 오류 : Runtime Error, Logic Error
- 컴파일타임 오류 : Compile-time Error, Syntax Error



## Throwable   
: 모든 error와 exception 클래스의 상위 클래스  


```
java.lang.Throwable
	- java.lang.Error
	- java.lang.Exception
		- java.lang.IOException
		- java.lang.RuntimeException
		- ...
```



## Error
: 모든 오류 클래스의 상위 클래스   
: 비정상적이거나 치명적인 오류 발생시 생성      
: 오류가 발생하여도 이를 처리할 수 없음          

**종류**   
- NoClassDefFoundError
- OutOfMemoryError
- StackOverflowError
- VirtualMachineError
- ...



## Exception
: 모든 예외 클래스의 상위 클래스     

종류 | 시점 | 예외 처리
---|---|---
런타임 계열 | 실행 도중 발생 | 예측 불가, 명시적 예외 처리 불필요 (unchecked)
컴파일 계열 | 컴파일 중 발생 | 예측 가능, 명시적 예외 처리 필요 (checked)

! unchecked exception은 컴파일러가 예외를 인식하지 못하며 오류 발생 지점까지 실행 후 예외 발생    
! checked exception은 실행 중 오류가 발생하면 실행 흐름을 중단하고 오류를 설명하는 예외를 생성해 전달    



### Exception Handling
: 프로그램의 정상적인 실행 흐름을 유지할 수 있도록 예외가 발생할 것 같은 코드에 예외처리를 함   

**종류**   
- 예외 처리 try-catch
- 예외 발생 throw
- 예외 전가 throws




#### try-catch


**try-catch block**   
: try 블록에서 예외가 발생하면 catch 블록에서 처리     

```java
try {
	// 감시 영역
	// 예외가 발생할 수 있는 코드 영역   
} catch(Exception e){
	// 예외 처리 영역
	// 예외가 발생하지 않았다면 실행되지 않음  
}
```


**try-catch-finally block**       
: finally 블록은 try 블록 종료시 무조건 실행            
: try 블록에서 예외가 발생하면 catch 블록 실행후 finally 블록 실행   
: try 블록에 return 문이 있을 경우 finally 블록 실행 후에 반환됨    
: catch, finally 중 하나는 생략 가능하나 둘 다 생략은 안됨    

```java
try {
	// 감시 영역
	// 예외가 발생할 수 있는 코드 영역   
} catch(Exception e){
	// 예외 처리 영역
} finally {
	// try 블록 종료후 무조건 실행되는 코드 영역
}



try {
	// catch 블록 생략시 예외가 발생할 경우 예외를 전달해 처리
} finally {	}
```


**try-with-resources**  
: java7 부터 지원   
: try에 자원 객체를 전달하고 자원 해제를 자동 처리하여 finally 블록 생략 가능   


**multi-catch block**
: java7 부터 지원    
: '|' (버티컬 바) 기호를 사용하여 여러 catch 블록을 하나로 연결    
: Exception 클래스가 상속 관계에 있는 경우 중복되므로 하나만 사용 가능    

```java
try {
} catch(ExceptionA | ExceptionB | ExceptionC e){
}
```


#### throw  
: 강제 예외 발생



#### throws
: 메소드에서 예외를 발생할 경우 자신이 예외를 처리하지 않고 해당 메소드를 호출한 상위 메소드에게 예외를 전달   
: 상위 메소드에서 try-catch로 예외 처리  
: throws와 try-catch가 동시에 존재할 경우 try-catch가 우선 순위가 더 높음  
: main() 에서 예외를 전달할 경우 JVM에서 스택 트레이스를 출력하고 실행중인 스레드를 종료함




[top](#)
