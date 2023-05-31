package task1;

import task1.Dog;

public class DogTest {
    public static void main(String[] args) {
//        Объявление переменной
        int value;
//        Инициализация переменной
        value = 5;
//        Объявление переменной объектный ссылочный
        Dog smallDog;
//        Инициализация переменной (с созданием обетка)
        smallDog = new Dog();

//        Объявление и инициализация
        Dog bigDog = new Dog();
        smallDog.color = "Black";
        bigDog.color = "White";
        System.out.println("Color of a small dog: " + smallDog.color);
        System.out.println("Color of a big dog: " + bigDog.color);

        smallDog.sleep();
        bigDog.eat();

        Dog dog = new Dog(7);
//        System.out.println("Age: " + dog.age);
        Dog dog1 = new Dog();
        dog1.setAge(-2);           // установили данные
        System.out.println(dog1.getAge());
        dog1.setAge(9);           // установили данные
        System.out.println(dog1.getAge());
        Dog dog2 = new Dog();
        System.out.println(dog2);





    }
}
