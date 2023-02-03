package persons;

import java.util.Random;
import vehicles.*;

public class Client extends Person implements Parameters{
    public String requirementName;
    public String requirementValue;
    public String[] names = {"Wojciech", "Kacper", "Brajan"};
    public int[] moneys = {1200, 2000, 3000, 2700, 5000, 7500, 13500, 17000, 20000, 30000, 45000, 60000, 100000, 150000};

    private static final Random random = new Random();
    public Client() {

        this.name = names[random.nextInt(names.length)];
        money = moneys[random.nextInt(moneys.length)];

        String[] requirements = {"Marka", "Model", "Kolor", "Typ nadwozia", "Rodzaj paliwa", "Cena", "Rok produkcji", "Przebieg", "Pojemność silnika"};
        this.requirementName = requirements[random.nextInt(requirements.length)];

        if (this.requirementName.equals(requirements[0])) {
            this.requirementValue = producers[random.nextInt(producers.length)];
        } else if (this.requirementName.equals(requirements[1])) {
            this.requirementValue = models[random.nextInt(models.length)];
        } else if (this.requirementName.equals(requirements[2])) {
            this.requirementValue = colors[random.nextInt(colors.length)];
        } else if (this.requirementName.equals(requirements[3])) {
            this.requirementValue = bodyTypes[random.nextInt(bodyTypes.length)];
        } else if (this.requirementName.equals(requirements[4])) {
            this.requirementValue = typesOfFuel[random.nextInt(typesOfFuel.length)];
        } else if (this.requirementName.equals(requirements[5])) {
            this.requirementValue = String.valueOf(values[random.nextInt(values.length)]);
        } else if (this.requirementName.equals(requirements[6])) {
            this.requirementValue = String.valueOf(yearsOfProduction[random.nextInt(yearsOfProduction.length)]);
        } else if (this.requirementName.equals(requirements[7])) {
            this.requirementValue = String.valueOf(carsMileage[random.nextInt(carsMileage.length)]);
        } else if (this.requirementName.equals(requirements[8])) {
            this.requirementValue = String.valueOf(powersEngine[random.nextInt(powersEngine.length)]);
        }
    }

    public String toString() {
        return "Klient: " + this.name + "\nBudżet: " + money + "\nWymaganie dotyczące " + this.requirementName + " " +  this.requirementValue;
    }

    }

