package org.com.vc.builder;

/*
Builder pattern - Separate the construction of a complex object from its representation so that
the same construction process can create different representations.
 */
public class Vehicle {
    private int noOfWheel;
    private String engine;
    private int noOfAirbag;

    private Vehicle(VehicleBuilder builder) {
        this.noOfWheel = builder.noOfWheel;
        this.engine = builder.engine;
        this.noOfAirbag = builder.noOfAirbag;
    }

    public int getNoOfWheel() {
        return noOfWheel;
    }

    public String getEngine() {
        return engine;
    }

    public int getNoOfAirbag() {
        return noOfAirbag;
    }

    public static class VehicleBuilder {
        private int noOfWheel;
        private String engine;
        private int noOfAirbag;

        public VehicleBuilder(int noOfWheel, String engine) {
            this.noOfWheel = noOfWheel;
            this.engine = engine;
        }

        public VehicleBuilder setNoOfWheel(int noOfWheel) {
            this.noOfWheel = noOfWheel;
            return this;
        }

        public VehicleBuilder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public VehicleBuilder setNoOfAirbag(int noOfAirbag) {
            this.noOfAirbag = noOfAirbag;
            return this;
        }

        public Vehicle build() {
            return new Vehicle(this);
        }

    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "noOfWheel=" + noOfWheel +
                ", engine='" + engine + '\'' +
                ", noOfAirbag=" + noOfAirbag +
                '}';
    }
}
