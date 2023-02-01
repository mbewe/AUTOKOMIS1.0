package persons;


import vehicles.Car;

import java.util.Scanner;

public class CarDealer extends Person{
    public static Integer DEFAULD_PARKING_SIZE = 3;


    public String carDealerName;
    public String mode;

    private  Car[] parkingSize; //todo: a może lista?
    private int[] startingMoney = {25000, 100000, 200000, 500000};
    private String[] modes = {"Legedary", "Hard", "Medium", "Easy"};
    public CarDealer() {
        Scanner input0 = new Scanner((System.in));
        System.out.println("A więc postanowileś zostać Handlarzem,\n królem wciskania fuszerki, rodzina nie może być z Ciebie dumna... \n Jak Ci Matka dała na imie ?");
        this.name= input0.nextLine();
    }

    }

