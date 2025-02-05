package dev.ivanov.re_tail.mock_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CharacteristicDto {
    private String id;
    private String name;
    private String value;
}
