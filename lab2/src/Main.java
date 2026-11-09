import java.util.Random;

public class lab2.1 {
    public static void main(String[] args) {
        int[] numbers = new int[15];
        Random random = new Random();

        System.out.println(" задание 1 ---");
        System.out.println("Исходный массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        System.out.print("индексы элементов, кратных 3 и 5: ");
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 3 == 0 && numbers[i] % 5 == 0) {
                System.out.print(i + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.print("элементы не найдены");
        }
        System.out.println();
    }
}


