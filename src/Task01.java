import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку текста: ");
        String text = scanner.nextLine();

        System.out.print("Введите символ: ");
        char symbol = scanner.next().charAt(0);

        int count = 0;
        System.out.print("Индексы совпадений: ");
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                System.out.print(i + " ");
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Совпадений не найдено.");
        } else {
            System.out.println("\nКоличество совпадений: " + count);
        }
    }
}
