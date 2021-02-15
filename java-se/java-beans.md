# Java Beans  
≠ EJB, Spring Beans         
: POJO > JavaBeans          
: Java Beans API에 따라 만들어진 객체              
: 분산 시스템(Java RMI)을 위해 자바 빈즈 사용     


**Java Beans API**    
: 컴포넌트 소프트웨어 개발을 위한 표준 스펙    
: 재사용 가능한 컴포넌트를 만들고 이를 통해 다른 컴포넌트나 환경 사이를 연결    
: 그래픽 컴포넌트나 기능으로만 이뤄진 컴포넌트 등 다양한 구성으로 컴포넌트 생성    

https://download.oracle.com/otndocs/jcp/7224-javabeans-1.01-fr-spec-oth-JSpec/


**규칙**
```bash
1. implements java.io.Serializable  # 생략 가능하나 객체 직렬화를 위해 구현
2. private property  # transient 키워드를 통해 직렬화에서 제외될 속성 지정  
3. public constructor  # 인수가 없음
4. public get/set 또는 is/to method  # 다른 컴포넌트나 다른 환경에서 호출하는 인터페이스
5. event method  # 그래픽 컴포넌트를 위한 메소드  
```


**컴포넌트 종류**  
- 그래픽 컴포넌트 : 가시적 (ex. AWT, Swing)
- 기능성 컴포넌트 : 비가시적
	- 데이터 빈즈
	- 서비스 빈즈



## 그래픽 컴포넌트
: 그래픽 컴포넌트는 크게 화면을 구성하는 부품 컴포넌트와 컨테이너로 나뉨   


**그래픽 컴포넌트 종류**   
- 부품 컴포넌트 (ex. 버튼 컴포넌트)
- 컨테이너 : 부품 컴포넌트를 포함하는 컴포넌트   


**그래픽 컴포넌트 기능**   
- 화면 구성  
- 이벤트를 발생하고 처리하는 등 이벤트 처리 기능  
- 컴포넌트 상태 저장



## 기능성 컴포넌트
: 화면(GUI)이 없는 자바 빈즈              
: 필요에 따라 이벤트 메소드를 가질 수 있음   



### 데이터 빈즈   
: 계층간의 데이터 전달을 위한 빈   
: 구조화된 데이터를 교환하거나 데이터를 은닉하는 기능 제공   
: read-write, read-only, write-only


- VO (Value Object) : 불변적  
- DTO (Data Transfer Object) : 가변적  



### 서비스 빈즈   
: 공통 기능을 모듈화한 빈     



[top](#)
