# Java Modifiers
: 클래스, 메소드, 변수 선언부에 사용하여 부가적인 의미 부여    


- [access modifiers (access level)](#access-modifiers)
- [non-access modifiers (behavior)](#non-access-modifiers)



## access modifiers
= 접근 제어자, 수식자    
: 접근을 제어해 사용 범위를 결정          

키워드 | 설명
---|---
public    | 프로젝트 기준으로 어디서든 접근 가능
protected | 기본은 default이나 상속 관계이면 public   
(default) | 같은 패키지 모든 클래스에 접근 가능
private   | 같은 클래스만 접근 가능하며 하위 클래스에서 접근 불가능


**클래스**   
: public 키워드를 선언한 클래스 명과 파일 명은 일치해야 함  
: 하나의 파일에는 하나의 public 클래스만 존재    
: 클래스에는 public과 (default)만 선언 가능   
: 일반적으로 클래스에 붙는 접근 제어자와 생성자의 접근 제어자는 일치   
: 특수 목적으로 생성자에 private을 사용해 외부에서 접근을 제어함          


**필드**     
: 데이터 보호-은닉화를 위해 사용

- 데이터 직접 할당 - public
- 데이터 간접 할당 - private



## non-access modifiers  
= 제어자, 변경자, 수정자   
: 여러 제어자를 조합해 사용 가능  

키워드 | 설명
---|---
static       | 정적 변수, 정적 메소드 생성을 위해 사용  
final        | 한 번만 초기화하기 위해 사용
abstract     | 클래스와 메소드 추상화를 위해 사용  
strictfp     | 부동소수점 IEEE754 표준을 따름 (클래스, 메소드)
volatile     | 변수를 메인 메모리에 저장
synchronized | 동기화된 메소드 (스레드)
transient    | 객체 직렬화에서 제외될 인스턴스 변수에 사용
native       | 다른 언어로 작성된 프로그램 호출 (JNI 규약)

! static 키워드와 abstract 키워드를 동시에 선언할 수 없음  
! final 키워드와 abstract 키워드를 동시에 선언할 수 없음



### static
: JVM 실행시 제일 먼저 정적 필드와 정적 메소드를 클래스-메소드 영역에 로드  
: 인스턴스 생성과 관계없이 하나만 존재    
: 정적 메소드 내부에서 인스턴스 필드를 참조할 수 없음  
: 클래스에는 사용할 수 없으나 내부-중첩 클래스에는 사용 가능  

- 스태틱 필드 = 정적 필드 = 클래스 필드
- 스태틱 메소드 = 정적 메소드 = 클래스 메소드



### final
: final 클래스는 확장-상속을 막는 대신 안전성을 높이기 위해 사용  

final | 설명
---|---
클래스 | 상속 불가, 해당 클래스의 하위 클래스를 만들수 없음  ex. String.class
메소드 | 상속 불가, 오버라이딩 불가  ex. Thread.class
원시 타입 변수 | 비트 고정 = 값 재할당 불가 = 값 불변  
객체 참조 변수 | 비트 고정 = 다른 객체 참조 불가
파라미터 | 전달되는 값 보존



### abstract

abstract | 설명
---|---
클래스 | 인스턴스 생성 불가, 상속을 위해 존재, 하나 이상 추상 메소드 필요    
메소드 | 메소드의 시그니처만 정의, 하위 클래스에서 메소드 재정의  



### volatile
: 변수를 메인 메모리에 저장하여 CPU캐시가 아닌 메인 메모리로부터 읽음    
: 변수의 가시성 보장 (스레드에서 변수의 복사본이 아닌 동일한 값을 공유하여 사용)    



[top](#)  
