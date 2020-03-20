# JNDI
Java Naming and Directory Interface   
: 데이터나 객체를 특정 이름으로 등록하고 필요시 JNDI 명을 통해 조회-Lookup하기 위한 API       
: 분산 환경에서 객체를 공유하기 위해 사용    


**구성**  
- JNDI API : Naming Manager
- JNDI SPI (Service Provider Interface) : Naming과 Directory 기능 지원


```
Java APP --> JNDI API(Naming Manager) --> JNDI SPI --> CORBA, RMI, LDAP...
```


**ex.**

```java
@Test
public void test() {

    Context context = new InitialContext();
    DataSource ds = (DataSource) context.lookup("java:comp/env");
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
