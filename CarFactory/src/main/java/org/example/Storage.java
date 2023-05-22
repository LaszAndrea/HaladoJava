package org.example;

import java.util.ArrayList;
import java.util.List;

public class Storage implements StorageConsumer, StorageProducer{

    private List<Car> carList = new ArrayList<>();

    // to hide implicit public constructor
    //private Storage() {}

    @Override
    public Car get(String id) {

        for(int i=0; i<carList.size(); i++){
            if(carList.get(i).getId().equalsIgnoreCase(id)){
                return carList.get(i);
            }
        }

        return null;
    }

    @Override
    public String find(String query) {
        return null;
    }

    @Override
    public void put(Car car) {
        carList.add(car);
    }

    public List<Car> getCarList() {
        return carList;
    }
}
