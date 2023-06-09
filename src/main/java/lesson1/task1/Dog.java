package lesson1.task1;

public class Dog {
    String breed;
    private int age;
    String color;
    double weight;

    public  Dog() {
        System.out.println("Call constructor class Dog");
    }
    public  Dog(int age) {
        this.age = age;
    }

    public Dog(String breed, int age, String color, double weight) {
        this.breed = breed;
        this.age = age;
        this.color = color;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Error!");
            age = 0;
        }
        this.age = age;
    }

    void sleep() {
        System.out.println("Dog sleeps");
    }
    void  eat() {
        System.out.println("Dog eats");
    }

}
