package homeWork9;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculate2 {

    public static void calculator() {
        ArrayList<String> myList = new ArrayList<>();
        wordIntroduction(myList);
    }

    private static void wordIntroduction(ArrayList<String> myList) {
        Scanner scanner = new Scanner(System.in);
        String str;
        while (true) {
            str = scanner.nextLine();
            if (str.equals("=")) {
                break;
            } else if (isNumeric(str)) {
                myList.add(str);
            } else if ("+-/*".contains(str)) {
                myList.add(str);
            }
        }
    }

    private static Double calculateAll(ArrayList<String> myList) {
        double result = 0.0;
        double tempInt = 0.0;
        for (String operator : myList) {
            switch (operator) {
                case "+" -> result += tempInt;
                case "-" -> result -= tempInt;
                case "*" -> result *= tempInt;
                case "/" -> result /= tempInt;
                default -> tempInt = Double.parseDouble(operator);
            }
        }
        return  result;
    }

    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
