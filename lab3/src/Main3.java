
public class Main3 {

    public static void main(String[] args) {

        Employee[] employees = new Employee[3];

        employees[0] = new Employee("Иванов Иван", 1500.50);
        employees[1] = new Employee("Петров Петр", 1800.00);
        employees[2] = new Employee("Сидорова Анна", 2000.75);

        Report.generateReport(employees);
    }
}