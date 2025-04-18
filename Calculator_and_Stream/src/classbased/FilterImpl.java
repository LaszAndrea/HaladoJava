package org.example.classbased;

public class FilterImpl implements Filter {
    @Override
    public boolean isOk(int value) {
        return value>8;
    }
}
