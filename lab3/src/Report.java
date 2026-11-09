
public class Report {

    public static void generateReport(Employee[] employees) {



        System.out.printf("%-15s %10s%n", "ФИО", "Зарплата");

        System.out.printf("%-15s %10s%n", "  -", " ");

        for (int i = 0; i < employees.length; i++) {
            System.out.printf("%-15s %10.2f%n",
                    employees[i].fullname,
                    employees[i].salary);
        }
    }
}