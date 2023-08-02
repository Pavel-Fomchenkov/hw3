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
        int index = 178001;
        byte age = 18;
        short steps = 21538;
        long randomLongNumber = 2135465476874437544L;
        float price = 59999.99F;
        double profit = -1245876.99;
        System.out.println("Значение переменной 'index' с типом 'ínt' равно " + index);
        System.out.println("Значение переменной 'age' с типом 'byte' равно " + age);
        System.out.println("Значение переменной 'steps' с типом 'short' равно " + steps);
        System.out.println("Значение переменной 'randomLongNumber' с типом 'long' равно " + randomLongNumber);
        System.out.println("Значение переменной 'price' с типом 'float' равно " + price);
        System.out.println("Значение переменной 'profit' с типом 'double' равно " + profit);
    }
    public static void task2() {
        double numberOne = 27.12;
        long numberTwo = 987_678_965_549L;
        float numberThree = 2.786F;
        short numberFour = 569;
        short numberFive = -159;
        int numberSix = 27897;
        byte numberSeven = 67;
        System.out.println(numberOne +" "+ numberTwo +" "+ numberThree +" "+ numberFour +" "+ numberFive +" "+ numberSix +" "+ numberSeven);
    }
    public static void task3() {
        byte studentsOfTeacher1 = 23;
        byte studentsOfTeacher2 = 27;
        byte studentsOfTeacher3 = 30;
        short paper = 480;
        int paperPerStudent = paper / (studentsOfTeacher1 + studentsOfTeacher2 + studentsOfTeacher3); // Можно также использовать float или double
        System.out.println("На каждого ученика рассчитано " + paperPerStudent + " листов бумаги");
    }
    public static void task4() {
        int minute = 1;
        int productivity = 16 / 2 * minute;
        int productsPer20min = productivity * 20;
        int productsPerDay = productivity * 60 * 24;
        int productsPer3Days = productsPerDay * 3;
        int productsPerMonth = productsPerDay * 30;
        System.out.println(
                "За 20 минут машина произвела " + productsPer20min + " штук бутылок\n" +
                "За сутки минут машина произвела " + productsPerDay + " штук бутылок\n" +
                "За 3 дня минут машина произвела " + productsPer3Days + " штук бутылок\n" +
                "За месяц минут машина произвела " + productsPerMonth + " штук бутылок"
        );
    }
    public static void task5() {
        int allPaints = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int paintPerClass = whitePaintPerClass + brownPaintPerClass;
        int classes = allPaints / paintPerClass;
        int whitePaints = classes * whitePaintPerClass;
        int brownPaints = classes * brownPaintPerClass;
        System.out.println(
                "В школе, где " + classes + " классов, нужно " + whitePaints +
                        " банок белой краски и " + brownPaints + " банок коричневой краски"
        );
    }
    public static void task6() {
        int banana = 5;
        int milk = 200;
        int iceCream = 2;
        int rawEgg = 4;
        int bananaWeight = 80;
        double milkWeight = 105.0 / 100;
        int iceCreamWeight = 100;
        int rawEggWeight = 70;
        double breakfastWeight = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + rawEgg * rawEggWeight;
        double breakfastWeightkilos = breakfastWeight / 1000;
        System.out.println(
                "Вес завтрака спортсмена " + breakfastWeight + " граммов, или " + breakfastWeightkilos + " килограмм"
        );
    }
    public static void task7() {
        int weightToLose = 7000;
        int minLossPerDay = 250;
        int maxLossPerDay = 500;
        int minDays = weightToLose / maxLossPerDay;
        int maxDays = weightToLose / minLossPerDay;
        int averageDays = (maxDays + minDays) / 2;
        System.out.println(
                "Чтобы сбросить вес к соревнованиям спортсмену потребуется от " + minDays + " до "
                        + maxDays + " дней, или в среднем " + averageDays + " дней"
        );
    }
    public static void task8() {
        int mashasSalary = 67760;
        int denisSalary = 83690;
        int kristinasSalary = 76230;
        int persentInc = 10;
        int newMashasSalary = mashasSalary + mashasSalary * persentInc / 100;
        int newDenisSalary = denisSalary + denisSalary * persentInc / 100;
        int newKristinasSalary = kristinasSalary + kristinasSalary * persentInc / 100;
        int mashasYearSalaryIncrease = (newMashasSalary - mashasSalary) * 12;
        int denisYearSalaryIncrease = (newDenisSalary - denisSalary) * 12;
        int kristinasYearSalaryIncrease = (newKristinasSalary - kristinasSalary) * 12;
        System.out.println(
                "Маша теперь получает " + newMashasSalary + " рублей. Годовой доход вырос на " + mashasYearSalaryIncrease + " рублей\n"
                        + "Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisYearSalaryIncrease + " рублей\n"
                        + "Кристина теперь получает " + newKristinasSalary + " рублей. Годовой доход вырос на " + kristinasYearSalaryIncrease + " рублей"
        );
    }
}