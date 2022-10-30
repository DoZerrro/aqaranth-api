package com.dq.aqaranth.domain.todo.service;

import com.dq.aqaranth.domain.todo.dto.PageRequestDTO;
import com.dq.aqaranth.domain.todo.dto.PageResponseDTO;
import com.dq.aqaranth.domain.todo.dto.TodoDTO;
import com.dq.aqaranth.domain.todo.mapper.TodoMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Log4j2
public class TodoService {

    private final TodoMapper todoMapper;

    //Todo 조회
    public List<TodoDTO> todoList() {
        return todoMapper.todoList();
    };

    //Todo 상세조회
    public TodoDTO todoRead(int tno) {
        return todoMapper.todoRead(tno);
    };

    //Todo 추가
    public Integer todoAdd(TodoDTO todoDTO) {
        return todoMapper.todoAdd(todoDTO);
    };

    //Todo 삭제
    public Integer todoDelete(int tno) {
        return todoMapper.todoDelete(tno);
    };

    //Todo 수정
    public Integer todoModify(TodoDTO todoDTO) {
        return todoMapper.todoModify(todoDTO);
    };

    //Todo Paging
    public PageResponseDTO<TodoDTO> listPage(PageRequestDTO pageRequestDTO) {
        List<TodoDTO> dtoList = todoMapper.listPage(pageRequestDTO);
        int total = todoMapper.listCount(pageRequestDTO);

        return new PageResponseDTO<>(pageRequestDTO,total, dtoList);
    }
}
