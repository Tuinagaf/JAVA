public class Truck extends Transport{
    private int loadWeight;

    public Truck(int ID, String brand, String publishYear, String price, String color, String Transport_type, int loadWeight) {
        super(ID, brand, publishYear, price, color, Transport_type);
        this.loadWeight = loadWeight;
    }

    // Constructor
    // Method to display information, overridden from interface
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("loadWeight of Transport: " +loadWeight );
    }
}
