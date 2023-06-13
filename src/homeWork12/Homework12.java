package homeWork12;


import java.util.*;

public class Homework12 {
    public static void main(String[] args) {
        LinkedList<Integer> linkedListEnd = new LinkedList<>();
        LinkedList<Integer> linkedListMiddle = new LinkedList<>();

        ArrayList<Integer> ArrayListEnd = new ArrayList<>();
        ArrayList<Integer> ArrayListMiddle = new ArrayList<>();

        int i = 10000;
        //~~~~~~~~~~~~~First
        System.out.println(addValuesToEnd(linkedListEnd, i));
        System.out.println(addValuesToEndArray(ArrayListEnd, i));
        //~~~~~~~~~~~~~Second
        System.out.println(insertValuesInMiddle(linkedListMiddle, i));
        System.out.println(insertValuesInMiddleArray(ArrayListMiddle, i));
        //~~~~~~~~~~~~~Third
        System.out.println(getValuesFromRandomPositions(linkedListMiddle, i));
        System.out.println(getValuesFromRandomPositionsArray(ArrayListMiddle, i));
        //~~~~~~~~~~~~~Fourth
        System.out.println(removeValuesFromEnd(linkedListEnd, i));
        System.out.println(removeValuesFromEndArray(ArrayListEnd, i));
        //~~~~~~~~~~~~~Fifth
        System.out.println(removeValuesFromMiddle(linkedListMiddle, i));
        System.out.println(removeValuesFromMiddleArray(ArrayListMiddle, i));


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


    public static String addValuesToEndArray(ArrayList<Integer> list, int count) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i < count; i++) {
            list.add(list.size(), (int) (Math.random() * 100));
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
