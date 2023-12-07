import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String input = scanner.nextLine();
        // Разделение строки на слова
        String[] words = input.split(" ");
        // Проверка каждого слова
        for (String word : words) {
            // Проверка на начало с гласной буквы и конец с согласной
            if (startsWithVowel(word) && endsWithConsonant(word)) {
                System.out.println(word);
            }
        }
    }
    // Метод для проверки начала слова с гласной буквы
    private static boolean startsWithVowel(String word) {
        char firstChar = word.toLowerCase().charAt(0);
        return firstChar == 'a' || firstChar == 'e' || firstChar == 'i' || firstChar == 'o' || firstChar == 'u';
    }

    // Метод для проверки конца слова с согласной буквы
    private static boolean endsWithConsonant(String word) {
        char lastChar = word.toLowerCase().charAt(word.length() - 1);
        return !(lastChar == 'a' || lastChar == 'e' || lastChar == 'i' || lastChar == 'o' || lastChar == 'u');
    }
}
