package HomeWork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
public class HW3_3 {
    public static void main(String[] args) {
        List<String> planets = new ArrayList<>();
        planets.add("Меркурий");
        planets.add("Венера");
        planets.add("Земля");
        planets.add("Марс");
        planets.add("Юпитер");
        planets.add("Стурн");
        planets.add("Уран");
        planets.add("Нептун");
        planets.add("Плутон");

        List<String> randPlanets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int x = RandomGenerator.getDefault().nextInt(0,8);
            randPlanets.add(planets.get(x));
        }

        System.out.println(randPlanets);
        for (int i = 0; i < planets.size(); i++) {
            int count = Collections.frequency(randPlanets, planets.get(i));
            if (count != 0){
                System.out.printf("Планета %s встречается %d раз\n", planets.get(i), count);
            }
        }
    }
}
