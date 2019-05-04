package com.f.pojo;

public class Dog {
    private String name;

    public Dog() {
        System.out.println("dog ready");
    }

    public Dog(String name) { // 有参构造
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
