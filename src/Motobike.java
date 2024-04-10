public class Motobike extends Transport {
    private String Capacity;

    // Constructor
    public Motobike(int ID, String brand, String publishYear, String price, String color, String Transport_type, String capacity) {
        super(ID, brand, publishYear, price, color, Transport_type);
        this.Capacity = capacity;
    }

    // Method to display information, overridden from interface
    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Capacity of transport: " + Capacity);
    }
}
