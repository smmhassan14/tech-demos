public class Car {
    String brand;
    int year;
    String color;

    public Car(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return "Brand: " + brand + " Year: " + year + " Color: " + color;
    }
}
