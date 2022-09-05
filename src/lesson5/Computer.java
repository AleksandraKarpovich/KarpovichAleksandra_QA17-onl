package lesson5;

import java.util.Random;
import java.util.Scanner;

public class Computer {
    private static boolean isOn;
    private static boolean cpu;
    private static boolean ram;
    private static boolean hdd;
    private static int resource;

   public Computer (boolean isOn, boolean cpu, boolean ram, boolean hdd, int resource){
       this.isOn = isOn;
       this.cpu = cpu;
       this.ram = ram;
       this.hdd = hdd;
       this.resource = resource;
   }

   // проверка Компьютера на наличие всех деталей, если чего-то не хватает, то доустанавливаем
   public boolean checkHardware (){
       if (!getCpu()) {
           setCpu(true);
       }
       if (!getRam()) {
           setRam(true);
       }
       if (!getHdd()){
           setHdd(true);
       }
       return true;
   }

   // проверка включен ли Компьютер? если включен, то принудительно выключаем
    public boolean checkState (){
       if (getIsOn()){
           setIsOn(false);
       }
       return false;
    }

    // метод описания Компьютера, вывод всех полей
   public void description(){

       if (Computer.cpu){
           System.out.print("[есть, ");
       }
       if (Computer.ram){
           System.out.print("есть, ");
       }
       if (Computer.hdd){
           System.out.print("есть, ");
       }
       System.out.println(Computer.resource + " циклов]");
   }
   // метод включения Компьютера
   public void switchOn(){

       if (Computer.resource == 0) {
        System.out.println("Ресурс исчерпан!");
       }else {

           Random random = new Random();
           Scanner scanner = new Scanner(System.in);

           int randomStateOn = random.nextInt(2);
           System.out.println("\nВведите ваш вариант:");
           int myStateOn = scanner.nextInt();
           if (randomStateOn == myStateOn) {
               System.out.println("Счастливчик. Компьютер включен.");
               Computer.resource--;
               System.out.println("Циклов осталось: " + resource);
           } else {
               System.out.println("Вы не угадали, компьютер сгорел!");
               setResource(0);
           }
       }
   }
    // метод выключения Компьютера
   public void switchOff(){
       Random random = new Random ();
       Scanner scanner = new Scanner(System.in);

       if (Computer.resource == 0) {
           System.out.println("Ресурс исчерпан!");
       }else {
           int randomStateOff = random.nextInt(2);
           System.out.println("Введите ваш вариант:");
           int myStateOff = scanner.nextInt();
           if (randomStateOff == myStateOff) {
               System.out.println("Счастливчик. Компьютер выключен");
               Computer.resource--;
               System.out.println("Циклов осталось: " + resource);
           } else {
               System.out.println("Вы не угадали, компьютер сгорел!");
               setResource(0);
           }
       }
   }

   public void setIsOn (boolean isOn){
       this.isOn = isOn;
   }
   public boolean getIsOn (){
       return this.isOn;
   }
   public void setCpu (boolean cpu){
       this.cpu = cpu;
   }
   public boolean getCpu (){
       return this.cpu;
   }
   public void setRam (boolean ram){
       this.ram = ram;
   }
   public boolean getRam (){
       return this.ram;
   }
   public void setHdd (boolean hdd){
       this.hdd = hdd;
   }
   public boolean getHdd (){
       return this.hdd;
   }
   public void setResource(int resource){
       this.resource = resource;
   }
   public int getResource(){
       return this.resource;
   }
}
