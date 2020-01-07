package ForCompany;

import Files.ReadFile;
import Files.SaveFile;
import ForWorkers.StartWorkers;
import ForWorkers.Worker;

import java.util.ArrayList;
import java.util.Scanner;


public class Company {

    StartWorkers startWorkers = new StartWorkers();
    ArrayList<Worker> www = new ArrayList<>();


    public void mainMenu() {
        www = ReadFile.readFile();
        if (www.size() == 0) {
            System.out.println("Ошибка загрузки базы из файла" +
                    "\n Инициализыция начальной базы ");
            www = startWorkers.initialization();

        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие" +
                "\n 1-- Сумма выплат по зарплатам" +
                "\n 2--Вывод информации о работниках" +
                "\n 3--Добавить сотрудника" +
                "\n 4--Сортировка по убыванию выплат" +
                "\n 5--Сортировка по возрастанию" +
                "\n 6--Срхранить данные и выйти" +
                "\n 7-- Выход");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1: {
                Utils.calculateSalary(www);
                mainMenu();
                break;
            }
            case 2: {
                Utils.show(www);
                mainMenu();
                break;
            }
            case 3: {
                www.add(Utils.addNewWorker());
                System.out.println("Сотрудник добавлен");
                Utils.show(www.get(www.size() - 1));
                mainMenu();
                break;
            }
            case 4: {
                www = Utils.sortUP(www);
                Utils.show(www);
                mainMenu();
                break;
            }
            case 5: {
                www = Utils.sortDown(www);
                Utils.show(www);
                mainMenu();
                break;
            }
            case 6: {
                SaveFile.createFile(www);
            }
        }
    }
}
