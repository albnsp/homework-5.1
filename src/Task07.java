import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Ввод строки
        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        // Замена букв и цифр
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                result = result + Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else if (Character.isDigit(c)) {
                result += "_";
            } else {
                result = result + c;
            }
        }
        System.out.println("Результат: " + result);
    }
}
