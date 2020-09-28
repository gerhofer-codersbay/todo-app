package com.codersbay.gerhofer;

import java.util.Date;

// representation of a single todo
public class ToDo {

    private static int COUNTER = 0;

    public int id;
    public String description;
    public boolean done;
    public Date dayOfDoing;

    public ToDo() {
        COUNTER++;
        this.id = COUNTER;
    }

    public ToDo(String description) {
        COUNTER++;
        this.description = description;
        this.id = COUNTER;
    }

    public void markAsDone() {
        this.done = true;
        this.dayOfDoing = new Date();
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                '}';
    }
}
