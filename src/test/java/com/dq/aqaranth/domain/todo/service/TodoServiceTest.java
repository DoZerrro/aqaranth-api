package com.dq.aqaranth.domain.todo.service;

import com.dq.aqaranth.domain.todo.dto.PageRequestDTO;
import com.dq.aqaranth.domain.todo.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Log4j2
class TodoServiceTest {

    @Autowired
    TodoService todoService;

    @Test
    void listPage() {
        PageRequestDTO pageRequestDTO = PageRequestDTO
                .builder()
                .page(1)
                .size(10)
                .build();
        List<TodoDTO> listPage = todoService.listPage(pageRequestDTO).getDtoList();
        listPage.forEach(log::info);
    }
}
