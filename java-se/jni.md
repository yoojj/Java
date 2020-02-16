# JNI
Java Native Interface Specification    
: 다른 언어로 작성된 코드를 자바에서 실행하거나 자바 코드를 다른 언어에서 실행하기 위한 규약     
: 특정 플랫폼-운영체제에서 제공하는 기능을 사용하기 위해 지원     
: 자바 코드는 JVM 위에서 실행되므로 플랫폼에서 독립적이나 네이티브 함수는 플랫폼에 종속적      
: 언어간 데이터 타입 크기가 달라 이를위해 JNI에서 별도로 사용하는 데이터 타입 존재    


```
java app | native method
----------------------------
        JVM(JNI)
```