# Server
솝커톤 안드로이드 3조 서버 레포입니다~~ 🩵

## Project
### 좋데바라
> **DO-SOPT-SOPKATHON-ANDROID-TEAM3**<br/>
> 사회로부터 ‘자기주도적인 삶’을 강요받으며 ‘반복적인 삶’으로 번아웃을 겪는 서로에게 '새로운 하루'를 주고 받아보세요

--- 
<br>

## TEAM
|<img width="409" alt="리정" src="https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/e356b29c-8c9d-4602-9ad2-bb19e9cb4f8d">|<img width="392" alt="민니" src="https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/c8963074-c315-421b-93c5-2c1593fd3df5">|
|:---:|:---:|
|안현주|윤정원|
|[hellozo0](https://github.com/hellozo0)|[gardening-y](https://github.com/gardening-y)|
|담당|담당|
|🎂어제생일자🎂</br>파일 세팅, ERD 생성</br>슬록 조회 API, 다음유저에게 해당 슬롯 설정하기 API, 최종리스트 API|🎂오늘생일자🎂</br>README 작성, ERD 생성</br>방생성하기API, 방 입장하기 API|


<br>

## Tech Stack🛠️
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=Spring&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=flat-square&logo=SpringBoot&logoColor=white"/></a>
  <br>
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=MySQL&logoColor=white"/></a>
  <img src="https://img.shields.io/badge/AWS-232F3E?style=flat-square&logo=AWSL&logoColor=orange"/></a>
  <img src="https://img.shields.io/badge/AWS_RDS-527FFF?style=flat-square&logo=AWSRDS&logoColor=orange"/></a>
  <img src="https://img.shields.io/badge/AWS_EC2-FF9900?style=flat-square&logo=AWSLEC2&logoColor=orange"/></a>



## Architecture
![Group 1](https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/21c3d8a0-d271-4c78-872b-0c70960300a3)


<br>


## 실행 방법
Local에 현재 Repository Clone<br/>
git clone https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server.git<br/>


Build 후 실행<br/>
./gradlew clean build -x test 로 빌드<br/>
cd build/libs<br/>
java -jar 빌드파일명.jar 로 실행<br/>




## ER Diagram
<img width="761" alt="스크린샷 2023-11-26 오전 12 46 14" src="https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/62981652/b8e5a78f-b2da-4eac-ae23-dfb4073b8138">


<br>
<br>


## Directory
```
├─📁 main
│  ├─📁 java
│  │  └─📁 Sopkathon
│  │      └─📁 SopkathonAndroidTeam3Server
│  │         ├─📁 config
│  │         ├─📁 controller
│  │         ├─📁 domain
│  │         ├─📁 dto
│  │         │  └─📁 request
│  │         │  └─📁 response   
│  │         ├─📁 repository
│  │         └─📁 service
│  │         └─📁 util
│  └─📁 resources
│      ├─static
│      └─templates
└─📁 test
```

<br>



## Git Flow & Convention
```
Branch Strategy
1. main 브랜치에 바로 push하는 것을 지양합니다.
2. 기능 하나당 이슈를 한개 생성 후 기능 구현완료 후 해당 이슈를 닫고 브랜치를 삭제합니다.
3. 문제가 발생한 기능은 fix브랜치를 생성하고 작업완료 후 해당 이슈와 브랜치를 삭제합니다.
4. API 하나씩, 기능 개발 할때 마다 PR

Type
- [FEAT]: 새로운 기능 추가
- [UPDATE]: 기능 업데이트
- [FIX]: 버그 수정
- [REFACTOR] : 버그 수정이나 기능 추가가 없는 코드 변경 ( 코드 구조 변경 등의 리팩토링 )
- [TEST] : 테스트 추가 또는 이전 테스트 수정
- [DOCS]: README, wiki 문서를 수정
- [STYLE]: 코드 변경 없이 스타일 변경
- [CHORE]: 기타 사항이에요. (주석 추가 등등)
```


## Code Convention
```
Naming
1. 변수는 CamelCase를 기본으로 한다.
2. URL, 파일명 등은 kebab-case를 사용한다.
3. 패키지명은 단어가 달라지더라도 무조건 소문자를 사용한다.
4. ENUM이나 상수는 대문자로 네이밍한다.
5. 함수명은 소문자로 시작하고 동사로 네이밍한다.
6. 클래스명은 명사로 작성하고 UpperCamelCase를 사용한다.
7. 객체 이름을 함수 이름에 중복해서 넣지 않는다. (= 상위 이름을 하위 이름에 중복시키지 않는다.)
8. 컬렉션은 복수형을 사용하거나 컬렉션을 명시해준다.
9. 이중적인 의미를 가지는 단어는 지양한다.
10. 의도가 드러난다면 되도록 짧은 이름을 선택한다.

Structure
1. 패키지는 목적별로 묶는다.
2. Controller에서는 최대한 어떤 Service를 호출할지 결정하는 역할과 Exception처리만을 담당하자.
3. 하나의 클래스 안에서는 같은 목적을 둔 코드들의 집합이여야한다.
4. 메소드와 클래스는 최대한 작게 만든다.
5. 도메인 서비스를 만들어지는 것을 피하자.


- 코드 포맷팅 : `ctrl + alt + l`(window), `command + option + l`(mac)
- 미사용 Import문 삭제 : `ctrl + alt + o`
```

## 낭만 서버❤️
feat. 생일에도 솝커톤하는 서버들
|![현정1](https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/9385f212-8aba-4f2d-874f-e1fff694647c)|![현정2](https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/e68bc780-6d77-4db0-be9f-ea794fce835c)|
|:---:|:---:|
|<img width="990" alt="현정3" src="https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/efb838a6-8cbf-42f2-ab61-2be97265a435">|![현정4](https://github.com/DO-SOPT-SOPKATHON-ANDROID-TEAM3/Server/assets/102401928/0e049bf6-3282-41f9-91f4-84acf8e72319)|
|:---:|:---:|







<br>




