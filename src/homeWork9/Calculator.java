package homeWork9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        List<String> expression = readExpression();
        System.out.println("Арифметическое выражение: " + expression);

        double result = evaluateExpression(expression);
        System.out.println("Результат: " + result);
    }

    public static List<String> readExpression() {
        List<String> expression = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите число или символ '=' для завершения: ");
            String input = scanner.next();


            if (input.equals("=")) {
                break;
            }

            expression.add(input);

            System.out.print("Введите (+, -, *, /): ");
            input = scanner.next();
            expression.add(input);
        }

        return expression;
    }

    public static double evaluateExpression(List<String> expression) {
        double result = Double.parseDouble(expression.get(0));

        for (int i = 1; i < expression.size(); i += 2) {
            String operator = expression.get(i);
            double operand = Double.parseDouble(expression.get(i + 1));

            switch (operator) {
                case "+" -> result += operand;
                case "-" -> result -= operand;
                case "*" -> result *= operand;
                case "/" -> result /= operand;
                default -> System.out.println("Некорректный оператор: " + operator);
            }
        }

        return result;
    }
}
