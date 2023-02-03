package  vehicles;


public interface Parameters {
    public static final String[] producers = {"Tesla", "BMW", "Mercedes", "Audi", "Toyota", "Opel", "Citroen", "Dacia", "Fiat"}; //todo: uzupełnić marki
    public static final String[] models = {"Model S", "3 Series", "E-Class", "A4", "Camry"}; //todo: przypisac modele do producentów
    public static final String[] colors = {"red", "blue", "green", "black", "white"};//todo: dodac opcje
    public static final String[] bodyTypes = {"sedan", "SUV", "coupe", "convertible", "hatchback"}; //todo: przypisac do danego modelu
    public static final String[] typesOfFuel = {"Diesel", "Petrol", "LPG", "Hybrid", "Electric"};
    public static final int[] values = {5, 10, 12}; //todo:randomowa wartość z zakresu
    public static final int[] yearsOfProduction = {2018, 2019, 2020, 2021, 2022}; //todo: zwiekszyć zakres
    public static final int[] carsMileage = {777777, 888888, 999999}; //todo: random
    public static final Double[] powersEngine = {1.0, 1.2, 1.4, 1.6, 1.8, 2.0, 2.2, 2.4, 2.6, 3.0, 3.4, 4.0, 5.0}; //todo: silniki elektryczne?
}
