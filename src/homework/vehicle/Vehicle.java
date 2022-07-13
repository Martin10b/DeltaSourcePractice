package homework.vehicle;

public class Vehicle {
    static double default_Fuel_Consumption = 1.25;
    double fuelConsumption;
    double fuel;
    int horsepower;

    public Vehicle(double fuel, int horsepower) {
        setFuel(fuel);
        setHorsepower(horsepower);
        setFuelConsumption(default_Fuel_Consumption);
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public static double getDefaultFuelConsumption() {
        return default_Fuel_Consumption;
    }

    public void drive (double kilometers) {



        if(fuel-(fuelConsumption*kilometers/100)>=0){
            System.out.println("Drove "+kilometers+"km.");
            System.out.println((fuel-(fuelConsumption*kilometers/100))+" fuel left.");
        }
        else{
            System.out.println("Not enough fuel.");
            double fuelNeeded = fuelConsumption*kilometers/100;
            double kilometersPerFuel = kilometers/fuelNeeded;
            double kilometersLeft =  (fuelNeeded-fuel)*kilometersPerFuel;
            System.out.println("Drove " + (kilometers - kilometersLeft)+"km.");
        }
    }

}
