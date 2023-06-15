package homeWork13;

public class Car {
    String numberOfCar;

    @Override
    public String toString() {
        return "Car{" +
                "numberOfCar='" + numberOfCar + '\'' +
                ", brand='" + brand + '\'' +
                ", enginePower=" + enginePower +
                ", rentalCost=" + rentalCost +
                '}';
    }

    private String brand;
    private int enginePower;
    private double rentalCost;

    public Car(String numberOfCar, String brand, int enginePower, double rentalCost) {
        this.numberOfCar = numberOfCar;
        this.brand = brand;
        this.enginePower = enginePower;
        this.rentalCost = rentalCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (enginePower != car.enginePower) return false;
        if (Double.compare(car.rentalCost, rentalCost) != 0) return false;
        if (!numberOfCar.equals(car.numberOfCar)) return false;
        return brand.equals(car.brand);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = numberOfCar.hashCode();
        result = 31 * result + brand.hashCode();
        result = 31 * result + enginePower;
        temp = Double.doubleToLongBits(rentalCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
