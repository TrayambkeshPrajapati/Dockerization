package com.example.ToDoApp;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoServiceImpl implements TodoService{
    private final TodoRepository todoRepository;;
    @Override
    public List<Todos> getAllTodos() {
        return todoRepository.findAll();
    }

    @Override
    public void addTodo(Todos newTodo) {
        todoRepository.save(newTodo);
    }

    @Override
    public void deleteTodo(String id) {
        todoRepository.deleteById(id);
    }

    @Override
    public void updateTodo(String id, Todos newTodo) {
        Todos oldTodo = todoRepository.findById(id).orElse(null);
        if(oldTodo != null){
            oldTodo.setTitle(newTodo.getTitle());
            oldTodo.setContent(newTodo.getContent());
            todoRepository.save(oldTodo);
        }
    }
}