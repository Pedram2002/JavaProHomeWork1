package Algaritm;

public class Lessen8 {
    //1- Идея алгоритма быстрой сортировки (Quicksort) заключается в следующем:

    //    Выбирается опорный элемент из массива.
    //    Массив разбивается на две части: элементы, меньшие опорного, и элементы, большие опорного.
    //    Рекурсивно применяется алгоритм быстрой сортировки к каждой из двух частей.


    //2- Какая асимптотическая сложность алгоритма быстрой сортировки? O(n log n)

    //3- Алгоритм быстрой сортировки не является устойчивым алгоритмом, что означает,
    //    что порядок равных элементов может быть изменен в результате сортировки.

    // 4-
    //    Метод выбора опорного элемента
    //    Метод разбиения массива на две части вокруг опорного элемента.
    //    Рекурсивный метод для применения алгоритма быстрой сортировки к каждой из двух частей.
    //    Асимптотическая сложность по времени в среднем случае составляет O(n log n),
    //    а по памяти требуется O(log n) для рекурсивных вызовов стека.

    // 5-
    //    boolean[] v1 = {true, true, true, true, true, false, false};
    //        System.out.println(firstFailedProgramVersion(versions1));
    public static int firstFailedProgramVersion(boolean[] sv) {
        int left = 0;
        int right = sv.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (sv[mid]) {

                left = mid + 1;
            } else {

                if (mid == 0 || sv[mid - 1]) {

                    return mid;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }

    //-6
    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] merged = new int[len1 + len2];
        int i = 0, j = 0, k = 0;

        while (i < len1 && j < len2) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        while (i < len1) {
            merged[k++] = arr1[i++];
        }

        while (j < len2) {
            merged[k++] = arr2[j++];
        }

        return merged;
    }
    //7-
    //   1- Выбрать опорный элемент из массива.
    //
    //   2- Разбить массив на две части: элементы, меньшие опорного, и элементы,
    //    большие опорного.
    //    Это можно сделать путем перемещения элефентов таким образом, чтобы все элементы меньше опорного находились перед ним,
    //    а все элементы больше опорного - после него.
    //
    //    3- Рекурсимно применить алгоритм быстрой сортировки к обцим частям массива,
    //    пока размер частей не станет равным 1 или 0
    //
    //    4- Объединить отсортированные части массива в один отсортированный массив.

    //8-
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;

        while (left < right) {

            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }

//    Асимптотическая сложность  O(n),
//    Асимптотическая сложность по памяти  O(1)


     //9-
    public void moveZeroes(int[] nums) {
        int left = 0;


        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {

                nums[left] = nums[i];
                left++;
            }
        }


        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

//10
    public static int findPeakElement(int[] nums) {
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] >= nums[i - 1] && nums[i] >= nums[i + 1]) {
                return nums[i];
            }
        }
        // если только одно сравн.
        if (nums[0] >= nums[1]) {
            return nums[0];
        }
        if (nums[nums.length - 1] >= nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }
        return -1; // если пиковый элемент не найден
    }

    //11

    public static int findPeakElement(int[][] matrix) {
        int rows = matrix.length;

        int left = 0;
        int right = rows - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            int maxIndex = findMaxI(matrix[mid]);

            if (matrix[mid][maxIndex] < matrix[mid + 1][maxIndex]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        int maxIndex = findMaxI(matrix[left]);
        return matrix[left][maxIndex];
    }

    private static int findMaxI(int[] row) {
        int maxIndex = 0;
        int maxVal = Integer.MIN_VALUE;

        for (int i = 0; i < row.length; i++) {
            if (row[i] > maxVal) {
                maxVal = row[i];
                maxIndex = i;
            }
        }

        return maxIndex;
    }

}
