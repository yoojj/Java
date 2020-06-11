# Logback


```java
private final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

@Test
public void test(){
    logger.trace("trace");
    logger.debug("debug");
    logger.info("info");
    logger.warn("warn");
    logger.error("error");
}
```



## 설치

모듈 | 설명
---|---   
logback-core    | Log4J 개선 - Appender, Layout
logback-classic | SLF4J 구현 - Logger
logback-access  | HTTP 디버깅 기능 제공


**maven**

```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>${org.slf4j-version}</version>
</dependency>

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>${ch.qos.logback-version}</version>
    <exclusions>
        <exclusion>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-api</artifactId>
        </exclusion>
    </exclusions>
    <scope>runtime</scope>
</dependency>
```



## 설정

**구성 파일**
- logback.groovy
- logback-test.xml
- logback.xml
- BasicConfiguration

\+ 스프링 부트  logback-spring.xml


```xml
<configuration>
<!--
- debug : 디버거 모드 여부 설정
- scan : 파일 스캔 여부 설정
- scanPeriod : 파일을 스캔할 기간 설정
- packagingData : 패키징 데이터 사용 여부 설정
-->



    <include resource="" />
    <property resource="" />
    <property name="" value="" />



    <statusListener class="ch.qos.logback.core.status.OnConsoleStatusListener" />
    <!--
    statusListener

    - OnConsoleStatusListener
    - OnErrorConsoleStatusListener
    -->



    <shutdownHook/>


    <!--
    Appender
    : 로그 메시지가 출력될 위치 결정

    - ConsoleAppender
    - FileAppender
    - RollingFileAppender
    - DailyRollingFileAppender : 하루 단위 로그 메시지를 파일에 출력
    - SMTPAppender
    - DBAppender
    - EventEvaluator
    - NTEventLogAppender
    - SocketAppender
    - SSLSocketAppender
    -->



    <appender name="CONSOLE" class="ch.qos.logback.core.ConsoleAppender">
        <layout class="ch.qos.logback.classic.PatternLayout">
            <pattern>%d{HH:mm:ss} %-5level [%logger{36}] :: %msg%n</pattern>
        </layout>
    </appender>
    <!--
    Layout Pattern

	%d               로그 발생 시간 SimpleDateFormat 형식으로 출력
	%thread          로그 발생 스레드 이름 출력
	$-5level         로깅 수준
	%logger{length}  로그 발생 패키지와 클래스명 출력

	%msg             로그 메시지 출력
	%n               줄바꿈

	%highlight()
	%magenta()
	%cyan()
	-->



    <logger name="패키지" level="" additivity="false" />
    <!--
    additivity="false" : 해당 패키지에만 적용되고 하위 패키지에는 적용되지 않음
    -->



    <root level="DEBUG">
        <appender-ref ref="CONSOLE" />
    </root>
    <!--
    level
    : TRACE > DEBUG > INFO > WARN > ERROR > OFF
    : 대소문자 구분없음
    -->
</configuration>
```



[top](#logabck)
