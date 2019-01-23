# 3장 함수

##요약

What is method?

C - A function is a group of statements that together perform a task
Java - A method is a collection of statements that are grouped together to perform an operation
JavaScript - A function is a group of reusable code which can be called anywhere in your program

출처 - https://www.tutorialspoint.com

- 작게 만들어라 
  - 20줄도 길다
  - 1단이나 2단을 넘어서면 안된다.
  
- 한가지만 해라
  - 추상화 수준이 하나인 단계만 수행 한다면 한가지 작업 O
  - 의미있는 있는 이름으로 다른 함수를 추출할 수 있다면 X
  
- 함수 당 추상화 수준은 하나로!
  - 근본 개념과 세부사항을 뒤섞기 시작하면, 깨어진 창문처럼 사람들이 함수에 세부사항을 더 추가한다.
  - 내려가기 규칙 : 한 함수 다음에는 추상화 수준이 한 단계 낮은 함수가 온다.

- switch 문
  - 다형적 객체를 생성할때만 허용
 
- 서술적인 이름을 사용하라!
  - 이름이 길어도 괜찮다.
  - 모듈 내에서 함수 이름은 같은 문구, 명사, 동사를 사용한다. 

- 함수 인수
  - 단항 함수
    - 입력 인수를 변환하는 함수라면 변환 결과는 반환값으로 돌려준다.
    - 플래그 인수
      - 추하다
      - 여러가지를 하고 있는 셈
      - 플레그 인수에 따라 다른일을 하는게 아니라면? ex) JPA repository , 중복을 피하기 위해서..
  - 이항 함수
    - 가능하다면 단항 함수로 변경 writeField(outputStream, name)
      1. 메서드를 인자 클래스의 구성원 메서드로 변경 outputStream.writeField(name)
      2. 인자를 메서드가 정의된 클래스의 구성 변수로 변경 writeField(name) { this.outputStream } 
      3. 새로운 클래스 생성자로 인수중의 하나를 주입받도록 변경 new FieldWriter(outputStream).write(name)

  - 삼항 함수
  
  - 인수 객체
    - Builder 패턴
  
  - 인수 목록
    - 인수 개수가 가변적인 함수도 필요하다. log.info("orderId : {}, address : {}, phoneNumber : {}", orderId, address, phoneNumber)
    - 실제로는 이항 함수     public void info(String format, Object... arguments);
    
  - 동사와 키워드
    - 단항 함수는 함수와 인수가 동사/명사 쌍을 이뤄야 한다 writeField(name)
    - 함수 이름에 인수 이름을 넣는다 assertEquals -> assertExpectedEqualsActual
    
- 부수 효과를 일으키지 마라
  - 시간적인 결합, 순서 종속성 초래
  - 출력인수
    - 출력인수는 피해야 한다.
    - 함수에서 상태를 변경해야 한다면 함수가 속한 객체 상태를 변경하는 방식을 택한다.
 
- 명령과 조회를 분리하라!
  - 수행하거나 답하거나 둘 중에 하나만 해야한다.
 

- 오류 코드보다 에외를 사용하라!
  - 명령/조회 분리 법칙을 미묘하게 위반.
  - try/catch 블록은 원래 추하다. 별도 함수로 뽑아낸다.

- 반복하지 마라!

- 구조적 프로그래밍


