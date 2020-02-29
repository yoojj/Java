# CDI 
Java Contexts and Dependency Injection for Java EE    
: Java EE 6에 도입된 표준 의존성 주입 프레임워크   
: 동적 방식으로 DI 처리   



**어노테이션**  
- @Inject
- @Default
- @Alternative 
- @Named
- @Produces
- @Qualifiers


**Bean**   
: new 키워드로 생성하지 않고 다른 객체에 주입할 수 있는 모든 POJO, JavaBean, EJB session bean    
: @Inject 어노테이션 사용   


**CDI Managed Beans**     
: CDI 컨테이너가 관리하는 빈       
: 컨테이너 구동시 빈 인스턴스가 생성됨  
: 지정된 스코프에 따라 컨테이너가 빈의 생명 주기 관리    


**스코프**    

- @ApplicationScoped : 애플리케이션이 살아있는 동안 상태 공유
- @ConversationScoped : 정의한 기간 동안 상태 공유
- @SessionScoped : HTTP 세션이 살아있는 동안 상태 공유
- @RequestScoped : HTTP 요청이 살아있는 동안 상태 공유
