package com.example.ToDoApp;

import com.mongodb.lang.NonNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "MyTodos")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Todos {
    @Id
    private String id;
    private String title;
    private String content;
}
