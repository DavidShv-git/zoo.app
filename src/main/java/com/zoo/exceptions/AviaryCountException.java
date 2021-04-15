package com.zoo.exceptions;

public class AviaryCountException extends ArrayIndexOutOfBoundsException {
    public AviaryCountException() {
        super();
    }

    public AviaryCountException(String s) {
        super(s);
    }

    public AviaryCountException(int index) {
        super(index);
    }
}
