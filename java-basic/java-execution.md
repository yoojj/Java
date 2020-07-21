# Java Program Execution


![java program execution](https://i.ibb.co/9GVCXL2/java-program-execution.jpg)


```bash
# Program Execution

보조 기억 장치에 존재 -- 실행 -- 주 기억 장치로 복사  
-----------------           ----------------
     소스 코드     --> 변환 -->    기계 코드    <-- 프로세서 실행  



# Java Program Execution
[컴파일 타임]
1. 소스 코드는 자바 컴파일러에 의해 바이트 코드로 변환
   1-1. *.java 파일을 읽어 구문 트리(AST)에 맵핑
        : 소스 코드를 분리해 컴퓨터가 이해할 수 있는 구조로 변경  
   1-2 . *.class 파일 생성
        : 이때 플랫폼에 중립적인 코드로 변환  

[런타임]
2. 바이트 코드는 JVM 의해 실행  
   2-1. 클래스 로더를 통해 클래스를 메모리에 로드
        : 참조된 모든 클래스 로드  
   2-2. 바이트 코드 검증, 초기화 등 준비 과정
   2-3. 준비 과정을 마치면 인터프리터와 JIT 컴파일러를 통해 바이트 코드를 기계 코드로 변환해 프로그램 실행
```



## Java Compiler
: 자바 언어로 작성된 *.java 파일을 플랫폼에 중립적인 *.class 파일로 변환하는 프로그램    

**종류**   
- Javac(Java Compiler)
- ECJ(Eclipse Compiler for Java)
- GCJ(GNU Compiler for Java)
- Rose Compiler
- ...


```bash
# 컴파일
$ javac A.java
$ javac A.java B.java C.java

# 디렉토리 지정
$ javac -d 디렉토리\A.java
```



## Java Bytecode

1. 로드된 바이트 코드는 JVM 메소드 영역에 저장  
2-1. 메소드는 0개 이상 피연산자와 Opcode로 구성되고   
2-2. 메소드를 호출하면 피연산자를 스택에 push  
2-3. 메소드 수행 결과도 스택으로 push   


**Opcode**   
: 바이트 코드 명령어   
https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings       
https://docs.oracle.com/javase/specs/jvms/se8/html/jvms-6.html   


**invokedynamic**   
: java7 부터 도입된 Opcode    
: JVM을 런타임으로 사용하는 동적 타입 언어를 위해 도입    


```java
// Test.java
public class Test {
    public void 메소드(){
        클래스 변수 = new 클래스();
    }
}


// Test.class
compiled from "Test.java"
public class Test extends java.lang.Object {
public Test();
    code :
        0 : aload_0
        1 : invokespecial  #1
        4 : return

public void 메소드();
    code :
        0 : new  #2
        3 : dup
        4 : invokespecial  #3
        7 : astore_1
        8 : return
}
```



[top](#)
