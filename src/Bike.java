public class Bike implements Vehicle{
    private String brand ;
    private int hour;
    private int HourlyRentalRate=10;

    public Bike(String brand, int hour) {
        this.brand = brand;
        this.hour = hour;

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHourlyRentalRate() {
        return HourlyRentalRate;
    }

    public void setHourlyRentalRate(int hourlyRentalRate) {
        HourlyRentalRate = hourlyRentalRate;
    }

    @Override
    public double calculateRentalCost() {
        System.out.println("Hourly Rental Rate: "+HourlyRentalRate+"$");
        System.out.print("Rental Cost:");
        return HourlyRentalRate*hour;
    }

    @Override
    public void displayDetails() {
System.out.println("Bike Brand: "+brand);
    }
}
