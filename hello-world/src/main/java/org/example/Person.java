package org.example;

import java.util.Objects;

public class Person {

    private final String name;
    private final String address;

    public Person(String name, String address) {
        System.out.println("constructor");
        this.name = name;
        this.address = address;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public float add(float a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return add(a, b) + c;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Person)) {
            return false;
        } else {
            Person other = (Person) obj;
            return Objects.equals(name, other.name)
                    && Objects.equals(address, other.address);
        }
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", address=" + address + "]";
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}