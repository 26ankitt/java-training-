
class Car{

    String color;
    String model;
    String brand;
    int mileage;
    int no_of_gears;

    void applyBrake(){
        System.out.println("Breaking");
    }
    void applySpeed(){
        System.out.println("Speed...");
    }
    void shiftGear(){
        System.out.println("Speed...");
    }

    Car(String color, String model, String brand, int mileage, int no_of_gears){
        this.color = color;
        this.model = model;
        this.brand = brand;
        this. mileage = mileage;
        this.no_of_gears = no_of_gears;
    }
}

class Nano extends Car{
    int capacity;
    Nano(String color, String model, String brand, int mileage, int no_of_gears, int capacity){
        this.capacity = capacity;
        super(color, model, brand, mileage, no_of_gears);
    }
    void airbags()[
        System.out.println("Airbags...");
    ]
}
public class Inh1 {
    public static void main(String[] args) {
        Nano obj = new Nano(black, Top, Tata, 20, 6, 4);
    }
}
