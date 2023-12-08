import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите смайлик: ");
        String text = scanner.nextLine();
        int count = countSmileys(text);
        System.out.println("Количество смайликов: " + count);
    }
    public static int countSmileys(String text) {
        int count = 0;
        int index = 0;
        while (index < text.length()) {
            char currentChar = text.charAt(index);
            if (currentChar == ';' || currentChar == ':') {
                index++;
                if (index < text.length() && text.charAt(index) == '-') {
                    index++;
                    while (index < text.length() && text.charAt(index) == '-') {
                        index++;
                    }
                }
                if (index < text.length() && isSmileyBracket(text.charAt(index))) {
                    index++;
                    while (index < text.length() && text.charAt(index) == text.charAt(index - 1)) {
                        index++;
                    }
                    count++;
                }
            } else {
                index++;
            }
        }
        return count;
    }
    public static boolean isSmileyBracket(char c) {
        return c == '(' || c == ')' || c == '[' || c == ']';
    }
}
