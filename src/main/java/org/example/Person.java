package org.example;

public class Person {
    String firstname;
    String lastName;
    int age;

    String gender;
    String email;
    boolean isMarried;

    public Person(String firstName, String lastName, int age, String gender, String email, boolean isMarried) {
        this.firstname = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.isMarried = isMarried;
    }

    public Person(String firstName, String lastName, int age) {
        this(firstName, lastName, age, null, null, false); // constructor chaining
    }

    public String getFirstName() {
        return firstname;
    }


    public String getLastName() {
        return lastName;
    }


    public int getAge() {
        return age;
    }


    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }
}
