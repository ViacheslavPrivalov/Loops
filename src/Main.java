public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
//        task5();
//        task6();
//        task7();
//        task8();
//        task9();
//        task10();

    }

    public static void task1() {
        System.out.println("Задача1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
    }

    public static void task2() {
        System.out.println("Задача2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
    }

    public static void task3() {
        System.out.println("Задача3");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
    }

    public static void task4() {
        System.out.println("Задача4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);
        }
    }
}