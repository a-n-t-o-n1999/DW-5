public class Main {
    public static void main(String[] args) {
        //task1.1
        for (int i = 1; i < 11; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task1.2
        for (int i = 10; i > 0; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task1.3
        for (int i = 0; i < 18; i = i + 2) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task.4
        for (int i = 10; i > -11; i--) {
            System.out.print(i + "  ");
        }
        System.out.println();
        //task1.5
        for (int i = 1904; i < 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        //task1.6
        for (int i = 7; i < 99; i = i + 7) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task1.7
        for (int i = 1; i < 513; i = i * 2) {
            System.out.print(i + "  ");

        }
        System.out.println();
        //task1.8
        int salary = 29000;
        int total = 0;
        for (int i = 1; i < 13; i++) {
            total = total + salary;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");

        }
        System.out.println();
        //task1.9
        int salary1 = 29000;
        double total1 = 0;
        for (int i = 1; i < 13; i++) {
            total1 = total1 * 1.01;
            total1 = total1 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");

        }
        System.out.println();
        //task1.10
        int a = 2;

        for (int i = 1; i < 11; i++) {
            int b = i * a;
            System.out.println(a + "*" + i + "=" + b);
        }
        //task1.1
        int salary2 = 15000;
        double total2 = 0;
        for (int i = 1; total2 < 2_459_000; i++) {
            total2 = total2 * 1.01;
            total2 = total2 + salary1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total2 + " рублей");
        }
        System.out.println();
        //task1.2
        int q = 1;
        while (q <= 10) {
            System.out.print(q + " ");
            q++;
        }
        System.out.println();
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
        //task1.3
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;
        for (int i = 1; i < 11; i++) {
            population = population + population / 1000 * (fertility - mortality);
            System.out.println("Год  " + i + ", численность населения составляет " + population);

        }
        System.out.println();
        //task1.4
        int contribution = 15_000;
        int i = 1;
        for (; contribution <= 12_000_000; i++) {
            contribution *= 1.07;
            System.out.println("После " + i + " месяца, на счету стало " + contribution + " рублей");
        }
        //task1.5
        int contribution1 = 15_000;
        int i1 = 1;
        for (; contribution1 <= 12_000_000; i1++) {
            contribution1 *= 1.07;
            if (i1 % 6 == 0) System.out.println("После " + i1 + " месяца, на счету стало " + contribution1 + " рублей");
        }
        //task1.6
        int contribution2 = 15_000;
        int period = 12*9;
        for (int i2 = 1; i2 <= period; i2++) {
            contribution2 *= 1.07;
            if (i2 % 6 == 0) System.out.println("После " + i2 + " месяца, на счету стало " + contribution2 + " рублей");
        }
        //task1.7
        int dateFriday = 5;
        for (; dateFriday <= 31; dateFriday+=7) {
            System.out.println("Сегодня пятница, "+ dateFriday + "-е число. Необходимо подготовить отчет");
        }
        //task1.8
        int year = 2024;
        for (int j = 0; j <year+100 ; j+=79) {
            if (j>year-200) System.out.println(j);
        }

    }
}