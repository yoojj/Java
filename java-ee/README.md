# Java EE
= Jakarta EE, EE4J       
: J2SE 1.2의 일부를 분리해 이를 확장                   
: 2-tier 모델에서 3-tier 모델로 변화하며 DB, 트랜잭션, 보안 등의 기술이 필요해짐     
&nbsp; 이를 위해 (벤더사에서 구현해야 할) 요구 사항을 정의한 것이 초기 J2EE            
: 현재는 대규모 동시 접속, 확장성, 보안, 배치 시스템 등 엔터프라이즈 애플리케이션 개발을 위한 스펙 제공     
: 명칭 문제로 Jakarta EE로 이름 변경    


버전 | JSR-ID
---|---
java EE 5 | [JSR 244](https://www.jcp.org/en/jsr/detail?id=244)
java EE 6 | [JSR 316](https://www.jcp.org/en/jsr/detail?id=316)
java EE 7 | [JSR 342](https://www.jcp.org/en/jsr/detail?id=342)
java EE 8 | [JSR 366](https://www.jcp.org/en/jsr/detail?id=366)  


**+ MicroProfile**   
: Java EE의 느린 버전 업으로 인해 새로운 기술이나 패러다임에 대한 스펙이 미진하여          
&nbsp; 여러 벤더사에서 Java EE 표준을 기반으로 스펙을 확장하거나 추가하는 프로젝트     
: 마이크로 서비스와 클라우드 네이티브 개발을 위한 스펙이 정의됨           



## Java EE Architecture

```bash

Client Tier  |   Middle Tier   |  EIS Tier
               - Web Tier
               - Business Tier
```


### Client Tier
=  프레젠테이션 티어  


### Middle Tier
= 애플리케이션 티어, 로직 티어, 데이터 접근 티어   
: 웹 레이어 티어 + 비즈니스 레이어 티어

- Web Container
- EJB Container


**웹 레이어**    
: 클라이언트 티어와 미들티어 간 상호 작용 관장     
ex. Servlet, JSP, JSTL


**비즈니스 레이어**    
: EIS 티어에게 요청해 데이터를 받아 비즈니스 로직 실행  
ex. JDBC, JPA, JTA



### EIS Tier
Enterprise Information System    
= 데이터 티어, 퍼시스턴스 티어, 통합 티어



## Java EE Spec

https://javaee.github.io/javaee-spec/Specifications  
https://www.oracle.com/technetwork/java/javaee/tech/index.html  


**Java EE 8 Web Profile**    
- [CDI](./cdi.md)
- [Interceptors](./interceptors.md)
- Bean Validation
- [Servlet](./servlet.md)
- [JSP](./jsp.md)
- EL
- [JSTL](./jstl.md)
- [JTA](./jta.md)
- [JPA](./jpa.md)
- ...


**Java EE 8 Full Platform**   
- [EJB](./ejb.md)
- [JMS](./jms.md)
- [JavaMail](./javamail.md)
- RMI
- JCA
- JSR
- JASPIC    
- JAX-RS (RESTful)
- JAX-RPC
- JAXB
- JAXR
- JAAS
- ...



## Java EE Implement

**WAS**    
Web Application Server

- JBoss
- GlassFish
- WebSphere
- TomEE
- Wildfly
- Resin


**Servlet Container**    
- Tomcat
- Jetty
- Geronimo
- Undertow



[top](#)
