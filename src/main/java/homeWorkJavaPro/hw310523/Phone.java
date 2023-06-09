package homeWorkJavaPro.hw310523;

public class Phone {
    int number;
    String model;
    double weight;
public Phone (int number) {
    this.number = number;
}
public Phone() {}
    void receiveCall(String name){
        System.out.println("Calling: " + name);
    }

    public  int getNumber() {
        return number;
    }
}
