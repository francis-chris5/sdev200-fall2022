
package objectexample2;

import java.io.Serializable;


public class Vehicle implements Serializable, Comparable {
    private String make;
    private String model;
    private int year;
    private String color;
    private String manufacturingPlant;
    private static int vehicleCounter;

    public Vehicle() {
        this.vehicleCounter++;
    }//end no-arg constructor

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
        this.vehicleCounter++;
    }

    public Vehicle(String color) {
        this.color = color;
        this.vehicleCounter++;
    }

    public Vehicle(int year) {
        this.year = year;
        this.vehicleCounter++;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vehicleCounter++;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getManufacturingPlant() {
        return manufacturingPlant;
    }

    public void setManufacturingPlant(String manufacturingPlant) {
        this.manufacturingPlant = manufacturingPlant;
    }

    public static int getVehicleCounter() {
        return vehicleCounter;
    }

    @Override
    public String toString() {
        String description = "a ";
        description += this.getYear() + ", ";
        description += this.getColor() + ", ";
        description += this.getMake() + " " + this.getModel();
        return description;
    }

    @Override
    public boolean equals(Object obj) {
        Vehicle v2 = (Vehicle)obj;
        return (this.getMake().equals(v2.getMake()) && this.getModel().equals(v2.getModel()));
    }//end equals()

    /**
     * A comparison between the years the cars were made.
     * @param obj the vehicle we are comparing years with
     * @return int if this is the newer it's positive, if the other is newer it's negative, and if they are the same year it's zero
     */
    @Override
    public int compareTo(Object obj) {
        return this.getYear() - ((Vehicle)obj).getYear();
    }
    
}//end Vehicle class