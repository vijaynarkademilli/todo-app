package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.Date;

/**
 * Created by madhuri on 03-12-2018.
 */
public class Todo {

    private int id;
    private String description;
    private boolean done;
    private Date targetDate;

    public Todo() {
    }

    public Todo(int id, String description, boolean done, Date targetDate) {
        this.id = id;
        this.description = description;
        this.done = done;
        this.targetDate = targetDate;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Date getTargetDate() {
        return targetDate;
    }

    public void setTargetDate(Date targetDate) {
        this.targetDate = targetDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;

        Todo todo = (Todo) o;

        if (id != todo.id) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
