package org.example;

public class Box <T> {
    private T value;

    public T getValue() {
        return value;
    }

    public <K> void setValue(T value, K validator) {
        this.value = value;
    }
}
