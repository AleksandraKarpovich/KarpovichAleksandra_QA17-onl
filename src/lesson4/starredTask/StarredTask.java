package lesson4.starredTask;

import java.util.Random;
import java.util.Scanner;

public class StarredTask {
    static int n, m;
    static int i, j;

    public static void main(String[] args) {
        System.out.println("Введите размер матрицы NxM: ");
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
        if (n>2 && m>2) {
            if (n == m) { // квадратная матрица
                squareMatrix(mass);
            } else {
                nonSquareMatrix(mass); // неквадратная матрица
            }
        }else {
            System.out.println("\nНичего не выйдет, введи размер матрицы больше чем 2x2 ");
            }
    }
    public static void arrayPrint (int mass[][]){
            for (i = 0; i < n; i++) {
                System.out.println();
                for (j = 0; j < m; j++)
                    System.out.print(mass[i][j] + " ");
            }
            System.out.println();
    }
    public static void squareMatrix (int mass[][]){
        if (n==m && n%2!=0){ //Матрица квадратная и нечетная 3*3
            int a = (n-1)/2;
            int b = (m-1)/2;
            System.out.printf("Индекс центра матрицы [%d][%d] и значение ", a, b);
            System.out.print(mass[a][b]);
        }else { //Матрица квадратная и четная 4*4
            System.out.print("Матрица четная, центр невозможно выявить\n");
            newMatrix(mass);
        }
    }
    //Создание новой матрицы (удалить столбец справа и предпоследнюю строку)
    public static void newMatrix(int mass[][]){
        for (i = 0; i < n-2; i++) {
            System.out.println();
            for (j = 0; j < m-1; j++)
                System.out.print(mass[i][j] + " ");
        }
        for (i = n-1; i <= n-1; i++) {
            System.out.println();
            for (j = 0; j < m-1; j++)
                System.out.print(mass[i][j] + " ");
        }
        System.out.println();
        System.out.println("Новая матрица готова!");
    }

    public static void nonSquareMatrix(int mass[][]) {
        if (n > m) {//не квадратная матрица, например 5*4, 8*4
            cutMatrix1(mass);
        } else {
            cutMatrix2(mass); //не квадратная матрица, например 4*5, 4*8
        }
    }
    public static void cutMatrix1 (int mass[][]){
        if (m%2==0){// например, матрица 5*4, будет матрица 3*3
            for (i = 0; i < m-1; i++) {
                System.out.println();
                for (j = 0; j < m-1; j++)
                    System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            int a = (m-1)/2;
            System.out.printf("\nИндекс центра матрицы [%d][%d] и значение ", a, a);
            System.out.print(mass[a][a]);
        }else {// например, матрица 6*5, будет матрица 5*5
            for (i = 0; i <= m-1; i++) {
                System.out.println();
                for (j = 0; j <= m-1; j++)
                    System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            int b = (m-1)/2;
            System.out.printf("\nИндекс центра матрицы [%d][%d] и значение ", b, b);
            System.out.print(mass[b][b]);
        }
    }
    public static void cutMatrix2(int mass[][]){
        if (n%2!=0){//например, матрица 4*5, будет матрица 3*3
            for (i = 0; i < n; i++) {
                System.out.println();
                for (j = 0; j < n; j++)
                    System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            int a = (n-1)/2;
            System.out.printf("\nИндекс центра матрицы [%d][%d] и значение ", a, a);
            System.out.print(mass[a][a]);
        } else {//например, матрица 4*8, будет матрица 3*3
            for (i = 0; i < n-1; i++) {
                System.out.println();
                for (j = 0; j < n-1; j++)
                    System.out.print(mass[i][j] + " ");
            }
            System.out.println();
            int b = (n-1)/2;
            System.out.printf("\nИндекс центра матрицы [%d][%d] и значение ", b, b);
            System.out.print(mass[b][b]);
        }
    }
}