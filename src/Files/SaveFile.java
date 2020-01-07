package Files;

import ForWorkers.Worker;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveFile implements Serializable {


    static final String directory = "Files/";

    public static void createFile(ArrayList<Worker> object) {
        try {
            final ArrayList qqq = object;
            final FileOutputStream fos = new FileOutputStream("src/Files/Base.txt");
            final ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(qqq);
            oos.close();
        } catch (
                FileNotFoundException ex) {
        } catch (
                IOException ex) {
        }
    }
}
