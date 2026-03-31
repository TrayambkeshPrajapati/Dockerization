package com.example.ToDoApp;


import java.util.List;

public interface TodoService {
    List<Todos> getAllTodos();
    void addTodo(Todos newTodo);
    void deleteTodo(String id);
    void updateTodo(String id,Todos newTodo);
}
