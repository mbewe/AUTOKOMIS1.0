package  vehicles;

import java.util.Random;

public class Car {
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

    private static final String[] producers = {"Tesla", "BMW", "Mercedes", "Audi", "Toyota", "Opel", "Citroen", "Dacia", "Fiat"}; //todo: uzupełnić marki
    private static final String[] models = {"Model S", "3 Series", "E-Class", "A4", "Camry"}; //todo: przypisac modele do producentów
    private static final String[] colors = {"red", "blue", "green", "black", "white"};//todo: dodac opcje
    private static final String[] bodyTypes = {"sedan", "SUV", "coupe", "convertible", "hatchback"}; //todo: przypisac do danego modelu
    private static final String[] typesOfFuel = {"Diesel", "Petrol", "LPG", "Hybrid", "Electric"};
    private static final int[] values = {5, 10, 12}; //todo:randomowa wartość z zakresu
    private static final int[] yearsOfProduction = {2018, 2019, 2020, 2021, 2022}; //todo: zwiekszyć zakres
    private static final int[] carsMileage = {777777, 888888, 999999}; //todo: random
    private static final Double[] powersEngine = {1.0, 1.2, 1.4, 1.6, 1.8, 2.0, 2.2, 2.4, 2.6, 3.0, 3.4, 4.0, 5.0}; //todo: silniki elektryczne?

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
        return "Producer: " + this.producer + "\nModel: " + this.model + "\nColor: " + this.color + "\nType of bodywork: " +
                this.typeOfBodywork + "\nType of fuel: " + this.typeOfFuel + "\nValue: " + this.value + "\nYear of production: " +
                this.yearOfProduction + "\nCar mileage: " + this.carMileage + "\nPower engine: " + this.powerEngine;

}
}
