package com.company;

public class Person {
    private String name;
    private String address;
    private int age;
    public Person() {
        this("PeterJohn", 30);
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String args[]) {
        Person e = new Person();
        System.out.println(e);
    }
}
