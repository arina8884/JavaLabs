import java.util.Scanner;
public class Main{

    public static void main(String[] args){
    Scanner scanner= new Scanner(System.in);
        System.out.println("выберите задачу:");
        System.out.println("1 - найти объем куба (V = a^3)");
        System.out.println("2 - проверить, является ли год високосным");
        System.out.println("3 - вычислить сумму ряда: 1 + 1/2 + 1/3 + ... + 1/N");
        System.out.print("ваш выбор (1-3): ");
        int choice = scanner.nextInt();
        System.out.println("результат");
        switch(choice){

            case 1:
                System.out.print("введите длину ребра куба(a):");
                    double a= scanner.nextDouble();
                    double volume= Math.pow(a,3);
                    System.out.println("объем куба равен  "+ volume);
                    break;

            case 2:

                System.out.print("ведите год: ");
                int year = scanner.nextInt();

                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("год " + year + " — високосный");
                } else {
                    System.out.println("год " + year + " невисокосный ");
                }
                break;

            case 3:

                System.out.print("введите целое число N (N > 0): ");
                int N = scanner.nextInt();


//                    for (int i = 1; i <= N; i++) {
//                        sum += 1.0 / i;
//                    }

                if (N <= 0) {
                    System.out.println("ошибка: N должно быть больше 0");
                }
                else  {
                    double sum = 0.0;
                    int i = 1;

                    while (i <= N) {
                        sum += 1.0 / i;
                        i++;
                    }

                    System.out.println("сумма ряда для N = " + N + " равна: " + sum);
                }
                break;

            default:
                System.out.println("ошибка: выбран несуществующий пункт меню");
                break;
        }







        scanner.close();
    }
}




