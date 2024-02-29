public class Car implements Vehicle{
  private String model ;
   private int days;
    private int DailyRentalRate = 50;

    public Car(String model, int days) {
        this.model = model;
        this.days = days;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getDailyRentalRate() {
        return DailyRentalRate;
    }

    public void setDailyRentalRate(int dailyRentalRate) {
        DailyRentalRate = dailyRentalRate;
    }

    @Override
    public double calculateRentalCost() {
        System.out.println("Daily Rental Rate: "+DailyRentalRate+"$");
        System.out.print("Rental Cost:");
        return DailyRentalRate*days;
    }

    @Override
    public void displayDetails() {
        System.out.println("Car Model: "+model);

    }
}
