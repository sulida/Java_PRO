package homeWorkJavaPro.hw310523;

import homeWorkJavaPro.hw310523.Phone;
//Класс Phone.
//        Создайте класс Phone, который содержит переменные number, model и weight.
//        Создайте второй класс и в нём создайте три экземпляра Phone.
//        Выведите на консоль значения их переменных.
//        Добавить в класс Phone метод: receiveCall, который принимает один параметр – имя звонящего.
//        Данный метод должен выводить на консоль сообщение “Звонит {здесьимязвонящего}”.
//        Создайте геттер getNumber – он должен возвращать номер телефона.
//        Вызвать эти методы для каждого из объектов.


public class Phonetest {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.number = 123456;
        phone1.model = "Nokia";
        phone1.weight = 197.8;
        Phone phone2 = new Phone();
        phone2.number = 234567;
        phone2.model = "Sumsung";
        phone2.weight = 186.1;
        Phone phone3 = new Phone();
        phone3.number = 345678;
        phone3.model = "Iphone";
        phone3.weight = 141.0;

        System.out.println("Phone number 1: " + phone1.number + ", Model: " + phone1.model + ", Weight: " + phone1.weight + ".");
        phone1.receiveCall("Fred");
        System.out.println(phone1.getNumber());

        System.out.println("Phone number 2: " + phone2.number + ", Model: " + phone2.model + ", Weight: " + phone2.weight + ".");
        phone1.receiveCall("Fred");
        System.out.println(phone2.getNumber());

        System.out.println("Phone number 3: " + phone3.number + ", Model: " + phone3.model + ", Weight: " + phone3.weight + ".");
        phone1.receiveCall("Fred");
        System.out.println(phone3.getNumber());




    }
}
