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
        int salary = 0;
        int month = 0;
        while (salary < 2459001) {
            System.out.println("Месяц " + month + "," + "сумма накоплений равна " + salary + " рублей");
            salary = salary + 15000;
            month = month + 1;
        }
        System.out.println();
    }

    public static void task2() {
        System.out.println("task2");
        int start = 1;
        while (start < 11) {
            System.out.print(start + " ");
            start = start + 1;
        }
        System.out.println();

        for (int i = 10; i > 0; i--)
            System.out.print(i + " ");
        System.out.println();
        System.out.println();
    }

    public static void task3() {
        System.out.println("task3");
        int startPopulation = 12000000;
        int birthRateEvery1000 = 17 - 8;
        int year = 0;
        while (year < 11) {
            System.out.println("Ear " + year + "," + " amount of population is " + startPopulation);
            year = year + 1;
            startPopulation = startPopulation + (startPopulation / 1000 * birthRateEvery1000);
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("task4");
        int salary = 15000;
        int month = 0;
        int everyMonthBankPercentSaving = (salary * 7 * 30 / 365) / 100;
        while (salary < 12_000_001) {
            System.out.println("Месяц " + month + "," + "сумма накоплений равна " + salary + " рублей");
            salary = salary + 15000 + everyMonthBankPercentSaving;
            month = month + 1;
        }
        System.out.println();
    }

    public static void task5() {
        System.out.println("task5");
        int salary = 15_000;
        int month = 0;
        int everyMonthAmountSaving = salary + 15_000;
        int bankPercentSaving = (salary * 7 * 30 / 365) / 100;
        for (; salary < 12_000_000; month++) {
            salary = salary + everyMonthAmountSaving;
            salary = bankPercentSaving + salary;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }
        }
    }

    public static void task6() {
        System.out.println("task6");
        int salary = 15_000;
        int month = 0;
        int everyMonthAmountSaving = salary + 15_000;
        int bankPercentSaving = (salary * 7 * 30 / 365) / 100;
        for (; month < 109; month++) {
            salary = salary + everyMonthAmountSaving;
            salary = bankPercentSaving + salary;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + " Итого " + salary);
            }
        }
    }

    public static void task7() {
        System.out.println("task7");
        int day = 3;
        for (; day < 32; day = day + 7)
            System.out.println("Сегодня пятница, " + day + "-е число.Необходимо подготовить отчет");
    }

    public static void task8() {
        System.out.println("Task8");
        for (int i = 0; i < (2023+100); i = i + 79)
            if (i>(2023-200))
            System.out.println(i);
    }
}