package org.example;

public class SellerImpl implements Seller {

    private final StorageConsumer storage;

    public SellerImpl(StorageConsumer storage) {
        this.storage = storage;
    }

    @Override
    public Car request(String color, String type) {
        String queryString = String.format("color: %s, type: %s", color, type);
        String foundCarId = storage.find(queryString);

        Car foundCar = null;
        if (foundCarId != null) {
            foundCar = storage.get(foundCarId);
        }
        return foundCar;
    }
}
