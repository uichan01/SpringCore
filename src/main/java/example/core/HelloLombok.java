package example.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HelloLombok {
    private String name;
    private int age;

    public static void main(String[] args) {
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(123);

        int age1 = helloLombok.getAge();
        System.out.println("age1 = " + age1);

    }

}
