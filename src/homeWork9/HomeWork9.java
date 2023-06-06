package homeWork9;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите слова (для завершения введите 'stop'):");

        String str;
        while (true) {
            str = scanner.nextLine();
            if (str.equals("stop")) {
                break;
            }
            myList.add(str.toUpperCase());
        }

        ArrayList<String> myListCopy = new ArrayList<>();
        for (String word : myList) {
            if (word.length() % 2 == 0) {
                myListCopy.add(word);
            }
        }


        StringBuilder stringBuilder = new StringBuilder();
        for (String word : myListCopy) {
            stringBuilder.append(word);
        }

        System.out.println("Конкатенация: " + stringBuilder);
    }

}
