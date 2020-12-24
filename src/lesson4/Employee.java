package lesson4;
//1 Создать класс "Сотрудник" с полями: ФИО, должность, телефон, зарплата, возраст;
//2 Конструктор класса должен заполнять эти поля при создании объекта;
//3 Внутри класса «Сотрудник» написать методы, которые возвращают значение каждого поля;
//4 Вывести при помощи методов из пункта 3 ФИО и должность.
//5 Создать массив из 5 сотрудников. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
//6* Создать метод, повышающий зарплату всем сотрудникам старше 35 лет на 10000;
//7** При создании экземпляра класса Сотрудник присваивать ему уникальный порядковый номер.
public class Employee {
    private String name;
    private String position;
    private int telephone;
    private double salary;
    private int age;
    private static int number;

    public Employee() {
    }

    public Employee(String name, String position, int telephone, double salary, int age) {
        this.name = name;
        this.position = position;
        this.telephone = telephone;
        this.salary = salary;
        this.age = age;
        number++;
    }



    public String getName() {
        return name;
    }
    public String getPosition() {
        return position;
    }
    public int getTelephone() {return telephone;}
    public double getSalary() {return salary;}
    public int getAge() {return age;}
    public int getNumber() {return number;}


    public void printNumber(){
        System.out.println("Порядковый номер сотрудника "+ name+ ": " + number);
    }


}