import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringArrays = new ArrayList<>();
       pop(stringArrays);
        System.out.println(stringArrays);

    }
    public static void pop(ArrayList<String> stringArrays) {
        stringArrays.add("dfgdg");
    }
    public static void pop(AtomicInteger i) {
        i.set(99);
    }
    public static int getNumberCount(int[] arr, int x) {
        System.out.println(searchLeft(x, arr, 0, arr.length));
        System.out.println(searchRight(x, arr, 0, arr.length));

        return -1;
    }

    public static int searchLeft(int number, int[] array, int from, int to) {
        if (to <= from) {
            return number == array[from] ? from : -1;
        }
        int middle = (from + to) / 2;

        if (array[middle] < number) {
            return searchLeft(number, array, middle + 1, to);
        } else {
            return searchLeft(number, array, from, middle);
        }
    }

    public static int searchRight(int number, int[] array, int from, int to) {
        if (to <= from) {
            return number == array[to] ? to : -1;
        }
        int middle = (from + to) / 2;

        if (array[middle] <= number) {
            return searchRight(number, array, middle + 1, to);
        } else {
            return searchRight(number, array, from, middle - 1);
        }
    }


    public static void quickSort(int[] array, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(array, left, right);
            quickSort(array, left, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, right);
        }
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, right);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}

