# JSP
Java Server Pages      
: 자바 웹 애플리케이션을 위한 템플릿 엔진      
: 비즈니스 로직과 화면 표현 분리를 위해 도입     


- [디렉티브](#directive)
- [스크립트 요소](#scripting-element)
- [내장 객체](#implicit-object)
- [액션 태그](#action-tag)
- [표현 언어](#expression-language)
- [커스텀 태그](#custom-tag)
	- [JSTL](./jstl.md)



## Directive
: JSP 페이지에 대한 설정 정보 지정   

> <%@ directive attribute="value" %>


종류 | 설명
---|---
page     | 페이지의 전반적인 정보 설정
include  | 페이지에 포함할 다른 페이지 정의   
taglib   | EL, JSTL, 커스텀 태그 사용을 위한 접두사  



### page  

속성 | 기본값 | 설명
---|---|---
info         |            | 페이지 설명
language     | java       | 페이지에서 사용할 언어 지정
pageEncoding | ISO-8859-1 | 문자열 인코딩 지정
contentType  | text/html  | 페이지 출력 형식 지정
import       |            | 참조할 패키지나 클래스 지정  
extends      |            | 상속받을 클래스 지정  
session      | true       | HttpSession 객체 사용 여부 지정  	
buffer       | 8kb        | 페이지 출력시 사용할 버퍼 크기 지정
autoFlush    | true       | 출력 버퍼가 다 채워질 경우 처리 방법 지정
errorPage    | false      | 페이지 처리 도중 오류-예외가 발생할 경우 보여줄 페이지 지정  
isErrorPage  | false      | 현재 페이지가 오류-예외 페이지인지 여부 지정
isThreadSafe | true       | 다중 스레드 실행 여부 지정  
isELIgnored  | true       | EL 사용 여부 지정   
isScriptingEnabled | true | 스크립트 요소 사용 여부 지정
trimDirectiveWhitespaces | false | 템플릿 텍스트의 공백문자 제어 여부 지정


**jsp 인코딩**  

```
0. 파일이 유니코드가 아닌 경우  
1. pageEncoding 속성 검색
2. pageEncoding 속성이 존재하면 해당 값을 캐릭터 셋으로 사용
3. pageEncoding 속성이 없다면 contentType 속성 검색
4. contentType 속성이 존재하면 해당 charset 값을 캐릭터 셋으로 사용
5. 해당하지 않을 경우 ISO-8859-1을 캐릭터 셋으로 사용
```



### include
: 재사용 및 유지관리를 위해 공통으로 사용하는 페이지나 변수를 정의     

> <%@ include file="some.jsp" %>



### taglib

> <%@ taglib prefix="별명" uri="경로" %>

```jsp
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if></c:if>
```



## Scripting Element
: 동적 처리를 위해 사용    

종류 | 설명 | 사용
---|---|---
선언문      | 변수, 메소드 선언 | <%! %>
스크립틀릿   | 자바 코드 작성    | <%  %>
표현식      | 식, 변수 값 출력  | <%= %>


```html
<%-- 주석 --%>

<%!
	String str = "선언문 정의";
	public String getStr(){ return str; }
%>

<p><%= str %></p>
<p><%= Integer.parseInt(10) %></p>
```



## Implicit Object
: 컨테이너가 제공하는 객체    
: 페이지에서 객체 선언없이 사용 가능  


종류 | 클래스 | 스코프 | 설명   
---|---|---|---
request      | HttpServletRequest  | request     | 요청 정보 저장
response     | HttpServletReponse  | page        | 요청에 대한 응답 정보 저장
out          | JspWriter           | page        | 페이지에 결과 출력
session      | HttpSesseion        | session     | 세션 정보 저장
application  | ServletContext      | application | 컨텍스트 정보 저장
pageContext  | PageContext         | page        | 페이지에 대한 정보 저장
page         | Object              | page        | 페이지의 서블릿 객체 저장
config       | ServletConfig       | page        | 페이지 설정 정보 저장
exception    | Exception           | page        | 예외 발생시 예외 처리


**page scope**   
: 하나의 요청에 하나의 페이지가 응답  
: 하나의 페이지 내에서만 객체 공유  
: 객체는 pageContext에 저장  


**request scope**  
: 하나의 요청에 대해 같은 요청을 공유하는 페이지 내에서 객체 공유  
: 요청 스코프 생명 주기 동안 유효  


**session scope**  
: 컨테이너가 하나의 브라우저에 하나의 세션 부여  
: 동일한 세션으로 요청이 들어올 경우 같은 객체 공유  
: 세션 종료시 객체 반환  


**application scope**  
: 컨테이너 구동시 하나의 애플리케이션에 하나의 애플리케이션 객체 생성  
: 같은 애플리케이션에 요청되는 페이지들의 경우 객체 공유  
: 애플리케이션 종료시 객체 반환



## Action Tag

종류 | 설명
---|---
jsp:include      | 현재 페이지에 다른 페이지를 포함하는 태그
jsp:forward      | 포워드 기능 태그
jsp:useBean      | 객체 생성을 위한 태그
jsp:setProperty  | useBean 속성에 값을 설정하는 태그
jsp:getProperty  | useBean 속성의 값을 가져오는 태그


**include 비교**

기능 | action tag | directive
---|---|---
역할 | 페이지 레이아웃 모듈화 | 페이지 레이아웃 모듈화, 공통 사용 변수 지정
데이터 | 동적 처리 가능 | 정적 처리만 가능
처리 시간 | 요청 시간에 처리 | 자바 코드로 변환시 처리
변환 | 포함된 페이지 각각 자바 파일로 변환 | 포함된 페이지를 합해 하나의 자바 파일로 변환



## Expression Language
: 페이지 내에 자바 코드 표현식을 간결하게 사용하기 위해 도입  

**연산자**

종류 | 연산자 | 설명
---|---|---
산술 연산자 | +, -, *  | 덧셈, 뺄셈, 곱셈
          | /, div   | 나눗셈  
          | %, mod   | 나머지
비교 연산자 | ==, eq   | 두 피연산자가 같은지 비교
          | !=, ne   | 두 피연산자가 다른지 비교
          | <, lt    | 값 비교
          | >, gt    | 값 비교 			
          | <=, le   | 값 비교
          | >=, ge   | 값 비교
논리 연산자 | &&, and  | 논리곱 연산
          | &brvbar;&brvbar;, or | 논리합 연산
          | !, not   | 부정 연산
empty     | empty    | 값이 null 혹은 빈 문자열이면 참 반환


**내장 객체**

객체 | 설명
---|---
pageContext      | pageContext 객체 참조
pageScope        | page와 같은 기능, page 영역에 바인딩된 객체 참조
requestScope     | request와 같은 기능, request에 바인딩된 객체 참조  
sessionScope     | session과 같은 기능, session에 바인딩된 객체 참조
applicationScope | application과 같은 기능, application에 바인딩된 객체 참조
param            | request.getParameter() 같은 기능
paramValue       | request.getParameterValues() 같은 기능
header           | request.getHeader() 같은 기능
headerValue      | request.getHeaders() 같은 기능
cookies          | 쿠키 명 반환
initParam        | 컨텍스트 초기화 파라미터 명 반환



## Custom Tag


[top](#)
