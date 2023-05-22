package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

class FactoryImplTest {

    @Test
    void cannotStore() {
        // GIVEN, WHEN
        Car putCar = new Car("1234", "BMW", "Sedan", "black");
        StorageProducer storage = mock(StorageProducer.class);
        doThrow(StorageFullException.class).when(storage).put(putCar);

        // THEN
        assertThrows(StorageFullException.class, () -> storage.put(putCar));
    }

    @Test
    void canStore() {
        // GIVEN
        Car putCar = new Car("4321", "Mazda", "SUV", "blue");
        StorageProducer storage = mock(StorageProducer.class);

        // WHEN
        storage.put(putCar);

        // THEN
        verify(storage, times(1)).put(putCar);
    }

    @Test
    void canFindGet(){

        //GIVEN
        Car putCar = new Car("0121", "Audi", "SUV", "black");
        Storage storage = mock(Storage.class);

        // WHEN
        storage.put(putCar);
        Car found = storage.get("0121");

        // THEN
        assertEquals(putCar, found);


    }

}
