# Java Platform
: 자바 프로그램을 개발하고 실행하기 위한 프로그램-도구 모음     
: jdk9 부터 모듈 시스템으로 인해 JRE와 JDK에 포함된 라이브러리를 모듈식으로 지원

**Java Platform Module System**  
: 약 90개 모듈로 분리하여 지원    

- [JRE](#jre)
- [JDK](#jdk)


언어 플랫폼 | 특징 | 패키지
---|---|---
Java SE (Standard Edition)   | 기본 핵심 기능 | JDK
Java EE (Enterprise Edition) | 엔터프라이즈 애플리케이션 | Java EE SDK
Java ME (Mobile Edition)     | 임베디드, 모바일, IoT | Java ME SDK
Java Embedded                | Java ME Embedded + Java SE Embedded | Java Embedded Suite



## JRE
Java Runtime Environment    
: 자바 런타임 환경   
: 자바 프로그램 실행을 위한 패키지로 일종의 메타 운영 체제         


```
Java Program
------------
JRE
------------
OS
```


**종류**
- Public JRE : 독립 구성 요소 ($JAVA_HOME/jre/lib/rt.jar)
- Private JRE : JDK 일부 ($JAVA_HOME/jdk/jre/lib/rt.jar)


**구성 요소**
- [Java Class Library](./java-class-lib.md)
- [Java Class Loader](./java-class-loader.md)
- [Java Virtual Machine](./java-virtual-machine.md)



### rt.jar    
: RunTime  
: Java Runtime 환경을 위한 모든 클래스 파일           
: 부트스트랩 클래스 로더에 의해 가장 먼저 로드되며 JVM이 검사하지 않음   

- Java Class Library   
- Core Java API

**Core Java API**   
http://openjdk.java.net/groups/core-libs/  



## JDK
Java Development Kit    
: 자바 프로그램 개발을 위한 패키지  


**무료 구현체**
- OpenJDK
- AdoptOpenJDK
- Zulu(Azul)
- Corretto(Amazon)
- OpenJ9(Eclipse)
- ...

**유료 구현체**
- Oracle JDK
- Zing JVM(Azul)
- ...


**JDK8 directory structure**

```bash
jdk/
├── bin        # 컴파일러, 런처, 디버거 등 개발 도구
├── include    # 네이티브 코드 프로그래밍을 지원하는 헤더 파일들
├── jre        # 개발 도구에서 사용하는 자바 실행 환경, JVM, 클래스 라이브러리들
└── lib        # tools.jar, dt.jar, 추가 클래스 라이브러리  
```

도구 | 설명
---|---
javac    | 자바 컴파일러로 자바 파일을 바이트코드-클래스 파일로 컴파일
java     | 자바 인터프리터로 바이트코드를 해석하고 실행
javap    | 자바 역어셈블러로 클래스 파일을 자바 파일로 변환
jdeps    | 자바 패키지, 클래스의 종속성 분석  
javadoc  | 자바 문서 생성기
javah    | 헤더 파일 생성
jdb      | 자바 디버거
jar      | 자바 압축 도구
jmc      | (오라클) JVM 모니터링 도구
jfr      | (오라클) jmc를 통해 수집된 정보를 저장하고 문제 분석하는 도구
jar      | 자바 압축 파일 생성 및 관리
extcheck | 이전 JAR 파일과 현재 설치될 JAR 파일간의 버전 충돌 감지  



[top](#)
