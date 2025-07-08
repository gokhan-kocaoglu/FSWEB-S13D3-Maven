package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println(person.isTeen());

        Wall wall = new Wall(5, 4);

        System.out.println("area= " + wall.getArea()); // area= 20.0

        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());   // width= 5.0
        System.out.println("height= " + wall.getHeight()); // height= 0.0
        System.out.println("area= " + wall.getArea());
    }
}
