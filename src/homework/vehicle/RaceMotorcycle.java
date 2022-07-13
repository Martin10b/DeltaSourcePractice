package homework.vehicle;

public class RaceMotorcycle extends Motorcycle{

    static double default_Fuel_Consumption = 8;

    public RaceMotorcycle(double fuel, int horsepower) {
        super(fuel,horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }
}
