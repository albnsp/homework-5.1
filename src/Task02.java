import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число n: ");
        int n = scanner.nextInt();
        StringBuilder sB = new StringBuilder();
        int number = 1;
        while (sB.length() < n) {
            sB.append(number);
            number++;
        }
        char digit = sB.charAt(n - 1);
        System.out.println("Цифра на позиции " + n + ": " + digit);
    }
}
