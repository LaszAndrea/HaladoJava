package org.example;

public interface StorageConsumer {
    Car get(String id);

    //returns the found car's id
    String find (String query);
}
