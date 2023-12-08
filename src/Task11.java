import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String word = scanner.nextLine();

        if (isMumbaYumba(word)) {
            System.out.println("Слово принадлежит языку Мумба-Юмба");
        } else {
            System.out.println("Слово не принадлежит языку Мумба-Юмба");
        }
    }
    public static boolean isMumbaYumba(String word) {
        // Проверяем условие на отсутствие двух букв b подряд
        if (word.contains("bb")) {
            return false;
        }

        // Проверяем условие на отсутствие трех одинаковых подслов подряд
        for (int i = 0; i < word.length() - 2; i++) {
            if (word.charAt(i) == word.charAt(i + 1) && word.charAt(i) == word.charAt(i + 2)) {
                return false;
            }
        }
        return true;
    }
}
