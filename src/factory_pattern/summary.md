팩토리 패턴은 객체를 만들기만 하는 팩토리 클래스를 따로 생성하는 것이 아니다.
팩토리 메서드를 추상 메서드로 선언하고, 서브클래스에서 구현하도록 해야 한다.
그리고 만들어진 객체를 공통적으로 가공하는 작업이 필요하다면, 슈퍼클래스에 구현해서 선언하면 된다.
그러면 우리는 서브클래스의 인스턴스를 생성해서 가공하는 작업까지 해주는 메서드를 호출하고, 그 메서드에서 팩토리 메서드를 호출해서 알맞은 객체를 생성해서 가져와 가공하고 반환해준다.
여기서 다른 점은, 실제적인 팩토리가 곧 서브클래스이기 때문에 여러 개를 둘 수 있다는 것이다.