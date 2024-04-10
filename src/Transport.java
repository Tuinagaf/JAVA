public class Transport implements ICar{
    protected int ID;
    protected String Brand;
    protected String publishYear;
    protected String Price;
    protected String Color;
    protected String Transport_type;
    protected static int Transport_count = 0;

    // Constructor
    public Transport(int ID, String brand, String publishYear, String price, String color, String Transport_type) {
        this.ID = ID;
        this.Brand = brand;
        this.publishYear = publishYear;
        this.Price = price;
        this.Color = color;
        this.Transport_type = Transport_type;
        Transport_count++;
    }

    // Method to display information
    @Override
    public void showInfo() {
        System.out.println("ID: " + ID);
        System.out.println("Brand: " + Brand);
        System.out.println("publishYear: " + publishYear);
        System.out.println("Price: " + Price);
        System.out.println("Color: " + Color);
        System.out.println("Transport Type: " + Transport_type);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getTransport_type() {
        return Transport_type;
    }

    public void setTransport_type(String transport_type) {
        Transport_type = transport_type;
    }

    public static int getTransport_count() {
        return Transport_count;
    }

    public static void setTransport_count(int transport_count) {
        Transport_count = transport_count;
    }
}
