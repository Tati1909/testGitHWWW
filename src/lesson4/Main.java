package lesson4;

import java.sql.SQLOutput;

public class Main {

    private static Object Employee;

    public static void main(String[] args) {
        Employee employee1 = new Employee("Вася Пупкин","экономист",12549,670.8,36);
        employee1.printNumber();
        System.out.println(employee1.getName()+", "+employee1.getPosition());

        System.out.println();

        Employee employee2 = new Employee("Петя Иванов", "технолог", 25545, 620.7,48);
        employee2.printNumber();
        Employee employee3 = new Employee("Саша Иванов", "слесарь", 20045, 740.3,18);
        employee3.printNumber();
        Employee employee4 = new Employee("Коля Муся", "инженер", 25545, 540.6,56);
        employee4.printNumber();
        Employee employee5 = new Employee("Олег Дудко", "аналитик", 25545, 5644.2,19);
        employee5.printNumber();

        System.out.println();

        Employee[] array = {employee1,employee2,employee3,employee4,employee5};
        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 40) {
                System.out.println(array[i].getName() +",должность:"+ array[i].getPosition()+ ", телефон:" +
                        array[i].getTelephone()+ ", з/п: " + array[i].getSalary() + " $, " + array[i].getAge() + " лет.");
            }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i].getAge() > 35) {
                System.out.println(array[i].getName() + ", повышенная з/п составила: " + (array[i].getSalary() + 10000)+ " $.");
            }
        }

    }

}

//1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//2 Конструктор класса должен заполнять эти поля при создании объекта;
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//4 Вывести при помощи методов из пункта 3 ФИО и должность.
//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
//7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.

