package HomeWork_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.random.RandomGenerator;

// Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
// Вывести название каждой планеты и количество его повторений в списке. Collections.frequency(list, item)
public class HW3_3 {

    // Создаем пустой список, после наполняем его значениями через метод list.add
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

        // Создаем пустой список куда будем загонять строки из предыдущего списка planets
        List<String> randPlanets = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // Генерируем рандомно число от 0 до 8 (равное значению индекса списка planets)
            int x = RandomGenerator.getDefault().nextInt(0,8);
            // Если рандомно число равно индексу списка planets, то добавляем значение индекса в новый список randomPlanets
            randPlanets.add(planets.get(x));
        }

        // Выводим новый список с рандомными планетами в рандомном количестве
        System.out.println(randPlanets);

        // Пробигаемся по циклу и выводим количество только тех планет которые есть в новом списке
        for (int i = 0; i < planets.size(); i++) {
            int count = Collections.frequency(randPlanets, planets.get(i));
            if (count != 0){
                System.out.printf("Планета %s встречается %d раз\n", planets.get(i), count);
            }
        }
    }
}
