package task_1;

/**
 * Первый раздел, седьмой вариант
 */

public class I_variables {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Ошибка: необходимо передать два числа в качестве аргументов.");
            return;
        }

        try {
            double x = Double.parseDouble(args[0]);
            double y = Double.parseDouble(args[1]);

            double max = Math.max(x, y);

            double result = Math.pow(max, 2);

            System.out.println("Большее число: " + max);
            System.out.println("Его квадрат: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Ошибка: оба аргумента должны быть числами.");
        }
    }
}

