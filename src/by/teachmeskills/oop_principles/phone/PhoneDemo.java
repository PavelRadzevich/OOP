package by.teachmeskills.oop_principles.phone;

/*
    - Создайте класс Phone, который содержит переменные number, model и weight.
    - Создайте три экземпляра этого класса. Выведите на консоль значения их переменных.
    - Добавить в класс Phone методы:
        - receiveCall, имеет один параметр – имя звонящего. Выводит на консоль сообщение “Звонит {name}”.
        - getNumber – возвращает номер телефона. Вызвать эти методы для каждого из объектов.
    - Добавить конструктор в класс Phone, который принимает на вход три параметра для инициализации
    переменных класса - number, model и weight.
    - Добавить конструктор, который принимает на вход два параметра для инициализации переменных класса - number, model.
    - Добавить конструктор без параметров.
    - Вызвать из конструктора с тремя параметрами конструктор с двумя.
    - Добавьте перегруженный метод receiveCall, который принимает два параметра - имя звонящего и номер телефона
    звонящего. Вызвать этот метод.
    - Создать метод sendMessage с аргументами переменной длины . Данный метод принимает на вход номера телефонов,
    которым будет отправлено сообщение. Метод выводит на консоль номера этих телефонов.
*/
public class PhoneDemo {
    public static void main(String[] args) {
        Phone[] phones = {new Phone("+109-458-67-29", "Blackberry Passport"),
                new Phone("+375-290-78-34", "Nokia 3310", 133),
                new Phone("+10-564-97-10", "Motorola RAZR")};

        getPhones(phones);

        phones[0].receiveCall("Bruce Wayne");
        phones[1].receiveCall("Arthur Fleck", "+12495414789");
        String numberTest = phones[2].getNumber();
        System.out.println(numberTest);
        String[] numbers = {"+34-888-55", "+444-555-666", "+0 2345 987", numberTest};
        phones[2].sendMessage(numbers);
    }

    public static void getPhones(Phone[] phones) {
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
