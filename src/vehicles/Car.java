package  vehicles;

import java.security.Policy;
import java.util.Random;

public class Car implements Parameters {
    final public String producer;
    public String model;
    public String color;
    public String typeOfBodywork;
    public String typeOfFuel;
    public int value;
    public int price;
    public int yearOfProduction;
    public int carMileage;
    public Double powerEngine;
    private static Random random = new Random();


    public Car() {
        this.producer = producers[random.nextInt(producers.length)];
        this.model = models[random.nextInt(models.length)];
        this.color = colors[random.nextInt(colors.length)];
        this.typeOfBodywork = bodyTypes[random.nextInt(bodyTypes.length)];
        this.typeOfFuel = typesOfFuel[random.nextInt(bodyTypes.length)];
        this.value = values[random.nextInt(values.length)];
        this.yearOfProduction = yearsOfProduction[random.nextInt(yearsOfProduction.length)];
        this.carMileage = carsMileage[random.nextInt(carsMileage.length)];
        this.powerEngine = powersEngine[random.nextInt(powersEngine.length)];
    }

@Override
    public String toString() {
        return "--------------------" + "\nProducer: " + this.producer + "\nModel: " + this.model + "\nColor: " + this.color + "\nType of bodywork: " +
                this.typeOfBodywork + "\nType of fuel: " + this.typeOfFuel + "\nValue: " + this.value + "\nYear of production: " +
                this.yearOfProduction + "\nCar mileage: " + this.carMileage + "\nPower engine: " + this.powerEngine ;

}
}
