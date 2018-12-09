package com.in28minutes.rest.webservices.restfulwebservices.todo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by madhuri on 03-12-2018.
 */
@Service
public class TodoHardCodedService {

    private static List<Todo> tods = new ArrayList<>();
    private static int idCounter = 0;

    static {
        tods.add(new Todo(++idCounter, "Test Description", false, new Date()));
        tods.add(new Todo(++idCounter, "Learn Dance", false, new Date()));
        tods.add(new Todo(++idCounter, "Master Java", false, new Date()));
    }

    public List<Todo> findAll() {
        return tods;
    }


    public Todo save(Todo todo){
        if(todo.getId() == -1 || todo.getId() == 0){
            todo.setId(++idCounter);
            tods.add(todo);
        }else {
            deleteByid(todo.getId());
            tods.add(todo);
        }
        return todo;
    }

    public Todo deleteByid(long id) {
        Todo todo = findById(id);
        if(todo!=null){
            tods.remove(todo);
            return todo;
        }
        return null;
    }

    public Todo findById(long id) {
        for (Todo todo : tods) {
            if (todo.getId() == id) {
                return todo;
            }
        }
        return null;
    }

}
