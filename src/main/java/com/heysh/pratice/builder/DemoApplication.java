package com.heysh.pratice.builder;

import com.heysh.pratice.builder.builders.CarBuilder;
import com.heysh.pratice.builder.builders.CarManualBuilder;
import com.heysh.pratice.builder.cars.Car;
import com.heysh.pratice.builder.cars.Manual;
import com.heysh.pratice.builder.director.Director;

public class DemoApplication {

    public static void main(String[] args) {
        Director director = new Director();

        CarBuilder builder = new CarBuilder();

        //director.constructSportsCar(builder);
        //director.constructCityCar(builder);
        director.constructSUV(builder);


        Car car = builder.getResult();
        System.out.println("[Car built]\n" + car.getCarType());

        CarManualBuilder manualBuilder = new CarManualBuilder();

        //director.constructSportsCar(manualBuilder);
        //director.constructCityCar(manualBuilder);
        director.constructSUV(manualBuilder);

        Manual carManual = manualBuilder.getResult();
        System.out.println("\n[Car manual built]\n" + carManual.print());
    }
}
