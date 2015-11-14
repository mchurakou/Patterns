package creational.builder;

/**
 * Created by mikalai on 10.11.2015.
 */
public class Run {
    public static void main(String[] args) {
        NutritionFacts cocaCola = (new NutritionFacts.Builder(240, 8)).calories(100).sodium(35).carbohydrate(27).build();

        System.out.println(cocaCola);
    }
}
