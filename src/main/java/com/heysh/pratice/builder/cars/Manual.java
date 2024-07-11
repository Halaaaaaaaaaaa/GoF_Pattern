package com.heysh.pratice.builder.cars;

import com.heysh.pratice.builder.components.Engine;
import com.heysh.pratice.builder.components.GPSNavigator;
import com.heysh.pratice.builder.components.Transmission;
import com.heysh.pratice.builder.components.TripComputer;

public class Manual {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(CarType carType, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    /*public String print() {
        String info = "";
        info += "Type of car: " + carType + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }*/
    public String print() {
        String info = "";
        info += String.format("Type of car: \t\t%s\n", carType);
        info += String.format("Count of seats: \t%d\n", seats);
        info += String.format("Engine: \t\t\tvolume - %.1f / mileage - %.1f\n", engine.getVolume(), engine.getMileage());
        info += String.format("Transmission: \t\t%s\n", transmission);
        info += String.format("Trip Computer: \t\t%s\n", (this.tripComputer != null) ? "Functional" : "N/A");
        info += String.format("GPS Navigator: \t\t%s\n", (this.gpsNavigator != null) ? "Functional" : "N/A");
        return info;
    }
}
