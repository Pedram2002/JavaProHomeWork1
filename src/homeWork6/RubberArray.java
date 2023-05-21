package homeWork6;
/**
 *JavaPro Homework5
 *@autor Pedram Kalami
 *@20.05.2023
 **/
public class RubberArray {
    /*
     * Домашнее задание: реализовать:
     * add(int index, int value)+
     * addAll(int... values)++
     * contains(int value)+
     * indexOf(int value)+
     * isEmpty()+
     * clear()+
     * size()+
     */

    private int[] arrayMain;

    //region add methods

    /**
     * Добавляет элемент в конец массива.
     *
     * @param value Значение элемента, которое нужно добавить.
     */
    public void add(int value) {
        // Создание нового массива с размером, увеличенным на 1
        int[] newArray = new int[arrayMain.length + 1];

        // Копирование элементов из текущего массива в новый массив
        System.arraycopy(arrayMain, 0, newArray, 0, arrayMain.length);

        // Добавление нового элемента в конец нового массива
        newArray[arrayMain.length] = value;

        // Замена исходного массива на новый массив
        arrayMain = newArray;
    }

    /**
     * @param value значение элемента, который нужно добавить
     * @param index индекс, по которому нужно добавить элемент
     */
    public void add(int value, int index) {
        // Создание нового массива с размером, увеличенным на 1
        int[] newArray = new int[arrayMain.length + 1];

        // Копирование элементов до позиции index из исходного массива в новый массив
        System.arraycopy(arrayMain, 0, newArray, 0, index);

        // Добавление нового элемента value на позицию index в новом массиве
        newArray[index] = value;

        // Копирование оставшихся элементов из исходного массива в новый массив,
        // начиная с позиции index + 1
        System.arraycopy(arrayMain, index, newArray, index + 1, arrayMain.length - 1);

        // Замена исходного массива на новый массив
        arrayMain = newArray;
    }

    /**
     * Добавляет все элементы из массива value в конец текущего массива.
     *
     * @param value Массив значений, которые требуется добавить.
     */
    public void addAll(int[] value) {
        // Создание нового массива с учетом добавляемых элементов
        int[] newArray = new int[arrayMain.length + value.length];

        // Копирование элементов из текущего массива в новый массив
        System.arraycopy(arrayMain, 0, newArray, 0, arrayMain.length);

        // Копирование добавляемых элементов в конец нового массива
        System.arraycopy(value, 0, newArray, arrayMain.length, value.length);

        // Замена исходного массива на новый массив
        arrayMain = newArray;
    }

    /**
     * Добавляет элементы в массив по указанному индексу.
     *
     * @param value Массив значений, которые требуется добавить.
     * @param index Индекс, по которому требуется вставить значения.
     */
    public void addAll(int[] value, int index) {
        // Создание нового массива с учетом добавляемых элементов
        int[] newArray = new int[arrayMain.length + value.length];

        // Копирование элементов до указанного индекса
        System.arraycopy(arrayMain, 0, newArray, 0, index);

        // Копирование добавляемых элементов
        System.arraycopy(value, 0, newArray, index, value.length);

        // Копирование оставшихся элементов после указанного индекса
        System.arraycopy(arrayMain, index, newArray, index + value.length, arrayMain.length - index);

        // Замена исходного массива на новый массив
        arrayMain = newArray;
    }
    //endregion

    public RubberArray() {
        arrayMain = new int[0];
    }

    /**
     * Проверяет, содержится ли указанное значение в массиве.
     *
     * @param value Значение, которое нужно проверить.
     * @return {@code true}, если значение содержится в массиве, иначе {@code false}.
     */
    public boolean contains(int value) {
        for (int i : arrayMain) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Возвращает индекс первого вхождения указанного значения в массиве.
     *
     * @param value Значение, индекс которого нужно найти.
     * @return Индекс первого вхождения значения в массиве или -1, если значение не найдено.
     */
    public int indexOf(int value) {
        for (int i = 0; i < arrayMain.length; i++) {
            if (arrayMain[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Проверяет, является ли массив пустым.
     *
     * @return true, если массив пустой, false в противном случае.
     */
    public boolean isEmpty() {
        return arrayMain.length == 0;
    }

    /**
     * Очищает массив, удаляя все элементы.
     */
    public void clear() {
        arrayMain = new int[0];
    }

    public int size() {
        return arrayMain.length;
    }

    public int get(int index) {
        return arrayMain[index];
    }

    public void remove(int index) {
        int[] newArray = new int[arrayMain.length - 1];
        System.arraycopy(arrayMain, 0, newArray, 0, index);
        System.arraycopy(arrayMain, index + 1, newArray, index, arrayMain.length - index - 1);
        arrayMain = newArray;
    }

    @Override
    public String toString() {
        //Если вам не нужна Потокобезопасности(роботаем в однопоточной среде),
        //то нужно использовать StringBuilder
        //StringBuilder значительно быстрее
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arrayMain.length; i++) {
            sb.append(arrayMain[i]);
            if (i < arrayMain.length - 1) {
                sb.append(", ");
            }
        }
        return sb.append("]").toString();
    }
}
