package lesson4.task1;

import java.util.Random;
import java.util.Scanner;

public class Task1 {
    static int n, m;
    static int i, j;

    public static void main(String[] args) {
        System.out.println("Enter massive size NxM: ");
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int mass[][] = new int[n][m];
        Random random = new Random();
        for (i = 0; i < n; i++) {
            for (j = 0; j < m; j++) {
                mass[i][j] = random.nextInt(5);
            }
        }
        arrayPrint(mass);
        if (n == m) {
            sum1(mass);
        } else {
            sum2(mass);
        }
    }

    public static void arrayPrint(int mass[][]) {
        for (i = 0; i < n; i++) {
            System.out.println();
            for (j = 0; j < m; j++)
                System.out.print(mass[i][j] + " ");
        }
        System.out.println();
    }

    public static void sum1(int mass[][]) {
        int sumSecondStringValue = 0;
        for (i = 1; i < 2; i++) {
            for (j = 0; j < m; j++)
                sumSecondStringValue += mass[i][j];
        }
        System.out.println("Sum of second string: " + sumSecondStringValue);
        int sumSideMatrix = 0;
        for (i = n - 1; i >= 0; i--) {
            sumSideMatrix += mass[i][n - i - 1];
        }
        System.out.println("Sum of side Matrix: " + sumSideMatrix);
        int result = sumSecondStringValue - sumSideMatrix;
        System.out.println("Difference: " + result);

    }

    public static void sum2(int mass[][]) {
        int sumSecondStringValue = 0;
        for (i = 1; i < 2; i++) {
            for (j = 0; j < m; j++)
                sumSecondStringValue += mass[i][j];
        }
        System.out.println("Sum of second string: " + sumSecondStringValue);
        int sumSecondColumn = 0;
        for (i = 0; i < n; i++) {
            for (j = 1; j < 2; j++) {
                sumSecondColumn += mass[i][j];
            }
        }
        System.out.println("Sum of second column: " + sumSecondColumn);
        int result = sumSecondStringValue - sumSecondColumn;
        System.out.println("Difference: " + result);
    }
}