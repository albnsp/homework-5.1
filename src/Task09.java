import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод первой строки
        System.out.print("Введите первую строку: ");
        String str1 = scanner.nextLine();

        // Ввод второй строки
        System.out.print("Введите вторую строку: ");
        String str2 = scanner.nextLine();

        // Удаление пробелов и пунктуации и приведение к нижнему регистру
        str1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Преобразование строк в массивы символов и сортировка
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Проверка на анаграмму
        boolean isAnagram = Arrays.equals(arr1, arr2);

        // Вывод результата
        if (isAnagram) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
