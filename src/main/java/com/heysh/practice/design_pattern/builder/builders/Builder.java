package com.heysh.practice.design_pattern.builder.builders;

import com.heysh.practice.design_pattern.builder.cars.CarType;
import com.heysh.practice.design_pattern.builder.components.Engine;
import com.heysh.practice.design_pattern.builder.components.GPSNavigator;
import com.heysh.practice.design_pattern.builder.components.Transmission;
import com.heysh.practice.design_pattern.builder.components.TripComputer;

public interface Builder {
    void setCarType(CarType type);
    void setSeats(int seats);
    void setEngine(Engine engine);
    void setTransmission(Transmission transmission);
    void setTripComputer(TripComputer tripComputer);
    void setGPSNavigator(GPSNavigator gpsNavigator);
}
