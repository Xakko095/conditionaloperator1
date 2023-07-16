public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int age = 17;
        if (age >= 18) {
            System.out.println("Возраст человека равен, " + age + " он совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен, то " + age + " он не достиг совершеннолетия," +
                    " нужно немного подождать».");
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("Если на улице " + temp + " градусов, нудно надеть шапку");
        } else {
            System.out.println("Если на улице " + temp + " градусов, можно идти без шапки");
        }
    }

    private static void task3() {
        System.out.println("Задача3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        int age = 24;
        if (age >= 2 && age < 7) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в садик");
        } else if (age > 6 && age < 19) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в универ");
        } else {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }
    }
    private static void task5() {
        System.out.println("Задача5");
        int ageChildren = 16;
        if (ageChildren <5) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему нельзя кататься на аттракционе");
        } else if (ageChildren>5 && ageChildren <= 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься на " +
                    " аттракционе в сопровождении взрослого");
        } else if (ageChildren > 14) {
            System.out.println("Если возраст ребенка равен " + ageChildren + " то ему можно кататься на " +
                    " аттракционе без спровождения взрослого");
        }
    }
    private static void task6 () {
        System.out.println("Задача6");
        int vagonCapacity = 101;
        int seatPlace = 59;
        int standingPlace = 42;
        if (vagonCapacity > 102) {
            System.out.println("Вагон полностью забит");
        } else if (vagonCapacity < 102 && seatPlace < 60) {
            System.out.println("Есть свободное сидячее место");
        } else if (vagonCapacity < 102 && standingPlace < 42) {
            System.out.println("Есть свободное стоячее место");
        }
    }
    private static void task7() {
        System.out.println("Задача7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (two + one <= three) {
            System.out.println("Наибольшее число " + three);
        }
    }
}