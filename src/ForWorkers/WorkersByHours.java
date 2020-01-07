package ForWorkers;

import java.io.Serializable;
import java.util.Scanner;

public class WorkersByHours extends Worker implements Serializable {

    private double salary;
    private int hours;
    private double days;

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

    public double getDays() {
        return days;
    }

    public void setDays(double days) {
        this.days = days;
    }

    public WorkersByHours(String fistName, String secondName, double salary) {
        super(fistName, secondName);
        this.salary = salary;
        this.hours = 8;
        this.days = 20.8;
    }

    public WorkersByHours(String fistName, String secondName, double salary, int hours, double days) {
        super(fistName, secondName);
        this.salary = salary;
        this.hours = hours;
        this.days = days;

    }

    @Override
    public double cash() {
        //  System.out.println(salary * days * hours);
        return salary * days * hours;
    }

    public static WorkersByHours addNewWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Сотрудника");
        String newFistName = scanner.next();
        System.out.println("Введите фамилию " + newFistName);
        String newSecondName = scanner.next();
        System.out.println("Введите почасовую ставку " + newFistName + " " + newSecondName);
        double newSalary = scanner.nextDouble();
        System.out.println("Отработал  сотрудник норму ? \n Да -- введите 1 \n Нет -- 2");
        byte full = scanner.nextByte();
        if (full == 2) {
            System.out.println("Введите количество отработанных дней ");
            double newDays = scanner.nextDouble();
            System.out.println("Введите количество часов отработанное ежедневно");
            int newHours = scanner.nextInt();
            return new WorkersByHours(newFistName, newSecondName, newSalary, newHours, newDays);
        } else
            return new WorkersByHours(newFistName, newSecondName, newSalary, 8, 20.8);
    }
}
