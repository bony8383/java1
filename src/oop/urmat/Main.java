package oop.urmat;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Урмат");
        person.setAge(37);

        person.sayHello();
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}