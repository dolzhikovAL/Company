package ForCompany;

import ForWorkers.FreeLancer;
import ForWorkers.Worker;
import ForWorkers.WorkersByHours;
import ForWorkers.WorkersFixSalary;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {

    public static void calculateSalary(ArrayList<Worker> www) {
        double calculated = 0;
        for (int i = 0; i < www.size(); i++)
            calculated += www.get(i).cash();
        System.out.println("Сумма зарплат сотрудников в этом месяце == " + calculated);
        System.out.println("\n");
    }

    public static void show(ArrayList<Worker> www) {
        for (int i = 0; i < www.size(); i++) {
            System.out.println("Имя работника              --     " + www.get(i).getFistName() +
                    "\n Фамилия работника         --     " + www.get(i).getSecondName() +
                    "\n Тип работника             --     " + www.get(i).getClass().getSimpleName() +
                    "\n Зарплата в текущем месяце --     " + www.get(i).cash());
            System.out.println("------------------------------------------");
            System.out.println("");
        }
    }

    public static void show(Worker www) {
        System.out.println("Имя работника              --     " + www.getFistName() +
                "\n Фамилия работника         --     " + www.getSecondName() +
                "\n Тип работника             --     " + www.getClass().getSimpleName() +
                "\n Зарплата в текущем месяце --     " + www.cash());
        System.out.println("------------------------------------------");
        System.out.println("");
    }


    public static Worker addNewWorker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите тип сотрудника: " +
                "\n 1-- Работники с почасовой оплатой" +
                "\n 2-- Работники с фиксированной оплатой" +
                "\n 3-- Фрилансеры");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1:
                return WorkersByHours.addNewWorker();
            case 2:
                return WorkersFixSalary.addWorkersFixSalary();
            case 3:
                return FreeLancer.addFreeLancer();
            default:
                addNewWorker();
        }
        return null;
    }

    public static ArrayList<Worker> sortUP(ArrayList<Worker> www) {
        Worker buff;
        int left = 0;
        int right = www.size() - 1;
        do {
            for (int i = left; i < right; i++) {
                if (www.get(i).cash() > www.get(i + 1).cash()) {
                    buff = www.get(i);
                    www.set(i, www.get(i + 1));
                    www.set(i + 1, buff);

                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (www.get(i).cash() < www.get(i - 1).cash()) {
                    buff = www.get(i);
                    www.set(i, www.get(i - 1));
                    www.set(i - 1, buff);
                }
            }
            left++;
        } while (left < right);
        return www;
    }

    public static ArrayList<Worker> sortDown(ArrayList<Worker> www) {
        Worker buff;
        int left = 0;
        int right = www.size() - 1;
        do {
            for (int i = left; i < right; i++) {
                if (www.get(i).cash() < www.get(i + 1).cash()) {
                    buff = www.get(i);
                    www.set(i, www.get(i + 1));
                    www.set(i + 1, buff);
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (www.get(i).cash() > www.get(i - 1).cash()) {
                    buff = www.get(i);
                    www.set(i, www.get(i - 1));
                    www.set(i - 1, buff);
                }
            }
            left++;
        } while (left < right);
        return www;
    }
}


