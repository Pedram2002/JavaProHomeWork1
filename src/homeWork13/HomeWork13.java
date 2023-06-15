package homeWork13;

import java.util.Collections;
import java.util.HashSet;

public class HomeWork13 {
    ///Задание 1
    public static int countUniWords(String text) {
        String[] words = text.toLowerCase().split(" ");
        HashSet<String> uniqueWords = new HashSet<>();
        Collections.addAll(uniqueWords, words);
        return uniqueWords.size();
    }

    public static void main(String[] args) {
        HashSet<Car> carSet = new HashSet<>();


        carSet.add(new Car("ABC123", "PedramMotors", 150, 50.0));
        carSet.add(new Car("ABC123", "PedramMotors", 150, 50.0));
        carSet.add(new Car("ABC123", "PedramMotors", 150, 50.0));
        carSet.add(new Car("DEF456", "BMW", 200, 100.0));
        carSet.add(new Car("GHI789", "Merc", 180, 80.0));
        carSet.add(new Car("JKL012", "Audi", 170, 70.0));


        for (Car car : carSet) {
            System.out.println(car);
        }
    }

}
