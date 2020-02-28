# Generic
: 데이터 타입 추상화    
: 컴파일시 데이터 타입 확정  


- [Generic Classes](#generic-classes)
- [Generic Interface](#generic-interface)
- [Generic Methods](#generic-methods)
- [Multiple Type Parameters](#multiple-type-parameters)
- [Bounded Type Parameters](#bounded-type-parameters)
- [Unbounded Wildcard](#unbounded-wildcard)
- [Upper Bounded Wildcard](#upper-bounded-wildcard)
- [Lower Bounded Wildcard](#lower-bounded-wildcard)



타입 매개 변수 | 설명
---|---
E  | element, Collections에서 많이 사용
K  | key, Map에서 많이 사용
V  | value, Map에서 많이 사용
N  | number
T  | 첫번째 타입 매개 변수
S  | 두번째 타입 매개 변수
U  | 세번째 타입 매개 변수
V  | 네번째 타입 매개 변수



## Generic Classes
= Parameterized type   
: 클래스 정의시 필드의 데이터 타입을 기호로 작성하고 객체 생성시 데이터 타입 지정  

```java
// 이전 방식
class Box {
	private Object data;
}


// 제네릭 사용
class Box<T> {
	private T data;
	public void setData(T data) { this.data = data; }
	public T getData(){ return this.data; }
}

Box<String> box = new Box<>();
box.setData("generic");
```



## Generic Interface

```java
interface Box<T> {
	public T getValue();
}

class BoxImpl<T> implements Box<T> {
	private T value;

	@Override
	public T getValue() { return this.value; }
}
```



## Generic Methods  

```java
class Box {

	public <T> T getValue(T value){
		return value;
	}

	public <E> void printArray(E[] array){
		for(E element : array){
			System.out.print(element);
		}
	}

}

```



## Multiple Type Parameters

```java
class Box<K, V> {
	private K key;
	private V value;

	public Box(K key, V value){
		this.key = key;
		this.value = value;
	}
}

Box<String, String> box = new Box<>("키", "값");

```



## Bounded Type Parameters
: 특정 데이터 타입 제한  

```java
// Number 타입 혹은 Number 하위 타입만 가능
class Box<T extends Number> {
	private T data;
}


class Box {
	public <T extends Comparable> T getArray(T[] array);
}


class Box {
	public <T extends Number & Comparable<T>> T getArray(T[] array);
}

```



## Unbounded Wildcard
: 와일드 카드를 사용하여 데이터 타입을 느슨하게 정의    

**와일드 카드**
: 물음표 기호  
: 알 수 없는 데이터 타입 의미   


```java
class Box {

	public void print(Collection<?> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```



## Upper Bounded Wildcard
: 상위 경계 와일드카드    

```java
class Box {

	public void print(Collection<? extends Number> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```



## Lower Bounded Wildcard
: 하위 경계 와일드카드     

```java
class Box {

	public void print(Collection<? super Integer> element){
		for(Object e : element){
			System.out.println(e);
		}
	}

}
```



[top](#)
