public class Main {


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();



    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] countingBook = generateRandomArray();
        int totalPayment = 0;
        for (int element : countingBook) {
            totalPayment += element;
        }
        System.out.println(" сумма выплать равна:" + totalPayment);


    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] countingBook = generateRandomArray();
        int maxPayment = -1;
        int minPayment = 200001;
        for (int i = 0; i < countingBook.length; i++) {
            if (countingBook[i] > maxPayment) {
                maxPayment = countingBook[i];
            }
        }
        for (int i = 0; i < countingBook.length; i++) {
            if (countingBook[i] < minPayment) {
                minPayment = countingBook[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей");
    }


    public static void task3() {
        System.out.println("Задача 3");
        int[] countingBook = generateRandomArray();
        int averagePayment = 0;
        for (int i = 0; i < countingBook.length; i++) {
            averagePayment += countingBook[i] / countingBook.length;
        }
            System.out.println ("Средняя сумма трат за месяц составила: " + averagePayment + " рублей.");

    }

    public static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i =reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }

    }
}