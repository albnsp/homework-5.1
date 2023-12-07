import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        // Разделение строки на слова
        String[] words = input.split("[\\s:]+"); // ?
        // Подсчет слов с четным количеством букв
        int count = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                count++;
            }
        }

        // Вывод результата
        System.out.println("Количество слов с четным количеством букв: " + count);
    }
}
