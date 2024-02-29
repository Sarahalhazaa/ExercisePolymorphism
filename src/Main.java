import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayList<Vehicle> rentedVehicles = new ArrayList<>();
        System.out.println();
        System.out.println("1. Rent a Car\n" +
                "2. Rent a Bike\n" +
                "3. Rent a Truck\n" +
                "4. View Rented Vehicles 5. Exit\n");
        System.out.println("Enter a number from the list");
        int num = scanner.nextInt();
while (num!=5){
        switch (num){

            case 1:{System.out.println("Enter Car Model: ");
                scanner.nextLine();
          String Model = scanner.nextLine();
          System.out.println("Enter Rental Days: ");
            int Days = scanner.nextInt();
                Car C=new Car(Model,Days);
           System.out.println("Rental Details: ");
            rentedVehicles.add(C);
            C.displayDetails();
            System.out.println(C.calculateRentalCost());

                   break;
            }

            case 2:{System.out.println("Enter Bike brand: ");
                scanner.nextLine();
                String brand = scanner.nextLine();
                System.out.println("Enter Rental Hours: ");
                int Hours = scanner.nextInt();
                Bike B =new Bike(brand,Hours);
                System.out.println("Rental Details: ");
                rentedVehicles.add(B);
                B.displayDetails();
                System.out.println(B.calculateRentalCost());

                break;
            }

            case 3:{System.out.println("Enter Truck type: ");
                scanner.nextLine();
                String type = scanner.nextLine();
                System.out.println("Enter Rental weeks: ");
                int weeks = scanner.nextInt();
                Truck T=new Truck(type,weeks);
                System.out.println("Rental Details: ");
                rentedVehicles.add(T);
                T.displayDetails();
                System.out.println(T.calculateRentalCost());

                break;}
            case 4:{
            for (Vehicle vehicle : rentedVehicles){
            vehicle.displayDetails();
            System.out.println(vehicle.calculateRentalCost());
            }break;
            }

            case 5: {
            break;}
        }
    System.out.println("Enter a number from the list");
   num = scanner.nextInt();

}
        System.out.println("Thank you for using the Vehicle Rental System!");
    }
}