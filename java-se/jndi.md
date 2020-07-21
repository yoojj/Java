# JNDI
Java Naming and Directory Interface   
: Naming Service + Directory Service API, SPI   
: 객체를 특정 이름으로 등록하고 필요시 JNDI 명을 통해 조회하기 위한 API       
: 분산 환경에서 객체를 공유하기 위해 사용    


**Naming Service**  
: 이름(파일명) + 리소스(이진데이터, 객체) 바인딩  
ex. 파일시스템, DNS, LDAP 등   

**Directory Service**   
: Naming Service 개념 확장 및 보완   


**JNDI 구성**  
- JNDI API : Naming Manager
- JNDI SPI (Service Provider Interface) : Naming과 Directory 기능 지원


```
Java APP --> JNDI API --> JNDI SPI --> CORBA, RMI, LDAP...
```


**ex.**

```java
@Test
public void test() {

    Context init = new InitialContext();
    Context env = (Context) init.lookup("java:comp/env");
    DataSource ds = (DataSource) env.lookup("jdbc/db");
    Connection conn = ds.getConnection();
    con.close();

    /*
    <Resource
        name="jdbc/db"
        global="jdbc/db"
        auth="Container"
        type="javax.sql.DataSource"
        driverClassName=""
        url=""
        username=""
        password="" />
    */
}
```



[top](#)
