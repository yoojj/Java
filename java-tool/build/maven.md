# Maven
: 자바 기반 프로젝트 빌드 및 관리 도구       
: 프로젝트 객체 모델을 기반으로 프로젝트의 의존성, 모듈, 생명 주기, 빌드, 문서화, 테스트, 배포 등 관리       
: 모든 기능은 플러그인으로 처리되며 설정 파일에 필요한 플러그인을 구성   

- [POM](#pom)


```bash
# 설치
$ wget http://www-us.apache.org/dist/maven/maven-3/3.5.3/binaries/apache-maven-3.5.3-bin.tar.gz
$ sudo tar -xf apache-maven-3.5.3-bin.tar.gz
$ sudo -f apache-maven-3.5.3-bin.tar.gz
$ sudo mv apache-maven-3.5.3/ apache-maven


# 환경 변수 설정
$ cd /etc/profile.d/
$ sudo vim maven.sh

## 입력
# export M2_HOME=/설치경로/apache-maven
# export PATH=${M2_HOME}/bin:${PATH}


# 권한 수정 및 적용
$ sudo cd /etc/profile.d/
$ sudo chmod +x maven.sh
$ sudo source maven.sh


# 확인
$ mvn --v
```



## POM
Project Object Model   
: 메이븐 프로젝트 설정 파일   



[top](#)
