package homeWork12;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//Выход при миллион int
//        add Values To End: 150
//        add Values To End Array: 21
//        insert Values In Middle: 109
//        insert Values In Middle Array: 39884
//        get Values From Random Positions: 468418
//        get Values From Random Positions Array: 17
//        remove Values From End: 11
//        remove Values From End Array: 8
//        remove Values From Middle: 18
//        remove Values From Middle Array: 34252

//Операция добавления 10000 случайных значений в LinkedList заняла 264 мс
//        Операция добавления 10000 случайных значений в ArrayList заняла 30 мс
//        Операция вставки 10000 случайных значений в середину списка в LinkedList заняла 26 мс
//        Операция вставки 10000 случайных значений в середину списка в ArrayList заняла 32 мс
//        Операция получения 10000 случайных значений из середины списка в LinkedList заняла 362 мс
//        Операция получения 10000 случайных значений из середины списка в ArrayList заняла 3 мс
//        Операция удаления 10000 элементов из конца списка в LinkedList заняла 2 мс
//        Операция удаления 10000 элементов из конца списка в ArrayList заняла 2 мс
public class Homework12 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListEnd = new LinkedList<>();
        LinkedList<Integer> linkedListMiddle = new LinkedList<>();
        HashSet<Integer> hashSet = new HashSet<Integer>();
        TreeSet<Integer> treeSet = new TreeSet<>();

        ArrayList<Integer> ArrayListEnd = new ArrayList<>();
        ArrayList<Integer> ArrayListMiddle = new ArrayList<>();

        int i = 1000000;
        //~~~~~~~~~~~~~First
        System.out.println(addValuesToEnd(linkedListEnd, i));
        System.out.println(addValuesToEndArray(ArrayListEnd, i));
        System.out.println(addValuesToHashSet(hashSet, i));
        System.out.println(addValuesToEndTreeSet(treeSet, i));


//        //~~~~~~~~~~~~~Second
//        System.out.println(insertValuesInMiddle(linkedListMiddle, i));
//        System.out.println(insertValuesInMiddleArray(ArrayListMiddle, i));
//        //~~~~~~~~~~~~~Third
//        System.out.println(getValuesFromRandomPositions(linkedListMiddle, i));
//        System.out.println(getValuesFromRandomPositionsArray(ArrayListMiddle, i));
//        //~~~~~~~~~~~~~Fourth
//        System.out.println(removeValuesFromEnd(linkedListEnd, i));
//        System.out.println(removeValuesFromEndArray(ArrayListEnd, i));
//        System.out.println(removeValuesFromEndHashSet(hashSet, i));
//
//        //~~~~~~~~~~~~~Fifth
//        System.out.println(removeValuesFromMiddle(linkedListMiddle, i));
//        System.out.println(removeValuesFromMiddleArray(ArrayListMiddle, i));
//       // System.out.println(removeValuesFromMiddleHashSet(hashSet, i));

        String str = "G:\\Germany language\\Allready\\Dictionary EN-FA\\English_Farsi_Advanced.txt2";
        ArrayList<String> fileLines = loadFile(str);
        HashSet<String> loadFileHashSet = loadFileHashSet(str);
        TreeSet<String> TreeSet = loadFileTreeSet(str);


    }

    public static ArrayList<String> loadFile(String filePath) {
        long startTime = System.currentTimeMillis();
        ArrayList<String> lines = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(lines);

        System.out.println(("add " + lines.size()  +" From File to Array: " + (System.currentTimeMillis() - startTime) / 1000.0 )+ "c");
        return lines;
    }

    public static HashSet<String> loadFileHashSet(String filePath) {
        long startTime = System.currentTimeMillis();
        HashSet<String> lines = new HashSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(("add " + lines.size()  +" From File to HashSet: " + (System.currentTimeMillis() - startTime) / 1000.0 )+ "c");

        return lines;
    }

    public static TreeSet<String> loadFileTreeSet(String filePath) {
        long startTime = System.currentTimeMillis();
        TreeSet<String> lines = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(("add " + lines.size()  +" From File to TreeSet: " + (System.currentTimeMillis() - startTime) / 1000.0 )+ "c");

        return lines;
    }

    public static void loadDic(ArrayList<String> arrayList, java.io.InputStream isr) {
        if (arrayList.size() > 1) {
            return;
        }
        BufferedReader r = new BufferedReader(new InputStreamReader(isr));
        String line;

        try {
            while ((line = r.readLine()) != null) {
                arrayList.add(line);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static String addValuesToEndTreeSet(TreeSet<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add((int) (Math.random() * count));
        }
        return "add Values To TreeSet: " + (System.currentTimeMillis() - startTime);
    }

    public void flowers() {
        HashSet<String> rainbowFlowers = new HashSet<>();

        rainbowFlowers.add("Роза");
        rainbowFlowers.add("Нарцисс");
        rainbowFlowers.add("Лилия");
        rainbowFlowers.add("Ирис");
        rainbowFlowers.add("Гиацинт");
        rainbowFlowers.add("Орхидея");
        rainbowFlowers.add("Астра");
        System.out.println(rainbowFlowers);
    }

    public static String addValuesToEnd(LinkedList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.addLast((int) (Math.random() * 100));
        }
        return "add Values To End: " + (System.currentTimeMillis() - startTime);
    }

    public static String insertValuesInMiddle(LinkedList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            if (list.size() == 0) {
                list.add((int) (Math.random() * 100));
            } else {
                list.add(1, (int) (Math.random() * 100));
            }

        }
        return "insert Values In Middle: " + (System.currentTimeMillis() - startTime);
    }

    public static String getValuesFromRandomPositions(LinkedList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Integer value = list.get((int) (Math.random() * list.size()));
        }
        return "get Values From Random Positions: " + (System.currentTimeMillis() - startTime);
    }

    public static String removeValuesFromEnd(LinkedList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> intt = list.iterator();

        while (intt.hasNext()) {
            list.removeLast();
        }
        return "remove Values From End: " + (System.currentTimeMillis() - startTime);
    }

    public static String removeValuesFromMiddle(LinkedList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> intt = list.iterator();

        while (intt.hasNext()) {
            if (list.size() == 1) {
                list.removeFirst();
            } else {
                list.remove(1);
            }

        }
        return "remove Values From Middle: " + (System.currentTimeMillis() - startTime);
    }

    //~~~~~~~~~~~~~~~~~~~~~~~HashSet
    public static String addValuesToHashSet(HashSet<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return "add Values To End HashSet: " + (System.currentTimeMillis() - startTime);
    }

    public static String removeValuesFromEndHashSet(HashSet<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
//        Iterator<Integer> inttIterator = list.iterator();
//
//        while (inttIterator.hasNext()) {
//            inttIterator.remove();
//        }
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer flower = it.next();
            //System.out.println(flower);
            it.remove();

        }
        return "remove Values From End HashSet: " + (System.currentTimeMillis() - startTime);
    }


//~~~~~~~~~~~~~~~~~~~~~~~HashSet

    public static String addValuesToEndArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(i);
        }
        return "add Values To End Array: " + (System.currentTimeMillis() - startTime);
    }

    public static String insertValuesInMiddleArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            if (list.size() == 0) {
                list.add((int) (Math.random() * 100));
            } else {
                list.add(1, (int) (Math.random() * 100));
            }

        }
        return "insert Values In Middle Array: " + (System.currentTimeMillis() - startTime);
    }

    public static String getValuesFromRandomPositionsArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            Integer value = list.get((int) (Math.random() * list.size()));
        }
        return "get Values From Random Positions Array: " + (System.currentTimeMillis() - startTime);
    }

    public static String removeValuesFromEndArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> intt = list.iterator();

        while (intt.hasNext()) {
            list.remove(list.size() - 1);
        }
        return "remove Values From End Array: " + (System.currentTimeMillis() - startTime);
    }

    public static String removeValuesFromMiddleArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();
        Iterator<Integer> intt = list.iterator();

        while (intt.hasNext()) {
            if (list.size() == 1) {
                list.remove(0);
            } else {
                list.remove(1);
            }

        }
        return "remove Values From Middle Array: " + (System.currentTimeMillis() - startTime);
    }
}
