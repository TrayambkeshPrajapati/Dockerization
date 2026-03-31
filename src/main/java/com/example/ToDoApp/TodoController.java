package com.example.ToDoApp;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/to-do")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
public class TodoController {
    private final TodoServiceImpl todoService;
    @GetMapping
    public ResponseEntity<?> getAllTodos(){
        List<Todos> todos =  todoService.getAllTodos();
        return ResponseEntity.ok(todos);
    }

    @PostMapping
    public ResponseEntity<?> addTodo(@RequestBody Todos newTodo){
        todoService.addTodo(newTodo);
        return ResponseEntity.ok(todoService.getAllTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteTodo(@PathVariable String id){
        todoService.deleteTodo(id);
        return ResponseEntity.ok("Deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTodo(@PathVariable String id, @RequestBody Todos newTodo){
        todoService.updateTodo(id,newTodo);
        return ResponseEntity.ok("Updated");
    }
}
