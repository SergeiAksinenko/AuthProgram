import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AuthLogic authLogic = new AuthLogic();
        Scanner scanner = new Scanner(System.in);

        boolean logIn = false;
        while (true) {
            System.out.println("1:Регистрация");
            System.out.println("2:Вход");

            //выбор действия
            int choosingAction;
            choosingAction = scanner.nextInt();
            scanner.nextLine();

            switch (choosingAction) {
                case 1:
                    System.out.print("Введите логин: ");
                    String login = scanner.nextLine();

                    System.out.print("Введите пароль : ");
                    String password = scanner.nextLine();

                    boolean registeredSuccessfully = authLogic.registration(login, password);
                    if (registeredSuccessfully) {
                        System.out.println("Успешная регистрация");
                    } else {
                        System.out.println("Ошибка регистрации. Пользователь с таким именем уже существует.");
                    }
                    break;
                case 2:
                    System.out.print("Введите логин: ");
                    login = scanner.nextLine();

                    System.out.print("Введите пароль: ");
                    password = scanner.nextLine();

                    boolean loginSuccessfully = authLogic.login(login, password);
                    if (loginSuccessfully) {
                        System.out.println("Вход выполнен!");
                    } else {
                        System.out.println("Ошибка входа. Неверное имя или пароль");
                    }
                    break;
                default:
                    System.out.println("Выберите действие: ");
                    break;
            }
        }
    }
}
