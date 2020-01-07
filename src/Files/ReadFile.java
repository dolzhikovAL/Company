package Files;

import ForWorkers.Worker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadFile {
    private static final String filepath = "Files/";

    public static ArrayList<Worker> readFile() {
        ArrayList<Worker> www = new ArrayList<>();
        try (FileInputStream fin = new FileInputStream("src/Files/Base.txt")) {
            ObjectInputStream ois = new ObjectInputStream(fin);
            Object object = ois.readObject();
            www = (ArrayList<Worker>) object;
            if (www.size() > 0)
                System.out.println("Загрузка из файла прошла успешно");

        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Class not found or was recently changed");
        } catch (ClassCastException ex) {
            System.out.println("Cant cast to ArrayList<Workers> so Creaate new one");
        }
        return www;
    }

}