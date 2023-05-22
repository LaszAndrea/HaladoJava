package org.example;

public class StorageFullException extends RuntimeException {

    public StorageFullException(String errorMessage) {
        super(errorMessage);
    }
}
