public class Main {
    public static void main(String[] args) {
        //task1
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task2
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task4
        for (int i = 10; i > -11; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //task6
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task7
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        }
        System.out.println();
        //task9
        int salary1 = 29000;
        double total1 = 0;
        for (int i = 1; i < 13; i++) {
            total1 = total1 * 1.01;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");

        }
        System.out.println();
        //task10
        int a = 2;

        for (int i = 1; i < 11; i++) {
            int b = i * a;
            System.out.println(a + "*" + i + "=" + b);
        }

    }
}