package org.example;

public class FactoryImpl implements Factory {

    private final Storage storage;

    public FactoryImpl(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void assemble(String type, String color) throws StorageFullException {
        Car assembledCar = new Car("1111", "Honda", type, color);

        if (storage.getCarList().size() < 10) {
            storage.put(assembledCar);
        } else {
             throw new StorageFullException("Storage is full.");
        }
    }

}
