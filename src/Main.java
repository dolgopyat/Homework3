public class Main {
    public static void main(String[] args) {

        // Задача 1.
        System.out.println("   Задача 1.");
        byte a = 1;
        short b = 2;
        int c = 3;
        long d = 4L;
        float e = 5.0f;
        double f = 6.0;
        System.out.println("Значение переменной a с типом byte равно " + a );
        System.out.println("Значение переменной b с типом short равно " + b );
        System.out.println("Значение переменной c с типом int равно " + c );
        System.out.println("Значение переменной d с типом long равно " + d );
        System.out.println("Значение переменной e с типом float равно " + e );
        System.out.println("Значение переменной f с типом double равно " + f );

        // Задача 2.
        double g = 27.12;
        long h = 987678965549l;
        float i = 2.786f;
        boolean j = false;
        int k = 569;
        short l = -159;
        char m = 27897;
        byte n = 67;

        // Задача 3.
        System.out.println("   Задача 3.");
        var teacher1 = 23;
        var teacher2 = 27;
        var teacher3 = 30;
        var allStudents = teacher1 + teacher2 + teacher3;
        var paper = 480;
        var quantityPaper = paper / allStudents;
        System.out.println("На каждого ученика рассчитано " + quantityPaper + " листов бумаги");

        // Задача 4.
        System.out.println("   Задача 4.");
        byte efficiency = 8;
        int efficiency1 = efficiency * 20;
        int efficiency2 = efficiency * 1440;
        int efficiency3 = efficiency * 4320;
        int efficiency4 = efficiency * 43200;
        System.out.println("За 20 часов машина произвела бутылок " + efficiency1 + " штук");
        System.out.println("За сутки машина произвела бутылок " + efficiency2 + " штук");
        System.out.println("За 3 суток машина произвела бутылок " + efficiency3 + " штук");
        System.out.println("За месяц машина произвела бутылок " + efficiency4 + " штук");

        // Задача 5.
        System.out.println("   Задача 5.");
        int paint = 120;
        int whitePaint1 = 2;
        int brownPaint1 = 4;
        int classroom = paint / (whitePaint1 + brownPaint1);
        int whitePaint2 = whitePaint1 * classroom;
        int brownPaint2 = brownPaint1 * classroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaint2 + " банок белой краски и " + brownPaint2 + " банок коричневой краски");

        // Задача 6.
        System.out.println("   Задача 6.");
        double bananas = 5 * 80;
        double milk = 2 * 105;
        double icecream = 2 * 100;
        double eggs = 4 * 70;
        double weightCocktail = (bananas + milk + icecream + eggs) / 1000;
        System.out.println("Вес коктейля для спортсменов " + weightCocktail + " кг.");

        // Задача 7.
        System.out.println("   Задача 7.");
        int weight = 7 * 1000;
        int weight1 = 250;
        int weight2 = 500;
        float weight3 = (weight1 + weight2) / 2;
        int days1 = weight / weight1;
        int days2 = weight / weight2;
        float daysA = weight / weight3;
        float daysB = (weight % weight3) / weight3;
        float days3 = daysA + daysB;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм, то на похудение уйдёт " + days1 +  " дней");
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм, то на похудение уйдёт " + days2 +  " дней");
        System.out.println("В среднем на похудение уйдёт " + days3 +  " дней");

        // Задача 8.
        System.out.println("   Задача 8.");
        int zpMasha = 67760;
        int zpDenis = 83690;
        int zpKris = 76230;
        double newZpMasha = zpMasha * 1.1;
        double newZpDenis = zpDenis * 1.1;
        double newZpKris = zpKris * 1.1;
        int year = 12;
        double differenceZpMasha = (newZpMasha - zpMasha) * year;
        double differenceZpDenis = (newZpDenis - zpDenis) * year;
        double differenceZpKris = (newZpKris - zpKris) * year;
        System.out.println("Маша теперь получает " + newZpMasha + " рублей. Годовой доход вырос на " + differenceZpMasha + " рублей");
        System.out.println("Денис теперь получает " + newZpDenis + " рублей. Годовой доход вырос на " + differenceZpDenis + " рублей");
        System.out.println("Кристина теперь получает " + newZpKris + " рублей. Годовой доход вырос на " + differenceZpKris + " рублей");
    }
}