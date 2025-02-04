package dev.ivanov.re_tail.mock_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PageDto<T> {
    private Integer page;
    private Integer size;
    private Integer total;
    private List<T> data;
}
