package by.teachmeskills.oop_middle.employees;

/*
        Создать классы "Директор", "Рабочий", "Бухгалтер".
        Реализовать интерфейс с методом, который печатает название должности и
        имплементировать этот метод в созданные классы.
*/
public class EmployeesDemo {
    public static void main(String[] args) {
        Employees[] employees = {
                new Director("Professor Hubert J. Farnsworth"),
                new Accountant("Hermes Conrad"),
                new Worker("Scruffy Scruffington")};

        getNamePositions(employees);
    }

    private static void getNamePositions(Employees[] employees) {
        for (Employees employee : employees) {
            employee.printEmployeePosition();
        }
    }
}
