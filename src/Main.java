import java.util.Scanner;
public class Main {
    public static <Transport> void main(String[] args) {
        TransportManager transportManager = new TransportManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Add Transport");
            System.out.println("2. Display All Transport");
            System.out.println("3. Update Transport");
            System.out.println("4. Delete Transport");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Transport Type (Car/Motobike/Truck): ");
                    String Transport_type = scanner.nextLine();
                    System.out.println("Enter ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.println("Enter Brand: ");
                    String brand = scanner.nextLine();
                    System.out.println("Enter publishYear: ");
                    String publishYear = scanner.nextLine();
                    System.out.println("Enter Price: ");
                    String price = scanner.nextLine();
                    System.out.println("Enter : ");
                    String color = scanner.nextLine();
                    if (Transport_type.equalsIgnoreCase("Car")) {
                        System.out.println("Enter Slots: ");
                        int slots = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Enter Engine Type: ");
                        String engineType = scanner.nextLine();
                        Car car = new Car(id,brand,publishYear,price,color,Transport_type,slots,engineType);
                        transportManager.addTransport(car);
                    } else if (Transport_type.equalsIgnoreCase("Motobike")) {
                        System.out.println("Enter Capacity: ");
                        String capacity = scanner.nextLine();
                        Motobike motobike = new Motobike(id,brand,publishYear,price,color,Transport_type,capacity);
                        transportManager.addTransport(motobike);
                    } else if (Transport_type.equalsIgnoreCase("Truck")) {
                        System.out.println("Enter loadWeiht: ");
                        int loadWeight = scanner.nextInt();
                        Truck truck = new Truck(id,brand,publishYear,price,color,Transport_type,loadWeight);
                        transportManager.addTransport(truck);
                    } else {
                        System.out.println("Invalid Transport type!");
                    }
                    break;
                case 2:
                    transportManager.displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Enter ID of transport to update: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Enter Brand: ");
                    String newBrand = scanner.nextLine();
                    System.out.println("Enter new publishYear: ");
                    String newpublishYear = scanner.nextLine();
                    System.out.println("Enter new Price: ");
                    String newPrice = scanner.nextLine();
                    System.out.println("Enter new Color: ");
                    String newColor = scanner.nextLine();
                    transportManager.updateTransport(updateID, newBrand, newpublishYear, newPrice, newColor);
                    break;
                case 4:
                    System.out.println("Enter ID of Transport to delete: ");
                    int deleteID = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    transportManager.deleteTransport(deleteID);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}