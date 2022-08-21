package lesson3.task2;
/* Постройте частотный словарь букв русского (или английского) алфавита.
Т.е. Сколько раз каждая бука алфавита повторяется в введенной строке.
Alphabet.put(“A”, 0)*/
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        HashMap<Character, Integer> Alphabet = new HashMap<Character, Integer>();
        Scanner sc = new Scanner(System.in);
        String enteredString = sc.nextLine();
        enteredString = enteredString.replace(" ","");
        enteredString = enteredString.toLowerCase(Locale.ROOT);
        for (int i = 0; i < enteredString.length(); i++){
            Character n = enteredString.charAt(i);
            Integer count = Alphabet.get(n);
            if(count == null){
                Alphabet.put(n, 1);
            }else{
                Alphabet.put(n, count+1);
            }
        }
        System.out.println(Alphabet);
    }
}
