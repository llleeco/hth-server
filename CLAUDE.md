# 프로젝트 개발 규칙

## 언어
- 모든 응답은 반드시 **한국어**로 작성합니다.

## 기술 스택
- Spring MVC 5.x (전자정부 프레임워크 기반)
- MyBatis (JPA 사용 안 함)
- Java 17

## 레이어 구조
Controller → Service → Mapper

## Service 구현 규칙 (필수)

전자정부 프레임워크 표준에 따라 **모든 ServiceImpl 클래스는 반드시 `EgovAbstractServiceImpl`을 상속**해야 합니다.

```java
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service
public class XxxServiceImpl extends EgovAbstractServiceImpl implements XxxService {
    // ...
}
```

- `EgovAbstractServiceImpl`을 상속하지 않은 ServiceImpl은 **규칙 위반**입니다.
- 인터페이스만 implements하고 EgovAbstractServiceImpl을 extends하지 않으면 반드시 지적해야 합니다.

## API 응답 규칙
- 모든 REST API 응답은 반드시 `ApiCommonResponse<T>`로 감싸야 합니다.

## 예외 처리
- 비즈니스 예외는 `CustomException`을 사용합니다.
- GlobalExceptionHandler에서 처리됩니다.

## 코드 리뷰 체크리스트
1. ServiceImpl이 `EgovAbstractServiceImpl`을 상속하는가?
2. 트랜잭션 처리(@Transactional)가 적절히 되어 있는가?
3. 예외 처리가 누락되지 않았는가?
4. API 응답이 `ApiCommonResponse`로 감싸져 있는가?
