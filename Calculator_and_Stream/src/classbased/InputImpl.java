package org.example.classbased;

import java.util.Random;

public class InputImpl implements Input {
    @Override
    public int get() {
        return new Random().nextInt();
    }
}
