public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
        System.out.println(car.price);
        System.out.println(car.model);

        car.start();
        car.stop();
                car.drive();

    }
}
