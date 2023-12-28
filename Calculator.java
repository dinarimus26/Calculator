import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число (от 1 до 10): ");
        int num1 = scanner.nextInt();

        System.out.println("Введите операцию для первого действия (+, -, *, /): ");
        String action1 = scanner.next();

        System.out.println("Введите второе число (от 1 до 10): ");
        int num2 = scanner.nextInt();

        System.out.println("Введите операцию для второго действия (+, -, *, /): ");
        String action2 = scanner.next();

        System.out.println("Введите третье число (от 1 до 10): ");
        int num3 = scanner.nextInt();

        int result = 0;

        switch (action1 + action2) {
            case "++":
                int res1 = num1 + num2 + num3;
                System.out.println("Результат:" + res1);
                break;
            case "+-":
                int res2 = num1 + num2 - num3;
                System.out.println("Результат:" + res2);
                break;
            case "+*":
                int res3 = num2 * num3 + num1;
                System.out.println("Результат:" + res3);
                break;
            case "+/":
                if (num3 != 0) {
                    int res4 = num2 / num3 + num1;
                    System.out.println("Результат:" + res4);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "-+":
                int res5 = num1 - num2 + num3;
                System.out.println("Результат:" + res5);
                break;
            case "--":
                int res6 = num1 - num2 - num3;
                System.out.println("Результат:" + res6);
                break;
            case "-*":
                int res7 = -(num2 * num3) + num1;
                System.out.println("Результат:" + res7);
                break;
            case "-/":
                if (num3 != 0) {
                    int res8 = -(num2 / num3) + num1;
                    System.out.println("Результат:" + res8);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "*+":
                int res9 = num1 * num2 + num3;
                System.out.println("Результат:" + res9);
                break;
            case "*-":
                int res10 = num1 * num2 - num3;
                System.out.println("Результат:" + res10);
                break;
            case "**":
                int res11 = num1 * num2 * num3;
                System.out.println("Результат:" + res11);
                break;
            case "*/":
                if (num3 != 0) {
                    int res12 = num1 * num2 / num3;
                    System.out.println("Результат:" + res12);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "/+":
                if (num2 != 0) {
                    int res13 = num1 / num2 + num3;
                    System.out.println("Результат:" + res13);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "/-":
                if (num2 != 0) {
                    int res14 = num1 / num2 - num3;
                    System.out.println("Результат:" + res14);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "//":
                if (num2 != 0 && num3 != 0) {
                    int res15 = num1 / num2 / num3;
                    System.out.println("Результат:" + res15);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            case "/*":
                if (num2 != 0) {
                    int res16 = num1 / num2 * num3;
                    System.out.println("Результат:" + res16);
                } else {
                    System.out.println("Деление на ноль невозможно.");
                    return;
                }
                break;
            default:
                System.out.println("Неверная операция.");
                break;

        }
    }
}
