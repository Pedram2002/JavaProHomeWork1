package homeWork8;

import java.util.Comparator;

public class CarClass {
    int price;
    int power;
    static class SortByPrice implements Comparator<CarClass> {

        @Override
        public int compare(CarClass o1, CarClass o2) {
            return o1.price - o2.price;
        }
    }
    static class SortByPower implements Comparator<CarClass> {
        @Override
        public int compare(CarClass o1, CarClass o2) {
            return o1.power - o2.power;
        }
    }
}
