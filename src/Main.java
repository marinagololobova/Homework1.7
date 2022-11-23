public class Main {
    public static void main(String[] args) {

        System.out.println("Домашнее задание 1");

        System.out.println("Задание 1");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 2");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        for (int i = 0; i <= 17; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 4");
        for (int i = 10; i >= -10; i--) {
            System.out.print(i + " ");
        }


        System.out.println("\nДомашнее задание 2");

        System.out.println("Задание 1");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + "  год является високосным");
        }

        System.out.println("Задание 2");
        for (int i = 7; i <= 98; i += 7) {
            System.out.print(i + " ");
        }

        System.out.println("\nЗадание 3");
        for (int i = 1; i <= 512; i += i) {
            System.out.print(i + " ");
        }

        System.out.println("\nДомашнее задание 3");
        int pot = 29000;
        double total = 0;
        for (int i = 1; i < 13; i++){
            total = (total + pot) * (1 + 0.01);
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
        }
    }
}