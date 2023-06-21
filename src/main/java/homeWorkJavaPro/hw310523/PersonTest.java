package homeWorkJavaPro.hw310523;
//1. Создать класс Person, который содержит:
//
//        переменные fullName, age;
//
//
//        методы move() и talk(), в которых просто вывести на консоль сообщения, соответственно -"{здесьдолжнобытьимя} идёт" и "{здесьдолжнобытьимя} говорит".
//        Добавьте два конструктора  - Person() и Person(fullName, age).
//        Создайте второй класс и в этом классе создайте два объекта класса Person. Один объект инициализируется конструктором Person(), другой - Person(fullName, age)
public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Fred", 25);
//        System.out.println(person2.fullName);
//        person2.talk();
//        person2.move();
//
//        person1.fullName = "Karl";
//        person1.talk();
//        person1.move();

    }
}
