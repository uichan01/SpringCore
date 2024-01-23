package example.core.scope;

public class SingletonWithPrototypeBean {
    //싱글톤 빈과 함꼐 사용시 문제점
    //프로토 타입빈이 싱글톤 빈에 주입되어있을때, 싱글톤 빈을 꺼내오면 내부의 프로토타입빈을 새로 생성하지 않음(이미 주입되어있기 때문)
}
