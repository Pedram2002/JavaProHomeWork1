package homeWork6;

import java.util.ArrayList;
import java.util.List;

public class HomeWork6 {
    /*
     * Домашнее задание: реализовать:
     * add(int index, int value)
     * addAll(int... values)
     * contains(int value)
     * indexOf(int value)
     * isEmpty()
     * clear()
     * size()
     */
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        System.out.println(intList);
        intList.add(8);
        intList.add(17);
        intList.add(5);
        System.out.println(intList);
        System.out.println(intList.get(1));
        intList.remove(2);
        System.out.println(intList);
        System.out.println("----- RubberArray");

        RubberArray rb = new RubberArray();
        System.out.println(rb);
        rb.add(8);
        rb.add(17);
        rb.add(5);
        rb.add(23);
        System.out.println(rb);
        rb.add(1999,1);
        rb.addAll(new int[] {1988,1985},1);
        rb.addAll(new int[] {44,21});

//        System.out.println(rb.get(1));
//        rb.remove(1);
//        System.out.println(rb);
//        rb.remove(0);
//        System.out.println(rb);
//        rb.remove(1);
//        System.out.println(rb);

    }
}
