package lesson3.task1;
/*
Создать программу, которая позволяет ввести с клавиатуры массив размером n и отсортировать его по убыванию.
 */
import java.util.Scanner;

public class Task1 {
    static int arraySize;
    static int i;

    public static void main(String[] args) {
        System.out.print("Enter massive size: -> ");
        makeMassiveUsingKeyboard();
        int[] array = new int[arraySize];

        for (int i=0; i<array.length; i++) {
            System.out.print("Enter element " + i + ": ");
            array [i] = makeMassiveUsingKeyboard();
        }
        printMassive(array);
        sortMassiveByBubbleWay(array);
        System.out.println("Sorted massive DESC:");
        printSortedDescMassive(array);
    }

    public static int makeMassiveUsingKeyboard(){
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        return arraySize;
    }
    public static void printMassive(int array[]) {
        System.out.println("Your base massive is: ");
        for (int i = 0; i<array.length-1; i++) {
            System.out.print(array [i] + ", ");
        }
        System.out.println(array[array.length-1]);
        }
        public static void sortMassiveByBubbleWay(int array[]){
            for (int i = 0; i<array.length; i++) {
                for (int j = 0; j<array.length-1; j++){
                if (array[j]<array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = tmp;
                }}
            }
        }
        public static int printSortedDescMassive(int array[]){
            System.out.print ("[");
            for (int i = 0; i<array.length-1; i++) {
                System.out.print(array [i] + ", ");
            }
            System.out.println(array[array.length-1] + "]");
            return (array[i]);
        }
}
