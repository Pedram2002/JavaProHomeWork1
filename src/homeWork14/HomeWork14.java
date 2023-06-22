package homeWork14;

import java.util.Scanner;
import java.util.Stack;

public class HomeWork14 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        String word1 = scanner.nextLine();
//        Stack<Character> firstWord = new Stack();
//        putStringToStack(firstWord, word1);
//
//        String word2 = scanner.nextLine();
//        System.out.println(checkReverse(firstWord, word2));

        SmartHomeController controller = new SmartHomeController();

        // Пример добавления событий в очередь
        Event event1 = new Event("bla bla 1", Priority.NORMAL);
        Event event2 = new Event("bla bla 2", Priority.EMERGENCY);
        Event event3 = new Event("bla bla 3", Priority.NORMAL);
        Event event4 = new Event("bla bla 4", Priority.EMERGENCY);

        controller.addEvent(event1);
        controller.addEvent(event2);
        controller.addEvent(event3);
        controller.addEvent(event4);

        // Запуск обработки событий
        controller.startProcessing();

    }

    public static void putStringToStack(Stack<Character> stack, String word) {
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }
    }
    public static boolean checkReverse(Stack<Character> stack, String word) {
        for (int i = 0; i < word.length(); i++) {
            if (stack.isEmpty() || word.charAt(i) != stack.pop()) {
                return false; // Символы не совпадают
            }
        }
        return true;
    }
}
