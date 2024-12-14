package task_1.independent_work;

/**
 * Самостоятельная работа, второе задание
 */

public class ParameterCount {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Вы ввели " + args.length + " параметров.");
        } else {
            System.out.println("Вы не передавали параметров.");
        }
    }
}
