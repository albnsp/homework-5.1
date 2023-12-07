public class Task06 {
    public static void main(String[] args) {
        int totalExcludedNumbers = 0;
        for (int i = 0; i <= 99999; i++) {
            String number = String.format("%05d", i); // Преобразование числа в строку с пятизначным форматом
            if (number.contains("4") || number.contains("13")) {
                totalExcludedNumbers++;
            }
        }
        System.out.println("Количество номеров, которые нужно исключить: " + totalExcludedNumbers);
    }
}
