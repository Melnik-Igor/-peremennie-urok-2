public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("");

        System.out.println("Задача 1");
        byte b = 100;
        short s = 1000;
        int i = 10000;
        long l = 100000;
        float f = 1.0698540f;
        double d = 1.0685454860d;
        System.out.println("byte - " + b);
        System.out.println("short - " + s);
        System.out.println("int - " + i);
        System.out.println("long - " + l);
        System.out.println("float - " + f);
        System.out.println("double - " + d);
        System.out.println("");

        System.out.println("Задача 2");
        float aA = 27.12f;
        long bA = 987678965549L;
        float cA = 2.768f;
        short dA = 569;
        short eA = -159;
        short fA = 27897;
        byte gA = 67;
        System.out.println("aA - " + aA);
        System.out.println("bA - " + bA);
        System.out.println("cA - " + cA);
        System.out.println("dA - " + dA);
        System.out.println("eA - " + eA);
        System.out.println("fA - " + fA);
        System.out.println("gA - " + gA);
        System.out.println("");

        System.out.println("Задача 3");
        byte lP = 23;
        byte aS = 27;
        byte eAn = 30;
        short bayPaper = 480;
        int student = lP + aS + eAn;
        int paper = bayPaper / student;
        System.out.println("У Людмилы Павловны " + lP + " ученика");
        System.out.println("У Анны Сергеевны " + aS + " учеников");
        System.out.println("У Екатерины Андреевны " + eAn + " учеников");
        System.out.println("Закупили всего " + bayPaper + " листов бумаги");
        System.out.println("На каждого ученика рассчитано " + paper + " листов бумаги");
        System.out.println("");

        System.out.println("Задача 4");
        int bottle = 16;
        int minuteBottle = 2;
        byte minute = 20;
        short day = 24 * 60;
        int dayThree = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + (minute / minuteBottle) * bottle + " штук бутылок");
        System.out.println("За сутки машина произвела " + (day / minuteBottle) * bottle + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + (dayThree / minuteBottle) * bottle + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + (month / minuteBottle) * bottle + " штук бутылок");
        System.out.println("");

        System.out.println("Задача 5");
        byte colorBank = 120;
        byte white = 2;
        byte black = 4;
        int classBank = white + black;
        int claSs = colorBank / classBank;
        int classWhite = white * claSs;
        int classBlack = black * claSs;
        System.out.println("В школе, где " + claSs + " классов, нужно " + classWhite + " банок белой краски и " + classBlack + " банок коричневой краски");
        System.out.println("");

        System.out.println("Задача 6");
        int bananas = 5 * 80;
        int milk = 200 * 105 / 100;
        int iceCream = 2 * 100;
        int egg = 4 * 70;
        int sportsBreakfastGr = bananas + milk + iceCream + egg;
        float sportsBreakfastKg = sportsBreakfastGr / 1000f;
        System.out.println("Вес спортзавтрака в граммах: " + sportsBreakfastGr + " гр.");
        System.out.println("Вес спортзавтрака в килограммах: " + sportsBreakfastKg + " кг.");
        System.out.println("");

        System.out.println("Задача 7");
        int weightLossKg = 7;
        int weightLossGr = weightLossKg * 1000;
        int weightLossOption250 = 250;
        int weightLossOption500 = 500;
        int weightLoss250 = weightLossGr / weightLossOption250;
        int weightLoss500 = weightLossGr / weightLossOption500;
        System.out.println(weightLoss250);
        System.out.println(weightLoss500);
        System.out.println("");

        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        // Повышение в месяц
        int mashaSalaryRaising = (mashaSalary * 10 / 100) + mashaSalary;
        int denisSalaryRaising = (denisSalary * 10 / 100) + denisSalary;
        int kristinaSalaryRaising = (kristinaSalary * 10 / 100) + kristinaSalary;
        //Предыдущая в год
        int mashaSalaryPreviousYear = mashaSalary * 12;
        int denisSalaryPreviousYear = denisSalary * 12;
        int kristinaSalaryPreviousYear = kristinaSalary * 12;
        //Повышение в год
        int mashaSalaryNewYear = mashaSalaryRaising * 12;
        int denisSalaryNewYear = denisSalaryRaising * 12;
        int kristinaSalaryNewYear = kristinaSalaryRaising * 12;
        int mashaSalaryDiff = mashaSalaryNewYear - mashaSalaryPreviousYear;
        int denisSalaryDiff = denisSalaryNewYear - denisSalaryPreviousYear;
        int kristinaSalaryDiff = kristinaSalaryNewYear - kristinaSalaryPreviousYear;
        System.out.println("Маша теперь получает " + mashaSalaryRaising + " рублей. Годовой доход вырос на: " + mashaSalaryDiff + " рублей.");
        System.out.println("Денис теперь получает " + denisSalaryRaising + " рублей. Годовой доход вырос на: " + denisSalaryDiff + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaSalaryRaising + " рублей. Годовой доход вырос на: " + kristinaSalaryDiff + " рублей.");
        System.out.println("");



        







        System.out.println("Задача 1");


    }
}