package ForWorkers;

import java.io.Serializable;

public abstract class Worker implements Serializable {
    private String fistName;
    private String secondName;

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Worker(String fistName, String secondName) {
        this.fistName = fistName;
        this.secondName = secondName;
    }

    public abstract double cash();


}



