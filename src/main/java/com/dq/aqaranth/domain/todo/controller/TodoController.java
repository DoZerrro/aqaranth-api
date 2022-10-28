package com.dq.aqaranth.domain.todo.controller;

import com.dq.aqaranth.domain.todo.dto.TodoDTO;
import com.dq.aqaranth.domain.todo.service.TodoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    //Todo 조회
    @GetMapping("/list")
    public List<TodoDTO> todoList() {
        return todoService.todoList();
    }

    //Todo 상세조회
    @GetMapping("/read/{tno}")
    public TodoDTO todoRead(int tno) {
        return todoService.todoRead(tno);
    }

    //Todo 추가
    @PostMapping("/add")
    public Integer todoAdd(TodoDTO todoDTO) {
        return todoService.todoAdd(todoDTO);
    }

    //Todo 삭제
    @DeleteMapping("/delete/{tno}")
    public Integer todoDelete(int tno) {
        return todoService.todoDelete(tno);
    }

    //Todo 수정
    @PutMapping("/modify/{tno}")
    public Integer todoModify(TodoDTO todoDTO) {
        return todoService.todoModify(todoDTO);
    }
}
