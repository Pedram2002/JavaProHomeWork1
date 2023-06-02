package Algaritm;

public class HomeworkTwo {
    /*
    1- Рекурсия - это процесс, при котором функция вызывает саму себя в своем теле.
    2- Стек - это структура данных, в которой элементы добавляются и удаляются с одного конца, называемого вершиной стека
    3-
       Прямая (или простая) рекурсия: функция вызывает саму себя непосредственно.
       Косвенная (или сложная) рекурсия: функция вызывает другую функцию, которая затем вызывает первую функцию или саму себя.
    4-

    */

    /**
     * Вычисляет наибольший общий делитель (НОД) двух чисел.
     *
     * @param a Первое число.
     * @param b Второе число.
     * @return НОД двух чисел.
     */
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            if (a == b) return a;
        }
        return a;
    }
    public static int gcdR(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcdR(b, a % b);
    }
    public static int gcdR1(int a, int b) {
        if (a > b) {
            a = a - b;
        } else {
            b = b - a;
        }
        if (a == b) return a;

        return gcdR1(a, b);
    }

    public static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }


            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int position = array[i];
            int j = i - 1;


            while (j >= 0 && array[j] > position) {
                array[j + 1] = array[j];
                j--;
            }


            array[j + 1] = position;
        }
    }
    public static void main(String[] args) {
        int a = 5648;
        int b = 79548;
        System.out.println(gcd(a, b));
        System.out.println(gcdR(a, b));
        System.out.println(gcdR1(a, b));
    }
}
