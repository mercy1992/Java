package com.company;

public class Person1 {
    private String name;
    private int age;
    public Person1() {
        this("PeterJohn", 40);
    }
    public Person1(String name, int age) {
        this.name = name;

        this.age = age;
    }
    public void setData(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showPersonDetail() {
        System.out.println("Name = " + name + ", Age = " + age);
    }
    public static void main(String args[]) {
        Person1 e = new Person1();
        e.showPersonDetail();
    }
}