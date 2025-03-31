package oop.azamat;

public class Main {
    public static void main(String[] args) {

        Phone phone = new Phone("Nokia", "3110", 99);
        phone.printInfo();

        System.out.println("-------------Smartphone-----------");
        Smartphone smartphone = new Smartphone("iPhone", "16 Pro", 999, true, false);
        smartphone.printInfo();
        smartphone.printSmartphoneInfo();

    }
}
