package task_1.independent_work;

/**
 * Самостоятельная работа, третье задание
 */

public class SumCalculator {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } catch (NumberFormatException e) {
                System.out.println("Оба параметра должны быть целыми числами.");
            }
        } else {
            System.out.println("Неверное количество параметров.");
        }
    }
}

