package persons;

import java.util.LinkedList;
import java.util.Scanner;


public class CarDealer extends Person{
    public static Integer DEFAULD_PARKING_SIZE = 3;


    public String carDealerName;
    public int mode;

    private  LinkedList parking = new LinkedList();
    private int parkingSize;
    private int[] parkingsSize = {5,4,3,1};
    private int[] startingMoney = {500000, 200000, 200000, 25000};
    private String[] modes = { "Łatwy","Średni", "Trudny","Legedarny"};
    public  CarDealer() {

        Scanner input0 = new Scanner((System.in));
        System.out.println("A więc postanowileś zostać Handlarzem,\nkrólem wciskania fuszerki, rodzina nie może być z Ciebie dumna...\nJak Ci Matka dała na imie ?");
        this.name = input0.nextLine();

        Scanner input1 = new Scanner((System.in));
        System.out.println("Wybierz poziom trudnosci prowadzenia komisu synek \n1." + modes[0] + "\n2." + modes[1] + "\n3." + modes[2] + "\n4." + modes[3]);
        this.mode = input1.nextInt() - 1;

        this.parkingSize = parkingsSize[this.mode];
        this.money = startingMoney[this.mode];
    }
        @Override
        public String toString() {
            return "Witam w świecie seksu i showbiznesu " + this.name + ".\nWybrałes poziom " + modes[this.mode] +
                    ".\nNa Twoim koncie widnieje " + this.money + " cebulionów, wydaj je mądrze." + "\nNarazie w twoim komisie może stac jedynie " +
                    this.parkingSize + " samochodów";
        }

    }



