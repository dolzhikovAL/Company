package ForWorkers;

import java.util.ArrayList;

public class StartWorkers {

    public ArrayList<WorkersByHours> peopleByHours = new ArrayList<>();
    public ArrayList<WorkersFixSalary> peopleFixSalary = new ArrayList<>();
    public ArrayList<FreeLancer> peopleFreeLancer = new ArrayList<>();


    public void getPeopleByHours() {
        WorkersByHours alex = new WorkersByHours("Alex", "First", 111.4);
        WorkersByHours aaa = new WorkersByHours("AAA", "BBB", 111, 2, 10);
        WorkersByHours olenka = new WorkersByHours("Olenka", "Petrenko", 20);
        peopleByHours.add(alex);
        peopleByHours.add(aaa);
        peopleByHours.add(olenka);

    }

    public void getWorkersFixSalary() {
        WorkersFixSalary gena = new WorkersFixSalary("Gena", "Xleb", 11880);
        WorkersFixSalary oleg = new WorkersFixSalary("Oleg", "Gorbunov", 11760);
        peopleFixSalary.add(oleg);
        peopleFixSalary.add(gena);
    }

    public void getFreeLancer() {
        FreeLancer kot = new FreeLancer("Cat", "Myau", 39, 100);
        FreeLancer dog = new FreeLancer("Dog", "Spits", 150, 150);
        FreeLancer parrot = new FreeLancer("Parrot", "Ara", 140.4, 143);
        peopleFreeLancer.add(kot);
        peopleFreeLancer.add(dog);
        peopleFreeLancer.add(parrot);
    }

    public ArrayList<Worker> initialization() {
        getFreeLancer();
        getPeopleByHours();
        getWorkersFixSalary();
        ArrayList<Worker> www = new ArrayList<>();
        www.addAll(peopleByHours);
        www.addAll(peopleFreeLancer);
        www.addAll(peopleFixSalary);
        return www;


    }
}