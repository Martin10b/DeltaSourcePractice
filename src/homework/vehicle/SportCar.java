package homework.vehicle;

public class SportCar extends Car {
    static double default_Fuel_Consumption = 10;

    public SportCar(double fuel, int horsepower){
        super(fuel,horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }
}

