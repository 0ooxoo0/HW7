public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1:");
        int firstFriday = 5;
        for (int date = firstFriday; date <= 31; date += 7) {
            System.out.println("Сегодня пятница, " + date + "-е число. Необходимо подготовить отчет");
        }
        System.out.println();

        System.out.println("Задание 2 (do-while):");
        int passed = 0;
        int totalDistance = 42195;
        do {
            passed += 500;
            if (passed > totalDistance) passed = totalDistance;
            System.out.println("Держитесь! Осталось " + (totalDistance - passed) + " метров");
        } while (passed < totalDistance);
        System.out.println();

        System.out.println("Задание 2 (for):");
        for (passed = 500; passed <= totalDistance; passed += 500) {
            System.out.println("Держитесь! Осталось " + (totalDistance - passed) + " метров");
        }
        if (totalDistance % 500 != 0) {
            System.out.println("Держитесь! Осталось 0 метров");
        }
        System.out.println();

        System.out.println("Задание 3 (while):");
        int budget = 1000;
        int day = 1;
        while (budget > 0) {
            if (day % 5 == 0) {
                day++;
                continue;
            }
            if (budget >= 100) {
                budget -= 100;
                day++;
            } else {
                break;
            }
        }
        System.out.println("На " + (day - 1) + " дней хватит бюджета (while)");
        System.out.println();

        System.out.println("Задание 3 (for):");
        budget = 1000;
        int daysCount = 0;
        for (day = 1; budget > 0; day++) {
            if (day % 5 == 0) {
                daysCount++;
                continue;
            }
            if (budget >= 100) {
                budget -= 100;
                daysCount++;
            } else {
                break;
            }
        }
        System.out.println("На " + daysCount + " дней хватит бюджета (for)");
        System.out.println();

        System.out.println("Задание 4:");
        int month = 0;
        double total = 0;
        double target = 12_000_000;
        while (true) {
            month++;
            total += 15000;
            if (month % 6 == 0) {
                total += total * 0.07;
            }
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей%n", month, total);
            if (total >= target) {
                break;
            }
        }
        System.out.println();

        System.out.println("Задание 5:");
        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats < 3) {
            minute++;
            if (minute % 10 == 0) {
                overheats++;
                System.out.println("Перегрев на минуте " + minute + ". Зарядка прерывается на 2 минуты.");
                minute += 2;
                continue;
            }
            charge += 2;
            if (charge > 100) charge = 100;
        }

        if (overheats >= 3) {
            System.out.println("Зарядка прекращена. Текущий заряд: " + charge + "%");
        } else {
            System.out.println("Зарядка завершена. Текущий заряд: " + charge + "%");
        }
        System.out.println("Время зарядки составило " + minute + " минут");
    }
}