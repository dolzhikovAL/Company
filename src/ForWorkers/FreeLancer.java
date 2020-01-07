package ForWorkers;

import java.io.Serializable;
import java.util.Scanner;

public class FreeLancer extends Worker implements Serializable {
    private double salary;
    private int hours;


    public FreeLancer(String fistName, String secondName, double salary, int hours) {
        super(fistName, secondName);
        this.salary = salary;
        this.hours = hours;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public double cash() {
        return salary * hours;
    }

    public static FreeLancer addFreeLancer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Сотрудника");
        String newFistName = scanner.next();
        System.out.println("Введите фамилию " + newFistName);
        String newSecondName = scanner.next();
        System.out.println("Введите количество часов отработанноев этом месяце");
        int newHours = scanner.nextInt();
        System.out.println("Введите Почасовую оплату  " + newFistName + " " + newSecondName);
        double newSalary = scanner.nextDouble();
        return new FreeLancer(newFistName, newSecondName, newSalary, newHours);
    }
}
