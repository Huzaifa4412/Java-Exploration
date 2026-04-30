class Car {
    String name;
    String color;
    int price;
    static boolean check = false;
    int speed = 10;

    Car(String name, String color, int price) {
        this.name = name;
        this.color = color;
        this.price = price;
    }

    void accelerate() {
        speed += 10;

    }
}

public class OopsIntro {
    public static void main(String[] args) {
        System.err.println("Hello world");
        Car toyota = new Car("Toyota", "Red", 200);
        // System.out.println(toyota.name);
        // System.out.println(toyota.color);
        // System.out.println(toyota.price);
        // Car.check = true;
        // toyota.check = true;
        // System.err.println(Car.check);

        Car honda = new Car("Honda", "hite", 100);
        // System.err.println(honda.check);
        System.err.println(honda.speed);

        honda.accelerate();
        // Speed Increase Second Time

        honda.accelerate();

        System.err.println(honda.speed);

        // Toyota Speed Check
        System.err.println(toyota.speed);
    }
}