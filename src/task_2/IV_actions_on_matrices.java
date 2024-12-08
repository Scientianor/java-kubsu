package task_2;
import java.util.Scanner;

/**
 * Четвёртый раздел, седьмой вариант
 */

public class IV_actions_on_matrices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите размер матрицы (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Размер матрицы должен быть положительным числом.");
            return;
        }

        int[][] matrix = new int[n][n];
        System.out.println("Введите элементы матрицы:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        double product = 1.0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            int element = matrix[i][n - 1 - i];
            if (element > 0) {
                product *= element;
                count++;
            }
        }

        if (count > 0) {
            double geometricMean = Math.pow(product, 1.0 / count);
            System.out.printf("Среднее геометрическое положительных элементов побочной диагонали: %.6f\n", geometricMean);
        } else {
            System.out.println("На побочной диагонали нет положительных элементов.");
        }

        scanner.close();
    }
}