public class Car extends Transport{
    private int Slots;
    private String engineType;

    // Constructor
    public Car(int ID, String brand, String publishYear, String price, String color, String Transport_type, int slots, String engineType) {
        super(ID, brand, publishYear, price, color, Transport_type);
        this.Slots = slots;
        this.engineType = engineType;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Slots: " + Slots);
        System.out.println("Engine Type: " + engineType);
    }
}
