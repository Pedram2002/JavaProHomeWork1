package homeWork15;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HomeWork15 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("a1", "b5", "a2", "b4");
        String smallestElement = list1.stream().min(Comparator.naturalOrder()).orElse(null);


        List<Integer> list2 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Integer> oddNumbers = list2.stream().filter(number -> number % 2 != 0).toList();



        List<Integer> list3 = Arrays.asList(1, 12, 3, 10, 12, 17);
        List<Integer> increase = list3.stream().map(number -> (int) (number * 1.2)).toList();


        List<String> list4 = Arrays.asList("BigBen", "BigBob", "Big", "Ben", "Big Bob");
        long count = list4.stream().filter(element -> element.contains("Big")).count();


        List<String> list5 = Arrays.asList("a1", "b5", "c1", "a2", "b4", "c1", "a1");
        List<String> sortedList = list5.stream().sorted(Comparator.reverseOrder()).distinct().toList();

    }


}
