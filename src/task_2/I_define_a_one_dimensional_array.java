package task_2;
import java.util.Random;

/**
 * Первый раздел, седьмой вариант
 */

public class I_define_a_one_dimensional_array {

    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayWithRandomValues(array);

        System.out.println("Оригинальный массив:");
        printArray(array);

        double[] reciprocalArray = createReciprocalFraction(array);

        System.out.println("Взаимный массив:");
        printArray(reciprocalArray);

        reverseArray(array);

        System.out.println("Перевернутый оригинальный массив:");
        printArray(array);
    }

    public static void fillArrayWithRandomValues(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199) - 99;
        }
    }

    public static double[] createReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                reciprocalArray[i] = Double.NaN;
                System.out.println("Ошибка: Деление на ноль по индексу " + i);
            }
        }
        return reciprocalArray;
    }

    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }
}
