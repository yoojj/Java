# Java Lexical Structure   

**요소**   
- [공백](#white-space)
- 주석
- [토큰](#token)


**유니코드**   

자바 버전 | 유니코드 버전
---|---
JDK 1.0   | 유니 코드 1.1.5
JDK 1.1   | 유니 코드 2.0
JDK 1.1.7 | 유니 코드 2.1
Java SE 4 | 유니 코드 3.0
Java SE 5 | 유니 코드 4.0
Java SE 7 | [유니 코드 6.0](http://www.unicode.org/versions/Unicode6.0.0/)
Java SE 8 | [유니 코드 6.2](http://www.unicode.org/versions/Unicode6.2.0/)



## White Space

**종류**

- horizontal tab
- line feed
- form feed
- carriage return


```java
@Test
public void test(){
	System.out.println(Character.isWhitespace('\n'));
}
```



## Token   
: 공백과 주석을 제외한 입력 요소  
: 공백과 세미콜론 및 구분 기호로 토큰 구분  

**종류**
- [식별자](#identifier)
- [리터럴](#literal)
- [키워드](./java-keyword.md)
- [구분 기호](./java-separator-operator.md#separator)
- [연산자](./java-separator-operator.md#operator)



### Identifier
: 변수, 상수, 배열, 클래스, 패키지 등 식별을 위해 부여하는 이름         
: 공백, 키워드, boolean과 null 리터럴을 제외한 대소문자와 숫자 사용      
: ASCII에 포함되는 언더스코어(\u005f)와 달러(\u0024) 기호 사용 가능   
: 길이 제한 없음    


**Java Naming Conventions**   
: 식별자 규칙   

종류 | 설명 | 사용
---|---|---
camelCase  | 첫 글자는 소문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - variable<br>- method
PascalCase | 첫 글자는 대문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - class<br>- interface
SNAKE_CASE | 모든 글자는 대문자를 사용하고 단어는 언더스코어 기호로 구분 | static variable



### Literal  

**종류**  
- Null Literal
- Boolean Literal
- Integer Literal
- Floating Point Literal
- Character Literal
- String Literal



[top](#java-lexical-structure)
