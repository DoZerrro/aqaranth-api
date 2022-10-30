package com.dq.aqaranth.domain.todo.controller;

import com.dq.aqaranth.domain.todo.dto.PageRequestDTO;
import com.dq.aqaranth.domain.todo.dto.TodoDTO;
import com.dq.aqaranth.domain.todo.service.TodoService;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
@RequiredArgsConstructor
@RequestMapping("/api/todo")
public class TodoController {

    private final TodoService todoService;

    //Todo 조회
    @ApiOperation(value = "Todo List 조회", notes = "Todo List 를 조회합니다.")
    @GetMapping("/list")
    public List<TodoDTO> todoList() {
        return todoService.todoList();
    }

    //Todo 상세조회
    @ApiOperation(value = "Todo 상세 조회", notes = "Todo 를 상세조회합니다.")
    @GetMapping("/read/{tno}")
    public TodoDTO todoRead(@PathVariable int tno) {
        return todoService.todoRead(tno);
    }

    //Todo 추가
    @ApiOperation(value = "Todo 추가", notes = "Todo 를 추가합니다.")
    @PostMapping("/add")
    public Integer todoAdd(@RequestBody TodoDTO todoDTO) {
        return todoService.todoAdd(todoDTO);
    }

    //Todo 삭제
    @ApiOperation(value = "Todo 삭제", notes = "Todo 를 삭제합니다.")
    @DeleteMapping("/delete/{tno}")
    public Integer todoDelete(@PathVariable int tno) {
        return todoService.todoDelete(tno);
    }

    //Todo 수정
    @ApiOperation(value = "Todo 수정", notes = "Todo 를 수정합니다.")
    @PutMapping("/modify/{tno}")
    public Integer todoModify(@RequestBody TodoDTO todoDTO) {
        return todoService.todoModify(todoDTO);
    }

    //Todo Paging
    @ApiOperation(value = "Todo Paging", notes = "Todo Paging 입니다.")
    @GetMapping("/paging")
    public void list(PageRequestDTO pageRequestDTO, Model model) {
        log.info("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
        log.info(pageRequestDTO);

        model.addAttribute("result", todoService.listPage(pageRequestDTO));
    }
}
