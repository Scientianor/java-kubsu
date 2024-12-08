package task_1;

/**
 * Третий раздел, седьмой вариант
 */

public class III_logical_branching {
    public static void main(String[] args) {
        if (args.length == 4) {
            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);
                double x = Double.parseDouble(args[2]);
                double y, f;

                if (x <= 0) {
                    y = (a - Math.pow(b, x + 1));
                    f = Math.exp(Math.tan(a * x + 1));
                } else if (x > 0 && x <= 3) {
                    y = 1 / (1 + Math.pow(3, x));
                    f = Math.pow(x, a) - Math.pow(Math.sin(b), x);
                } else {
                    y = 1 / Math.tan(a * x + 1);
                    f = Math.sqrt(x) / Math.pow(b, 2);
                }

                System.out.println("Y: " + y);
                System.out.println("F: " + f);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: все параметры должны быть числами.");
            }
        } else {
            System.out.println("Ошибка: программа ожидает четыре параметра.");
        }
    }
}