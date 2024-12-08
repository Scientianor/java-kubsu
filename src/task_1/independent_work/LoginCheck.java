package task_1.independent_work;

/**
 * Самостоятельная работа, четвёртое задание
 */

public class LoginCheck {
    public static void main(String[] args) {
        String expectedUsername = "user";
        String expectedPassword = "password";

        if (args.length == 2) {
            String username = args[0];
            String password = args[1];

            if (expectedUsername.equals(username) && expectedPassword.equals(password)) {
                System.out.println("Вас узнали. Добро пожаловать.");
            } else {
                System.out.println("Логин и пароль не распознаны. Доступ запрещен.");
            }
        } else {
            System.out.println("Неверное количество параметров.");
        }
    }
}
