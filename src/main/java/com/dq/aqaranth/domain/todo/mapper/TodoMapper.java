package com.dq.aqaranth.domain.todo.mapper;

import com.dq.aqaranth.domain.todo.dto.PageRequestDTO;
import com.dq.aqaranth.domain.todo.dto.TodoDTO;

import java.util.List;

public interface TodoMapper {

    //Todo 조회
    List<TodoDTO> todoList();

    //Todo 상세조회
    TodoDTO todoRead(int tno);

    //Todo 추가
    Integer todoAdd(TodoDTO todoDTO);

    //Todo 삭제
    Integer todoDelete(int tno);

    //Todo 수정
    Integer todoModify(TodoDTO todoDTO);

    //Todo Paging
    List<TodoDTO> listPage(PageRequestDTO pageRequestDTO);
    int listCount(PageRequestDTO pageRequestDTO);
}
