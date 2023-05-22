package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.*;

class SellerImplTest {

    @Test
    void requestNotFound() {
        // GIVEN
        String color = "red";
        String type = "AUDI";

        StorageConsumer storage = mock(StorageConsumer.class);
        String queryString = String.format("color: %s, type: %s", color, type);
        when(storage.find(queryString)).thenReturn(null);

        Seller seller = new SellerImpl(storage);

        // WHEN
        Car foundCar = seller.request(color, type);

        // THEN
        assertNull(foundCar);
        verify(storage, times(1)).find(eq(queryString));
    }

    @Test
    void requestFound() {

        // GIVEN
        String color = "red";
        String type = "Sedan";
        StorageConsumer storage = mock(StorageConsumer.class);
        String queryString = String.format("color: %s, type: %s", color, type);
        String foundCarId = "123";

        when(storage.find(queryString)).thenReturn(foundCarId);
        Car car = new Car ("3131", "Audi", "Hatchback", "yellow");
        when(storage.get(foundCarId)).thenReturn(car);

        Seller seller = new SellerImpl(storage);

        // WHEN
        Car foundCar = seller.request(color, type);

        // THEN
        assertSame(car, foundCar);
        verify(storage, times(1)).find(queryString);
        verify(storage, times(1)).get(foundCarId);
    }
}
