public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Car 1", "BMW", 2020, 350000f, "white", 5);
        Car car2 = new Car("Car 1", "BMW", 2020, 350000f, "white", 5);

        System.out.println(car1);
        System.out.println(car2);

        System.out.println("Are these objects equal? " + car1.equals(car2));
        System.out.println("The hashCode of this object 1: " + car1.hashCode());
        System.out.println("The hashCode of this object 2: " + car2.hashCode());
    }
}