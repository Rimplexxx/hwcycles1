public class Main {
    public static void main(String[] args) {

        //task1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //task2
        for (int h = 10; h >= 1; h--) {
            System.out.println(h);
        }

        //task3
        for (int y = 0; y <= 17; y+=2) {
            System.out.println(y);
        }

        //task4
        for (int t = 10; t >= -10; t--) {
            System.out.println(t);
        }

        //task5
        for (int v = 1904; v <= 2096; v+=4) {
            System.out.println(v + " год является високосным");
        }

        //task6
        for (int a = 7; a <= 98; a+= 7) {
            System.out.println(a);
        }

        //task7
        for (int b = 1; b <= 512; b*=2) {
            System.out.println(b);
        }

        //task8

        int deposits = 29_000;
        int total = 0;
        for (int c = 1; c <= 12; c++ ) {
            total = total + deposits;
            System.out.println("Месяц " + c + ", сумма накоплений равна " + total + " рублей");
        }

        //task 9
        int deposits1 = 29_000;
        int total1 = 0;
        for (int x = 1; x <= 12; x++ ) {
            total1 = total1 + total1 / 100;
            total1 = total1 + deposits;
            System.out.println("Месяц " + x + ", сумма накоплений равна " + total1 + " рублей");
        }
    }
}