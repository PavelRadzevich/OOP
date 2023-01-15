package by.teachmeskills.oop_middle.accounting_system;
/*
    Accounting system
    Создать систему для учета документов.
    Создать класс Регистр, который будет иметь методы:
        - сохранения документа в регистре
        - предоставление информации о документе
    Система может работать с тремя типами документов:
        1) Контракт на поставку товаров. Содержит поля:
            - Номер документа
            - Дата документа
            - Тип товаров
            - Количество товаров
        2) Контракт с сотрудником. Содержит поля:
            - Номер документа
            - Дата документа
            - Имя сотрудника
        3) Финансовая накладная. Содержит поля:
            - Номер документа
            - Дата документа
            - Итоговая сумма за месяц
            - Код департамента
    Класс регистр должен содержать внутри себя массив и при добавлении
    документа в регистр этот добавляемый документ должен добавляться в массив;
        - Массив для класса регистра должен быть размером 10;
        - Для полей "Дата документа" следует использовать тип данных Date;
        - В методе предоставления информации о документе следует выводить на экран
        информацию о переданном входным параметр документе;
        - В методе предоставления информации о документе следует выводить на экран
        информацию о документе по переданному входному параметру документа;
        - Каждый класс для описания документов должен содержать конструктор с
        параметрами и без;
        - Для имитации работы системы создайте класс Main, который будет содержать
        только один метод public static void main. В этом методе напишите код для создания каждого из типов документов,
        добавления их в регистр и вывода информации о документе;
        - Все классы разместить по пакетам;
        - При выполнении задания использовать понятия интерфейсов и абстрактных
        классов.
*/

import java.util.Calendar;
import java.util.Date;

public class AccountingSystemDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        Date today = calendar.getTime();

        calendar.add(Calendar.YEAR, 1);
        Date nextYear = calendar.getTime();

        Document cGoods = new ContractOfGoods("16", today, 100, "Books");
        Document invoice = new Invoice("3456", today, 60000, 555);
        Document cEmployment = new EmploymentContract("324653", today, nextYear, "Eric Cartman");

        TheDocumentRegister register = new TheDocumentRegister();
        register.saveDocument(cEmployment);
        register.saveDocument(invoice);
        register.saveDocument(cGoods);

        register.getDocument(cEmployment.getNumberDocument());
        register.getDocument(invoice.getNumberDocument());
        register.getDocument(cGoods.getNumberDocument());
    }
}
