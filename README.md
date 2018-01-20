# Spring Boot Starter of Honeymon

* 발표자: 김지헌(허니몬, [honeymon.io](http://honeymon.io))


갑작스런 **완수형(Helly)**이 스프링부트를 알려달라는 이야기를 해서 급히 준비를 했습니다. 스프링 부트를 처음 사용하시는 분에게 어떻게 소개를 할지를 고민하고 있습니다. 

## Spring Boot 소개
* [2014/04/01 Spring Boot 1.0 GA 출시](https://spring.io/blog/2014/04/01/spring-boot-1-0-ga-released)

그 이후 꾸준하게 버전업을 하면서 현재는 2.0.0 M7까지 진행중

스프링부트는 새로운 버전이 출시될 때마다 지원하는 라이브러리의 버전들도 함께 갱신된다. 이에 대한 정보는 [`spring-boot-dependencies`](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-project/spring-boot-dependencies)를 살펴보면 된다.

BOM(Bill of Materials)

## Spring Boot 구조

Spring Boot = BuildTools(Maven, Gradle) (Spring Boot Plugin + Spring + Auto Configuration + Starter)

* [`spring-boot-project` - Github(https://goo.gl/Vkj785)](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-project)

### Spring Boot Application 의 시작점: `@SpringBootApplication`
* `@SpringBootApplication`: `@EnableAutoConfiguration`, `@ComponentScan`, `@SpringBootConfiguration`(`@Configuration`)가 조합되어 **스프링 부투의 마법**이 시작되는 지점입니다.
  
### 빠른 기능추가: 스타터(spring-boot-starters)
* 스프링 부트는 [`http://start.spring.io/`](http://start.spring.io/)을 통해서 사용자들이 사용하는 기술 트렌드를 관찰한다. 그 결과 중 하나로 velocity 는 이제 지원중단(Deprecated)을 할 예정이다.

### 자동구성(Auto-Configuration)
* `~~AutoConfiguration`
* [유연한 연결(Releaxed binding)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-external-config-relaxed-binding)

## honeymon-spring-boot-starter
스프링 부트에서 제공하는 스타터(Starter) 외에도 개발자가 자신에게 필요한 구성을 자동구성(Auto-Configuration)한 스타터를 이용할 수 있다.
여기에는 내부적인 캐시설정, 메시징 처리, 보안 처리 등을 할 수 있다.

### `@ConditonOn*` 조건처리 애너테이션
* 패키지: `org.springframework.boot.autoconfigure.condition`
  - 대표적인 조건클래스 `@ConditionOnClass`, `@ConditionOnMissingClass`, `@ConditionOnBean`, `@ConditionOnMissingBean`    

## 정리
스프링 부트를 이용하기 위해서는,
* 스프링 부트 레퍼런스를 한번 쭈욱 읽어주시고
* 스프링 부트 자동구성 클래스가 모여있는 `org.springframework.boot.autoconfigure` 패키지([spring-boot-autoconfigure](https://github.com/spring-projects/spring-boot/tree/master/spring-boot-project/spring-boot-autoconfigure))를 살펴봅니다.
  * 생각했던 것과는 다르게 동작하는 경우가 있다면, 추가한 스타터의 자동구성이 의도와 다르게 구성되어 있는 경우가 많음
  * 그럴 때는 [스프링 부트 레퍼런스#부록(공통 애플리케이션 속성)](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#common-application-properties) 을 살펴보고 속성을 살펴봅니다.
  * 간혹 문서에 나와있는 기본속성이 코드에서는 다르게 구현되어 있는 경우도 있음

## 참고문헌
* [Spring Boot Reference Documentation](https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle)
* [Master Spring Boot auto-configuration](https://github.com/snicoll-demos/spring-boot-master-auto-configuration)
* [SpringOne 2017 Platform re:cap - 정윤신(Pivotal)](https://www.slideshare.net/PivotalKorea/springone-platform-recap)