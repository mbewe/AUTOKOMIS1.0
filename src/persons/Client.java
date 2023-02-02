package persons;

import java.util.Random;
import vehicles.*;

public class Client extends Person{
    public String requirement;
    public String[] names = {"Wojciech", "Kacper", "Brajan"};
    public int[] moneys = {1200, 2000, 3000, 2700, 5000, 7500, 13500, 17000, 20000, 30000, 45000, 60000, 100000, 150000};
    public String[] requirements = {"Marka", "Model", "Kolor", "Typ nadwozia", "Rodzaj paliwa", "Cena", "Rok produkcji", "Przebieg", "Pojemność silnika"};

    private static Random random = new Random();
    public Client() {

        this.name = names[random.nextInt(names.length)];
        this.money = moneys[random.nextInt(moneys.length)];
        this.requirement = requirements[random.nextInt(requirements.length)];


    }
}
