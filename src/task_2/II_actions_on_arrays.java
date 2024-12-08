package task_2;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Второй раздел, седьмой вариант
 */

public class II_actions_on_arrays {
    public static void main(String[] args) {
        int[] x = {3, -6, 7, -2, 0, -8, 4};

        ArrayList<Integer> y = new ArrayList<>();
        for (int num : x) {
            if (num < 0) {
                y.add(num / 2);
            }
        }

        Collections.sort(y);

        System.out.println("Результирующий массив y: " + y);
    }
}