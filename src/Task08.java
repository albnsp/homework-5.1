import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную переменную: ");
        String variable = scanner.nextLine();
        String convertedVariable;
        if (isJavaSyntax(variable)) {
            convertedVariable = convertToCppSyntax(variable);
        } else if (isCppSyntax(variable)) {
            convertedVariable = convertToJavaSyntax(variable);
        } else {
            System.out.println("Некорректный синтаксис переменной");
            return;
        }
        System.out.println("Преобразованная переменная: " + convertedVariable);
    }

    // Метод для определения, является ли переменная в синтаксисе Java
    private static boolean isJavaSyntax(String variable) {
        return variable.matches("[a-z]+([A-Z][a-z]*)*");
    }

    // Метод для преобразования переменной из синтаксиса Java в синтаксис C++
    private static String convertToCppSyntax(String variable) {
        return variable.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
    }

    // Метод для определения, является ли переменная в синтаксисе C++
    private static boolean isCppSyntax(String variable) {
        return variable.matches("[a-z]+(_[a-z]+)*");
    }

    // Метод для преобразования переменной из синтаксиса C++ в синтаксис Java
    private static String convertToJavaSyntax(String variable) {
        StringBuilder convertedVariable = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < variable.length(); i++) {
            char c = variable.charAt(i);

            if (c == '_') {
                capitalizeNext = true;
            } else {
                if (capitalizeNext) {
                    convertedVariable.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    convertedVariable.append(Character.toLowerCase(c));
                }
            }
        }

        return convertedVariable.toString();
    }
}
