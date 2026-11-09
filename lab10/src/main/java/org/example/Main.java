package org.example;

public class Main {
    public static void main(String[] args) {
        // Создаем массив интерфейсного типа Workable на 5 элементов (3 доктора и 2 учителя)
        Workable[] staff = new Workable[5];

        staff[0] = new Doctor("Харевич ", 10, "Хирург");
        staff[1] = new Doctor("Черноокий ", 5, "Терапевт");
        staff[2] = new Doctor("Веселов", 15, "Кардиолог");
        staff[3] = new Teacher("Сугако", 8, "Математика");
        staff[4] = new Teacher("Смирнова", 12, "История");

        System.out.println(" работа и обучение сотрудников ");
        System.out.println();

        for (Workable person : staff) {

            person.work();
            System.out.println("стаж работы: " + person.getExperience() + " лет.");


            if (person instanceof Teachable) {
                Teachable t = (Teachable) person;
                t.teach();
                System.out.println("количество учеников/интернов: " + t.getStudents());
            }

            if (person instanceof Doctor) {
                ((Doctor) person).displayInfo();
            } else if (person instanceof Teacher) {
                ((Teacher) person).displayInfo();
            }

            System.out.println("   ");
        }
    }
}