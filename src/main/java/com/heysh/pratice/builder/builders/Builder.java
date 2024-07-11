package com.heysh.pratice.builder.builders;

import com.heysh.pratice.builder.cars.CarType;
import com.heysh.pratice.builder.components.Engine;
import com.heysh.pratice.builder.components.GPSNavigator;
import com.heysh.pratice.builder.components.Transmission;
import com.heysh.pratice.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
