package lesson6;

/**
 * Создайте класс Phone, который содержит переменные number, model и weight.
 * Создайте три экземпляра этого класса.
 * Выведите на консоль значения их переменных.
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя звонящего.
 * Выводит на консоль сообщение “Звонит {name}”.
 * Метод getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона звонящего.
 * Вызвать этот метод.
 * Создать метод sendMessage с аргументами переменной длины.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено сообщение.
 * Метод выводит на консоль номера этих телефонов.**/

public class Main {

    public static void main(String[] args) {
    Phone iPhone = new Phone(12345,"12 Pro Max",1750);
    Phone samsung = new Phone (23968, "S10", 1520);
    Phone xiaomi = new Phone (98756, "Lite 10", 1600);

        System.out.println("Номер телефона 1: " + iPhone.getNumber() + ", модель телефона 1: " + iPhone.getModel() +
                ", вес телефона 1: " + iPhone.getWeight());
        System.out.println("Номер телефона 2: " + samsung.getNumber() + ", модель телефона 2: " + samsung.getModel() +
                ", вес телефона 2: " + samsung.getWeight());
        System.out.println("Номер телефона 3: " + xiaomi.getNumber() + ", модель телефона 3: " + xiaomi.getModel() +
                ", вес телефона 3: " + xiaomi.getWeight());

        iPhone.setName("Виктор");
        iPhone.receiveCall(iPhone.getName());
        System.out.println("Номер: " +  iPhone.getNumber());

        samsung.setName("Мама");
        samsung.receiveCall(samsung.getName());
        System.out.println("Номер: " +  samsung.getNumber());

        xiaomi.setName("Папа");
        xiaomi.receiveCall(xiaomi.getName());
        System.out.println("Номер: " +  xiaomi.getNumber());

        iPhone.receiveCall(iPhone.getName(), iPhone.getNumber()); //перегруженный метод
        iPhone.sendMessage(iPhone.getNumber(), samsung.getNumber(), xiaomi.getNumber());
    }
}
