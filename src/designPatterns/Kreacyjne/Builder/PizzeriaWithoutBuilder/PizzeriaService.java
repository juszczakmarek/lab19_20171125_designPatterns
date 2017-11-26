package designPatterns.Kreacyjne.Builder.PizzeriaWithoutBuilder;

import java.util.HashMap;
import java.util.Map;

public class PizzeriaService {

    private Map<Integer,Pizza> pizzaCollection;

    public PizzeriaService() {
        this.pizzaCollection = createPizzaList();
    }

    private Map<Integer,Pizza> createPizzaList() {

        Map<Integer,Pizza> localPizzaCollection = new HashMap<>();

        localPizzaCollection.put(1,new Pepperoni("Pepperoni","ser, salami pomidor","sos ostry","ciasto grube"));
        localPizzaCollection.put(2,new Capriciosa("Capriciosa","ser, szynka, pieczarki","sos mieszany","ciasto cienkie"));

        return localPizzaCollection;
    }

    public void showPizzaCollection() {
        for (Map.Entry<Integer, Pizza> entry : pizzaCollection.entrySet()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(entry.getKey());
            stringBuilder.append("] ");
            stringBuilder.append(entry.getValue().getName());
            System.out.println(stringBuilder.toString());
        }
    }

    public Map<Integer,Pizza> getPizzaCollection() {
        return this.pizzaCollection;
    }
}
