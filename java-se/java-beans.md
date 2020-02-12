# JavaBeans
≠ EJB, Spring Beans        
: Java Beans API에 따라 만들어진 객체      
: 다른 컴포넌트 사이나 다른 환경 사이를 연결하는 중간 역할을 함        
: POJO > JavaBeans      


**Java Beans API**    
: 재사용 가능한 컴포넌트 개발을 위한 스펙    

```bash
1. implements java.io.Serializable  # 생략 가능하나 객체 직렬화를 위해 구현
2. private 속성
3. public constructor  # 인수가 없으며 메소드로 주입  
4. public get/set 또는 is/to 메소드  # 다른 컴포넌트나 다른 환경에서 호출하는 인터페이스
5. 이벤트 메소드  # 그래픽 컴포넌트를 위한 메소드며 생략 가능   
```


**컴포넌트 종류**  
- 그래픽 컴포넌트 : AWT, Swing
- 기능성 컴포넌트 : 공통 기능 모듈화
	- 데이터 빈즈
	- 서비스 빈즈



## 데이터 빈즈
: 계층간의 데이터 전달을 위한 빈   
: read-write, read-only, write-only

빈 | 특징
---|---
VO (Value Object) | 불변적  
DTO (Data Transfer Object) | 가변적  



[top](#)
