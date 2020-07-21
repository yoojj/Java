# Junit
: 단위 테스트를 위한 프레임워크   


```xml
<!-- maven -->
<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>0.0.0</version>
    <scope>test</scope>
</dependency>


<!-- gradle -->
dependencies {
    testImplementation('junit:junit:0.0')
}
```


**사용 방법**   
- 상속
    - TestCase
    - TestSuite
- 어노테이션



```java
import org.junit.*;

public class JunitTest {

    @BeforeClass
    public static void beforeClassTest() throws Exception {
        // 모든 테스트 메소드 실행 전 한 번만 동작하는 static 메소드
    }

    @Before
    public void beforeTest() throws Exception {
        // @Test 메소드 실행 전 동작하는 메소드
    }

    @AfterClass
    public static void afterClassTest() throws Exception {
        // 모든 테스트 메소드 실행 후 한 번만 동작하는 static 메소드 
    }

    @After
    public void afterTest() throws Exception {
        // @Test 메소드 실행 후 동작되는 메소드
    }

    @Test
    public void test() {
        // 테스트될 메소드
    }

	@Ignore
	public void ignore() {
		// 실행에서 제외될 메소드
	}

}
```


[top](#)
