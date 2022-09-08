package lesson5;

/**     Создать класс компьютер.
        Поля:
        - isOn boolean
        - процессор Boolean
        - оперативка Boolean
        - жесткий диск Boolean
        - ресурс полных циклов работы (включений/выключений) int
        Методы:
        - метод описание (вывод всех полей)
        вывод:  [“есть”, “есть”, “есть”, 18 циклов]
        - метод включить, при включении может произойти сбой, при вызове метода
        рандом загадывает число (0 либо 1), вы вводите число с клавиатуры, если
        угадали комп включается, если нет сгорает. Если комп сгорел, при попытке
        включить нужно выдать сообщение, что ему конец
        - выключить (аналогично включению)
        - при превышении лимита ресурса комп сгорает
 **/


public class Main {
    public static int i;

    public static void main(String[] args){
        Computer lenovo = new Computer(true,false, true, true, 15);

        lenovo.checkState();
        lenovo.checkHardware();
        lenovo.description();

        for (i=0; i<lenovo.getResource(); i++) {
            lenovo.switchOn();
            lenovo.switchOff();
        }
    }
}