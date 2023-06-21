package homeWorkJavaPro.hw310523;

public class Person {
    String fullName;
    int age;

    public  Person() {

    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;

    }
    public void move() {
        System.out.println(fullName + " moves");

    }
    public void talk() {
        System.out.println(fullName + " talks");
    }
}
