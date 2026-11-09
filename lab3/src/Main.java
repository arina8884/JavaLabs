import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("выберите задание:");
        System.out.println("1 - вывести часть строки");
        System.out.println("2 - разделить предложение на слова");
        System.out.println("3 - отчёт по зарплатам");
        System.out.println("4 - найти строки по шаблону");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {

            case 1:
                String text = "программирование";
                String result = text.substring(2, 7);

                System.out.println("исходная строка: " + text);
                System.out.println("результат: " + result);
                break;

            case 2:
                String sentence = "я изучаю язык программирования Java";
                String[] words = sentence.split("\\s+");

                System.out.println("слова предложения:");

                for (int i = 0; i < words.length; i++) {
                    System.out.println(words[i]);
                }
                break;

            case 3:
                Employee[] employees = new Employee[] {
                        new Employee("Иванов И.И.", 1250.50),
                        new Employee("Петров П.П.", 980.00),
                        new Employee("Сидоров С.С.", 2100.75)
                };

                Report.generateReport(employees);
                break;

            case 4:
                String data = "aXa aXXa aXXXa aXXXXa aXXXXXa";
                String[] parts = data.split(" ");

                for (String part : parts) {
                    if (part.matches("aX{2,4}a")) {
                        System.out.println(part);
                    }
                }
                break;

            default:
                System.out.println("такого задания нет");
                break;
        }

        scanner.close();
    }
}