package org.example.classbased;

public class OutputImpl implements Output {
    @Override
    public void put(int value) {
        System.out.print(value);
    }
}
