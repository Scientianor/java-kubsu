package task_2.independent_work;

import java.util.Arrays;
import java.util.Random;

/**
 * Самостоятельная работа
 */

public class RandomVector {
    public static void main(String[] args) {
        int vectorSize = 30;
        int minValue = 100;
        int maxValue = 200;

        int[] vector = fillRandomIntVector(vectorSize, minValue, maxValue);

        printVector(vector, "Начальный вектор:");

        Arrays.sort(vector);

        printVector(vector, "Сортированный вектор:");
    }

    /**
     * Метод для заполнения вектора случайными целыми числами.
     *
     * @param size Размер вектора
     * @param min Минимальное значение элемента
     * @param max Максимальное значение элемента
     * @return Заполненный вектор
     */

    public static int[] fillRandomIntVector(int size, int min, int max) {
        Random random = new Random();
        int[] vector = new int[size];
        for (int i = 0; i < size; i++) {
            vector[i] = random.nextInt(max - min + 1) + min;
        }
        return vector;
    }

    /**
     * Метод для вывода вектора с сообщением.
     *
     * @param vector Вектор для вывода
     * @param message Сообщение перед выводом
     */

    public static void printVector(int[] vector, String message) {
        System.out.println(message);
        for (int value : vector) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}

