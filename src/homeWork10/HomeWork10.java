package homeWork10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HomeWork10 {
    public static void main(String[] args) {
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(1);
//        integers.add(2);
//        integers.add(-3);
//        integers.add(4);
//        integers.add(5);
//        integers.add(6);
//        integers.add(7);
//        integers.add(8);
//        integers.add(9);
//
//        sumSearch(integers, 6);
//
//        System.out.println(deleteFromXToY(integers, 1, 8));



        ArrayList<Integer> integers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 0));
        ArrayList<Integer> integers2 = new ArrayList<>(Arrays.asList(5, 1, 2, 7, 3, 2));
        System.out.println(intersection(integers1, integers2));
    }

    public ArrayList<String> revrsText(String str) {
        ArrayList<String> newArray = new ArrayList<>();
        for (String s : str.split(" ")) {
            newArray.add(0, s);
        }
        return newArray;
    }

    public static ArrayList<Integer> deleteFromXToY(ArrayList<Integer> arrayList, int x, int y) {
        //Вариант короткий
        // arrayList.removeIf(element -> element > x && element < y);

        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element >= x && element <= y) {
                iterator.remove();
            }
        }

        return arrayList;
    }

    public static void bubbleSort(ArrayList<Integer> numbers) {
        int n = numbers.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers.get(j) > numbers.get(j + 1)) {
                    int temp = numbers.get(j);
                    numbers.set(j, numbers.get(j + 1));
                    numbers.set(j + 1, temp);
                }
            }
        }
    }

    public static void sumSearch(ArrayList<Integer> numbers, int target) {
        for (int i = 0; i < numbers.size(); i++) {
            int nextIndex = i;
            int sum = numbers.get(i);

            while (true) {
                if (sum == target) {
                    String massage = "Range(" + i + ", " + nextIndex + ") ";
                    System.out.println(massage);
                    return;
                } else if (sum > target) {
                    break;
                }
                if (nextIndex + 1 > numbers.size()) break;
                nextIndex++;
                sum += numbers.get(nextIndex);
            }


        }


    }

    //Даны два списка с числовыми значеними: [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2]. Нужно вернуть пересечение их множеств, с повторением элементов [1, 2, 2, 3]
    public static ArrayList<Integer> intersection(ArrayList<Integer> numbers1, ArrayList<Integer> numbers2) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i : numbers1) {
            int index = numbers2.indexOf(i);
            if (index > -1) {//ura we found it
                result.add(i);
                numbers2.remove(index);
            }
        }
        return result;
    }
}
