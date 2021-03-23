package es.hulk.repas.exercisis;

import java.util.Random;
import java.util.Scanner;

public class Revisio1 {

    public static int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }

    public static boolean multiple(int num1, int num2) {
        int mult = num1 * num2;
        int div = mult % 0;
        if (div != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int countXifres(int num) {
        int xifres = 0;
        if (num <= 9) {
            return 1;
        } else if (num <= 99) {
            return 2;
        } else if (num <= 999) {
            return 3;
        } else if (num <= 9999) {
            return 4;
        } else if (num <= 10000) {
            return 5;
        }
        return xifres;
    }

    public static int menorInvertit(int num) {

        return num;
    }

    public static void daysBetween2Dates() {
        Scanner scanner = new Scanner(System.in);
        int dies = 30;
        int mesos = 12;
        int anys = 2090;

        int dia1 = scanner.nextInt();
        int mes1 = scanner.nextInt();
        int any1 = scanner.nextInt();

        int dia2 = scanner.nextInt();
        int mes2 = scanner.nextInt();
        int any2 = scanner.nextInt();

        int diesAny1 = any1 * 365;
        int diesAny2 = any2 * 365;

        int diesMesos1 = mes1 * 30;
        int diesMesos2 = mes2 * 30;

        int calcul1 = diesAny1 + diesMesos1 + dia1;
        int calcul2 = diesAny2 + diesMesos2 + dia2;

        int calculFinal = calcul1 - calcul2;

        System.out.println(calculFinal);
    }

    public static void dieferenciaHores() {
        Scanner scanner = new Scanner(System.in);
        int minutsSegons = 60;

        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds = scanner.nextInt();

        if (hours <= 24 && minutes <= minutsSegons && seconds <= minutsSegons) {
            if (seconds > minutsSegons) {
                seconds = 0;
                minutes++;
            }
            if (minutes > minutsSegons) {
                minutes = 0;
                hours++;
            }
            seconds++;

            System.out.println(hours + ":" + minutes + ":" + seconds);
        } else {
            System.out.println("Introdueix una hora correcte");
        }
    }

    public static void quadratDeNumero() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        do {
            numero = scanner.nextInt();
            int mult = numero * numero;
            System.out.println(mult);
        }
        while (numero != 0);

        System.out.println("Numero 0");
    }

    public static void sumQuadratNumeros() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int aux = 0;
        do {
            numero = scanner.nextInt();
            int mult = numero * numero;
            aux += mult;
            System.out.println(mult);
        }
        while (numero != 0);

        System.out.println("Suma: " + aux);
    }

    public static void multipleOfTwo() {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int numero;

        do {
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                counter++;
            }
        } while (numero % 2 == 0);

        System.out.println("S'ha introduit un numero que no es multiple de 2");
        System.out.println("Numero de vegades que s'ha introduit un numero multiple de 2: " + counter);
    }

    public static void betweenZeroAndMaxNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numero = scanner.nextInt();
        int rand = random.nextInt(numero);

        do {
            numero = scanner.nextInt();
            if (numero < rand) {
                System.out.println("Numero menor");
            }
            if (numero > rand) {
                System.out.println("Numero major");
            }
        } while (rand != numero);

        System.out.println("S'ha introduit el numero correcte.");
    }

    public static void stopOnNegativeAverageCalculator() {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int counter = 0;
        double aux = 0;
        do {
            numero = scanner.nextInt();
            aux += numero;
            counter++;
        } while (numero < 0);

        double average = aux / counter;
        System.out.println(average);
    }

    public static void askFourNumbers() {
        Scanner scanner = new Scanner(System.in);

        int max1 = scanner.nextInt();
        int multiple = scanner.nextInt();

        for (int i = 0; i <= max1; i++) {
            if (i % multiple == 0) {
                System.out.println(i + " es multiple");
            }
        }
    }
}
