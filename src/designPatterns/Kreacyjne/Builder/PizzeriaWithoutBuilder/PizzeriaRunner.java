package designPatterns.Kreacyjne.Builder.PizzeriaWithoutBuilder;

import java.util.Map;
import java.util.Scanner;

public class PizzeriaRunner {

    /**
     * sprzedajemy pepperoni i capriciosa
     * kazda pizza ciasto, pepperoni ma zawsze ciasto grube a capriciosa cienkie
     * kadza pizza ma skladniki:
     * - capriciosa: ser, szynka, pieczarki
     * - pepperoni: ser, salami pomidor
     * - sosy  - pepperoni zawsze z sosem ostrym
     * - capriciosa zawsze z sosem mieszanym
     * Klient wybiera pizze a my mowimy jakie skladniki
     * @param args
     */

    public static void main(String[] args) {
        PizzeriaService pizzeriaService = new PizzeriaService();
        Map<Integer,Pizza> pizzaCollection = pizzeriaService.getPizzaCollection();
        Scanner scanner = new Scanner(System.in);
        String myChoice = "";


        while (true) {
            pizzeriaService.showPizzaCollection();

            System.out.print("Wybierz numer pizzy: ");
            myChoice = scanner.nextLine();
            if (Integer.valueOf(myChoice)>0 && Integer.valueOf(myChoice)<=pizzaCollection.size()) {
                System.out.print("Wybrana pizza to: " + pizzaCollection.get(Integer.valueOf(myChoice)).getName());
                System.out.println(", Składniki to: " + pizzaCollection.get(Integer.valueOf(myChoice)).getIngrendients());
                System.out.println("-------------------");
            } else if (Integer.valueOf(myChoice)==0) {
                System.out.println("Good Bye!");
                break;
            } else {
                System.out.print("Zły wybrałeś zły numer pizzy");
            }

        }
    }

}
