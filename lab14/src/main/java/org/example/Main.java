package org.example;

import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

    }

    public static void task1() {
        String fileName = "dream.txt";

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            pw.println("моя мечта прожить долгую насыщенную жизнь");
            System.out.println("файл успешно создан!");

        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }


        File file = new File(fileName);
        System.out.println("\n данные о файле ");
        System.out.println("  имя: " + file.getName());
        System.out.println(" путь: " + file.getAbsolutePath());
        System.out.println("размер: " + file.length() + " байт");
        System.out.println("существует: " + file.exists());

        System.out.println("\n содержимое файла ");
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
        }
    }


    public static void task2() {
        String fileName = "f.txt";
        Scanner scanner = new Scanner(System.in);


        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("введите 10 целых чисел:");
            for (int i = 0; i < 10; i++) {
                System.out.print("число " + (i + 1) + ": ");
                pw.println(scanner.nextInt());
            }
        } catch (IOException e) {
            System.out.println("ошибка записи: " + e.getMessage());
        }

        System.out.println("\n числа из файла и подсчет палиндромов:");
        int palindromeCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                System.out.println(num);

                if (isPalindrome(num)) {
                    palindromeCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("ошибка чтения: " + e.getMessage());
        }

        System.out.println("количество чисел-палиндромов: " + palindromeCount);
    }


    private static boolean isPalindrome(int n) {
        if (n < 0) return false;
        int original = n, reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }


    public static void task3() {
        String f = "f.txt", g = "g.txt", h = "h.txt";
        Random rnd = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(f))) {
            for (int i = 0; i < 15; i++) {
                pw.println(rnd.nextInt(100) + 1);
            }
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(f));
             PrintWriter pwG = new PrintWriter(new FileWriter(g));
             PrintWriter pwH = new PrintWriter(new FileWriter(h))) {

            String line;
            System.out.println("распределение чисел (кратно 11 -> в g, остальные -> в h):");
            while ((line = br.readLine()) != null) {
                int num = Integer.parseInt(line);
                if (num % 11 == 0) {
                    pwG.println(num);
                    System.out.println(num + " -> в g");
                } else {
                    pwH.println(num);
                    System.out.println(num + " -> в h");
                }
            }
            System.out.println("файлы g и h успешно созданы!");
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }
    }


    public static void task4() {
        String fileName = "speeds.txt";
        Scanner scanner = new Scanner(System.in);

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            System.out.println("введите 15 значений скорости (можно дробные, через запятую/точку):");
            for (int i = 0; i < 15; i++) {
                System.out.print("скорость " + (i + 1) + ": ");
                pw.println(scanner.nextDouble());
            }
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }



        double sum = 0;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                sum += Double.parseDouble(line);
                count++;
            }
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        if (count > 0) {
            System.out.println("средняя скорость: " + (sum / count));
        }
    }


    public static void task5() {
        String fileName = "f.txt";
        Random rnd = new Random();

        try (PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
            System.out.print("сгенерированные числа: ");
            for (int i = 0; i < 10; i++) {
                int num = rnd.nextInt(80) + 1;
                pw.println(num);
                System.out.print(num + " ");
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }


        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (Integer.parseInt(line) % 8 == 0) {

                    count++;
                }
            }
        } catch (IOException e) {
            System.out.println("ошибка: " + e.getMessage());
        }

        System.out.println("количество чисел, кратных 8: " + count);
    }
}