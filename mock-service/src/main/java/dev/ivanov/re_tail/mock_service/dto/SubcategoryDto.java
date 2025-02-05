package dev.ivanov.re_tail.mock_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubcategoryDto {
    private String id;
    private String name;
}
