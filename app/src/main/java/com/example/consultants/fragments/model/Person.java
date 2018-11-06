package com.example.consultants.fragments.model;

public class Person {
    String Name;
    String Age;
    String Gender;

    public Person(String name, String age, String gender) {
        Name = name;
        Age = age;
        Gender = gender;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Age='" + Age + '\'' +
                ", Gender='" + Gender + '\'' +
                '}';
    }
}
