# Java Variable
= 필드, 속성, 상태, 특성      
: 메모리에 저장된 데이터의 위치를 가르키는 기호             
: 변수 정의시 데이터의 타입을 부여해 타입에 따라 메모리 크기를 확보하고             
&nbsp; 변수에 선언된 이름을 통해 메모리에 데이터를 저장하고 핸들링         


```java
// 변수 선언 : 메모리 공간 확보   
int num;

// 변수 선언 및 초기화 : 데이터 할당
int num = 0;
```


**데이터 할당**  
- 데이터 직접 할당 = 변수에 할당
- 데이터 간접 할당 = 메소드를 통해 변수에 할당


**종류**
- [최종 변수](#최종-변수)
- [클래스 변수](#클래스-변수)
- [인스턴스 변수](#인스턴스-변수)
- [지역 변수](#지역-변수)
- [매개 변수](#매개-변수)



## 최종 변수  
: final 키워드로 선언된 변수   
: 할당된 메모리 주소를 변경할 수 없음            
: 프리미티브 타입일 경우 할당된 데이터를 변경할 수 없음



## 클래스 변수
= 정적 변수, 스태틱 변수       
: 클래스에서 static 키워드로 선언된 변수   
: 초기화하지 않을 경우 선언된 데이터 타입에 해당하는 기본 값으로 초기화됨   
: 클래스가 메모리에 로드될 때 생성되며 클래스가 제거되면 함께 제거됨   
: 클래스 명을 통해 참조  

**상수**  
: 정적 변수를 상수로 적용하고 싶을 경우 final static 키워드 사용     



## 인스턴스 변수
= 멤버 변수    
: 클래스 내부에 메소드 외부에 선언된 변수   
: 초기화하지 않을 경우 선언된 데이터 타입에 해당하는 기본 값으로 초기화됨  
: 클래스의 객체 생성시 생성되며 객체가 제거되면 함께 제거됨   
: 클래스의 객체를 통해 참조       



## 지역 변수
: 생성자나 메소드 내에서 선언된 변수    
: 초기화하지 않으면 컴파일 오류가 발생하므로 초기화 필수         
: 생성자나 메소드가 실행될 때 생성되며 생성자나 메소드가 제거되면 함께 제거됨        
: 선언된 범위 내에서만 참조 가능    
: java10 부터 var 키워드를 통해 데이터 타입을 지정하지 않는 변수 지원    

```java
public void test(){
    // 컴파일러에 의해 데이터 타입 추론  
    var num = 0;
}
```



## 매개 변수   
= 파라미터   
: 생성자나 메소드의 시그니처에 선언된 변수     
: 초기화하지 않으면 컴파일 오류가 발생하므로 초기화 필수            
: 생성자나 메소드가 실행될 때 생성되며 생성자나 메소드가 제거되면 함께 제거됨     
: 선언된 범위 내에서만 참조 가능        



[top](#)
