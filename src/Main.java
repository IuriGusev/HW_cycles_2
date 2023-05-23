public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("task1");
        int salary = 15_000;
        int month = 1;
        int savingAmount = 2_459_000;
        while (salary < savingAmount) {
            System.out.println("Месяц " + month + "," + "сумма накоплений равна " + salary + " рублей");
            salary = salary + 15_000;
            month += 1;
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("task2");
        int start = 1;
        while (start <= 10) {
            System.out.print(start + " ");
            start += 1;
        }
        System.out.println();

        for (int i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("task3");
        int startPopulation = 12_000_000;
        int birthRateEvery1000 = 17 - 8;
        int year = 1;
        while (year <= 10) {
            System.out.println("Ear " + year + "," + " amount of population is " + startPopulation);
            year += 1;
            startPopulation = startPopulation + (startPopulation / 1000 * birthRateEvery1000);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("task4");
        double salary = 15_000;
        int month = 1;
        int savingAmount = 12_000_000;
        while (salary <= savingAmount) {
            System.out.println("Месяц " + month + "," + "сумма накоплений равна " + salary + " рублей");
            salary = salary + salary*0.07;
            month += 1;
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("task5");
        double salary = 15_000.00;
        int month = 1;
        int savingAmount = 12_000_000;
        double bankMonthPercent = 0.07;
        for (; salary <= savingAmount; month++) {
            salary = salary + salary*bankMonthPercent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }
        }
    }

    public static void task6() {
        System.out.println("task6");
        double salary = 15_000;
        int month = 1;
        double bankMonthPercent = 0.07;
        for (; month <= 9*12; month++) {
            salary = salary + salary*bankMonthPercent;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }
        }
    }

    public static void task7() {
        System.out.println("task7");
        int day = 3;
        for (; day <= 31; day = day + 7) {
            System.out.println("Сегодня пятница, " + day + "-е число.Необходимо подготовить отчет");
    }}

    public static void task8() {
        System.out.println("Task8");
        int thisYear = 2023;
        for (int i = 0; i < (thisYear+100); i += 79)
            if (i>(thisYear-200))
            System.out.println(i);
    }
}