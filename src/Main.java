import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Drinks drink = new Drinks();
        System.out.println("Зробіть Ваше замовлення. Введіть tea, або coffee, або lemonade, або mohito, або mineral water, або coca cola. Для завершення замовлення введіть nothing.");
        Scanner sc = new Scanner(System.in);
        String drinksChoice = "";
        double totalPrice = 0;
        int count = 0;

        while (!drinksChoice.equalsIgnoreCase("NOTHING")) {
            drinksChoice = sc.next();
            drinksChoice = drinksChoice.toUpperCase();


            switch (drinksChoice) {
                case "COFFEE":
                    drink.coffee();
                    totalPrice = totalPrice + Drinks.COFFEE;
                    count++;
                    break;
                case "TEA":
                    drink.tea();
                    totalPrice = totalPrice + Drinks.TEA;
                    count++;
                    break;
                case "LEMONADE":
                    drink.lemonade();
                    totalPrice = totalPrice + Drinks.LEMONADE;
                    count++;
                    break;
                case "MOHITO":
                    drink.mohito();
                    totalPrice = totalPrice + Drinks.MOHITO;
                    count++;
                    break;
                case "MINERALWATER":
                    drink.mineralWater();
                    totalPrice = totalPrice + Drinks.MINERALWATER;
                    count++;
                    break;
                case "COCACOLA":
                    drink.cocaCola();
                    totalPrice = totalPrice + Drinks.COCACOLA;
                    count++;
                    break;
            }
        }
        System.out.println("Ви замовили " + count + " напої. Ви маєте заплатити " + totalPrice);
    }
}