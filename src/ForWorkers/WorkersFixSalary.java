package ForWorkers;

import java.io.Serializable;
import java.util.Scanner;

public class WorkersFixSalary extends Worker implements Serializable {
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    private double salary;

    public WorkersFixSalary(String fistName, String secondName, double salary) {
        super(fistName, secondName);
        this.salary = salary;
    }

    @Override
    public double cash() {
        //    System.out.println( salary);
        return salary;
    }

    public static WorkersFixSalary addWorkersFixSalary() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя Сотрудника");
        String newFistName = scanner.next();
        System.out.println("Введите фамилию " + newFistName);
        String newSecondName = scanner.next();
        System.out.println("Введите Месячный оклад " + newFistName + " " + newSecondName);
        double newSalary = scanner.nextDouble();
        return new WorkersFixSalary(newFistName, newSecondName, newSalary);
    }
}
