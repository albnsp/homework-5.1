import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите предложение: ");
        String sentence = sc.nextLine();
        String[] words = sentence.split(" ");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        int averageLength = totalLength / words.length;
        System.out.println("Средняя длина слова: " + averageLength);
    }
}

