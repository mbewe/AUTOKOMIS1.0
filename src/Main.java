import vehicles.*;
import persons.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println(car1);
        Car car2 = new Car();
        Car car3 = new Car();
        Car car4 = new Car();
        Car car5 = new Car();
        Car car6 = new Car();


        CarDealer owner = new CarDealer();
        System.out.println(owner.toString());
        owner.buyACar(car1);
        owner.buyACar(car2);
        owner.buyACar(car3);
        owner.buyACar(car4);
        owner.buyACar(car5);
        owner.buyACar(car6);

        Client Oscar = new Client();
        Oscar.money = 15;
        owner.sellACar(Oscar);



    }
}