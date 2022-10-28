package com.dq.aqaranth.domain.todo.mapper;

import com.dq.aqaranth.domain.todo.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static java.time.LocalDate.now;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class TodoMapperTest {

    @Autowired(required = false)
    TodoMapper todoMapper;

    @Test
    void todoList() {
        log.info("todoList..............................");
        List<TodoDTO> todoList = todoMapper.todoList();
        todoList.forEach(log::info);
    }

    @Test
    void todoRead() {
        log.info("todoRead..............................");
        log.info(todoMapper.todoRead(33014));
    }

    @Test
    void todoAdd() {
        log.info("todoAdd..............................");
        TodoDTO todoDTO = TodoDTO.builder()
                .title("제목입니다.")
                .memo("메모입니다.")
                .dueDate(now())
                .build();
        log.info(todoMapper.todoAdd(todoDTO));
        log.info(todoDTO.getTno());
    }

    @Test
    void todoDelete() {
        log.info("todoAdd..............................");
        log.info(todoMapper.todoDelete(33014));
    }

    @Test
    void todoModify() {
        log.info("todoModify..............................");
        TodoDTO todoDTO = TodoDTO.builder()
                .tno(33015)
                .title("수정제목입니다.")
                .memo("수정메모입니다.")
                .dueDate(now())
                .complete(true)
                .build();
        log.info(todoMapper.todoModify(todoDTO));
    }
}
