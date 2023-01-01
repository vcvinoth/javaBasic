package org.com.vc.builder;

/*
Builder client class which creates different types of Vehicle
using Builder pattern
 */
public class BuilderClient {

    public static void main(String[] args) {

        Vehicle car = new Vehicle.VehicleBuilder(4,"Honda").setNoOfAirbag(4).build();
        System.out.println(car.toString());
        Vehicle bike = new Vehicle.VehicleBuilder(2,"Apache").build();
        System.out.println(bike.toString());
    }
}
