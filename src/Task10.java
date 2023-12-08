import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку (максимальная длина - 50 символов): ");
        String input = scanner.nextLine();
        int length = input.length();

        if (length > 50) {
            System.out.println("Длина строки превышает максимальное значение (50 символов).");
            return;
        }

        for (int i = 0; i < length; i++) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j) + " ");
            }
            System.out.println();
        }

        for (int i = length - 2; i >= 0; i--) {
            for (int j = length - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(input.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
