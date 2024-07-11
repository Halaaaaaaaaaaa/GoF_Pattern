package com.heysh.practice.design_pattern;

import com.heysh.practice.design_pattern.builder.builders.CarBuilder;
import com.heysh.practice.design_pattern.builder.builders.CarManualBuilder;
import com.heysh.practice.design_pattern.builder.cars.Car;
import com.heysh.practice.design_pattern.builder.cars.Manual;
import com.heysh.practice.design_pattern.builder.director.Director;

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
