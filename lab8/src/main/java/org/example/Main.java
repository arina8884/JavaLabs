package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("  лаба 8\n");


        Professional[] staff = new Professional[5];

        staff[0] = new Doctor("Якубовская Светлана", 10, 4.9, "Хирург");
        staff[1] = new Doctor("Елена Петрова", 5, 4.7, "Терапевт");
        staff[2] = new Doctor("Харевич Наталья", 12, 5.0, "Невролог");
        staff[3] = new Engineer("Черноокий Владислав", 7, 4.8, "Умный Дом");
        staff[4] = new Engineer(" Пиляй Арина ", 3, 4.5, "Мост через Волгу");

        for (int i = 0; i < staff.length; i++) {
            System.out.println(" работник №" + (i + 1) + "   ");
            staff[i].displayInfo();
            staff[i].work();

            if (staff[i] instanceof Doctor) {
                Doctor doc = (Doctor) staff[i];
                doc.diagnose();
            } else if (staff[i] instanceof Engineer) {
                Engineer eng = (Engineer) staff[i];
                eng.design();
            }
            System.out.println();
        }
    }
}