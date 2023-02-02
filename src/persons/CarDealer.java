package persons;

import vehicles.*;
import java.util.LinkedList;
import java.util.Scanner;


public class CarDealer extends Person{


    public String carDealerName;
    public int mode;

    public static LinkedList parking = new LinkedList();
    public static int parkingSize;
    public static int carParkFreePlaces;
    private int[] parkingsSize = {5,4,3,1};
    private int[] startingMoney = {500000, 200000, 200000, 25000};
    private String[] modes = { "Łatwy","Średni", "Trudny","Legedarny"};
    public  CarDealer() {

        Scanner input0 = new Scanner((System.in));
        System.out.println("A więc postanowileś zostać Handlarzem,\nkrólem wciskania fuszerki, rodzina nie może być z Ciebie dumna...\nJak Ci Matka dała na imie ?");
        this.name = input0.nextLine();

        Scanner input1 = new Scanner((System.in));
        System.out.println("Jak nazwiesz swoją świątynie w której będziesz przyjmował pielgrzymów spragnionych najwyższej klasy motoryzacji?");
        this.carDealerName = input1.nextLine();

        Scanner input2 = new Scanner((System.in));
        System.out.println("Wybierz poziom trudnosci prowadzenia komisu synek \n1." + modes[0] + "\n2." + modes[1] + "\n3." + modes[2] + "\n4." + modes[3]);
        this.mode = input2.nextInt() - 1;

        this.parkingSize = parkingsSize[this.mode];
        this.money = startingMoney[this.mode];
        this.carParkFreePlaces = this.parkingSize;
    }

    public void buyACar(Car newCar) {
        if (CarDealer.carParkFreePlaces <= 0) {
            System.out.println("Nie masz miejsca w komisie synek");
        } else if (CarDealer.carParkFreePlaces > 0 && CarDealer.money < newCar.value) {
            System.out.println("Jeszcze musisz pozbierac na takie cacuszko");
        }else if (CarDealer.carParkFreePlaces > 0 && CarDealer.money >= newCar.value) {
            System.out.println("Zakup zakończył się powodzeniem :) Brum Brum");
            CarDealer.carParkFreePlaces--;
            this.parking.add(newCar);

        }
        }
    public void sellACar(Client newClient) {
        System.out.println("Na Twoim parkingu znajdują się : ");

        for (int i = 0; i < CarDealer.parkingSize; i++) {
            System.out.println("--------------------");
            System.out.println(i + ". ");
            System.out.println(CarDealer.parking.get(i));
        }
        System.out.println("Który samochód chcesz sprzedać? (podaj indeks)");
        Scanner input3 = new Scanner((System.in));
        int i = input3.nextInt();

        System.out.println("Za ile chcesz go sprzedać?");
        Scanner input4 = new Scanner((System.in));
        Car j = (Car) this.parking.get(i);
        j.price = input4.nextInt();

        if (j.price > newClient.money) {
            System.out.println("Jeszcze musisz pozbierac na takie cacuszko");
        }else if (j.price <= newClient.money) {
            System.out.println("Sprzedaż zakończyła się powodzeniem :) Brum Brum");
            CarDealer.money += j.price;
            this.parking.remove(j);
            CarDealer.carParkFreePlaces++;
        }
    }

        @Override
        public String toString() {
            return "Witam w świecie seksu i showbiznesu " + this.name + ".\nWybrałes poziom " + modes[this.mode] +
                    ".\nNa Twoim koncie widnieje " + this.money + " cebulionów, wydaj je mądrze." + "\nNarazie w twoim komisie może stac jedynie " +
                    this.parkingSize + " samochodów";
        }

    }



