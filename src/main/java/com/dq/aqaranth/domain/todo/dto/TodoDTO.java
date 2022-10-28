package com.dq.aqaranth.domain.todo.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TodoDTO {

    private Integer tno;
    private String title, memo;
    private LocalDateTime regDate, modDate;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;
    private Boolean complete;
}
