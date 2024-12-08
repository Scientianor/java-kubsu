package task_2;
import java.util.Random;
import java.util.Scanner;

/**
 * Третий раздел, седьмой вариант
 */

public class III_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Введите количество строк матрицы: ");
        int rows = scanner.nextInt();
        System.out.print("Введите количество столбцов матрицы: ");
        int cols = scanner.nextInt();

        System.out.print("Введите заданное значение: ");
        int threshold = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Матрица:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = random.nextInt(100);
                System.out.print(matrix[i][j] + " \t");
            }
            System.out.println();
        }

        int[] vectorB = new int[rows];
        for (int i = 0; i < rows; i++) {
            int count = 0;
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] < threshold) {
                    count++;
                }
            }
            vectorB[i] = count;
        }

        System.out.println("\nВектор B:");
        for (int i = 0; i < vectorB.length; i++) {
            System.out.println("B[" + i + "] = " + vectorB[i]);
        }

        scanner.close();
    }
}
