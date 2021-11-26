# 미션 - 숫자 야구 게임

---
## 구현할 기능

---

- [X] 1:1 관계에서 컴퓨터의 수와 위치와 자신이 낸 값(수)와 위치를 비교하여 스트라이크, 볼, 낫싱을 판별한다
  - [X] 값이 같고 위치도 같으면 스트라이크이다
  - [X] 값이 같고 위치는 다르면 볼이다
  - [X] 값이 위치 모두 다르면 낫싱이다
- [X] 1:N 관계를 가지는 메서드 구현 : play
- [X] N:M 관계를 가지는 메서드 구현 : play

---

- [ ] 컴퓨터는 랜덤 값을 생성할 수 있다
- [X] 화면에 진행하는 문구를 표시한다
- [X] 핵심 도메인 객체와 입출력을 담당하는 뷰,   
    큰 틀에서 처리하는 컨트롤러를 나누어서 설게한다
- [X] 플레이어는 오직 3개의 숫자만을 입력할 수 있다
- [ ] 상대방의 숫자를 모두 맞추면 종료된다

---

- [ ] 이 같은 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임이 종료된다.
- [ ] 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료할 수 있다.
- [X] 사용자가 잘못된 값을 입력할 경우 `IllegalArgumentException`을 발생시킨 후 애플리케이션은 종료되어야 한다.


