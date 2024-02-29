public class Truck implements Vehicle{
    private String type;
    private int week;
    private int WeeklyRentalRate=500;

    public Truck(String type, int week) {
        this.type = type;
        this.week = week;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public int getWeeklyRentalRate() {
        return WeeklyRentalRate;
    }

    public void setWeeklyRentalRate(int weeklyRentalRate) {
        WeeklyRentalRate = weeklyRentalRate;
    }

    @Override
    public double calculateRentalCost() {
        System.out.println("Weekly Rental Rate: "+WeeklyRentalRate+"$");
        System.out.print("Rental Cost:");
        return WeeklyRentalRate*week;
    }

    @Override
    public void displayDetails() {
        System.out.println("Truck type: "+type);

    }
}
