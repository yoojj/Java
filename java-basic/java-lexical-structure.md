# Java Lexical Structure   

**요소**   
- 공백
- 주석
- 토큰


**토큰**  
: 공백과 주석을 제외한 입력 요소  
: 공백과 세미콜론 및 구분 기호로 토큰 구분  

- 리터럴
- [식별자](#identifier)
- [키워드](./java-keyword.md)
- [구분 기호](./java-separator-operator.md#separator)
- [연산자](./java-separator-operator.md#operator)



## White Space

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



## Identifier
: 변수, 상수, 배열, 클래스, 패키지 등 식별을 위해 부여된 이름      
: 길이 제한 없음  
: 공백, 키워드, boolean과 null 리터럴을 제외한 대소문자와 숫자 사용 가능         
: ASCII에 포함되는 언더스코어(\u005f)와 달러(\u0024) 기호 사용 가능



### Java Naming Conventions
: 변수, 상수, 배열, 클래스, 패키지 등에 부여하는 이름 규칙   

종류 | 설명 | 사용
---|---|---
camelCase  | 첫 글자는 소문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - variable<br>- method<br>- package  
PascalCase | 첫 글자는 대문자로 시작하고 새 단어의 첫 글자를 대문자로 시작해 구분 | - class<br>- interface
SNAKE_CASE | 모든 글자는 대문자를 사용하고 단어는 언더스코어로 구분 | static variable



[top](#)
