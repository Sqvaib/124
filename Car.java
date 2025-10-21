public class Car {
    private int id;
    private String make;
    private String model;
    private int year;
    private String color;
    private int cost;
    private String license_plate;

    public Car(int id, String make, String model, int year, String color, int cost, String license_plate) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.cost = cost;
        this.license_plate = license_plate;
    }   
    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
    }
    public int getCost() {
        return cost;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public String getLicensePlate() {
        return license_plate;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setLicensePlate(String license_plate) {
        this.license_plate = license_plate;
    }
}