package task_1;

/**
 * Второй раздел, седьмой вариант
 */

public class II_complex_mathematical_functions {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                double max = Math.max(a, b);
                double min = Math.min(a, b);

                double numerator = 5 * max - 4 * min;
                double denominator = 8.3 + (max / min);

                double d = numerator / denominator;

                System.out.println("Результат d: " + d);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: введите два числа в качестве параметров.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль.");
            }
        } else {
            System.out.println("Ошибка: программа ожидает ровно два параметра.");
        }
    }
}
