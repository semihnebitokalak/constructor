class Car {
    String model;
    int speed;

    // Varsayılan constructor, otomatik olarak eklenir
    // public Car() {} - Bu gizli bir şekilde eklenmiş olur.
    public Car(){}

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    void display() {
        System.out.println("Model: " + model + ", Speed: " + speed);
    }
}

public class Main {
    public static void main(String[] args) {
        // Varsayılan constructor ile Car nesnesi oluşturulur
        Car car1 = new Car();
        Car car2 = new Car("BMW", 10);
        car1.display();  // Model: null, Speed: 0
        car2.display();
    }
}