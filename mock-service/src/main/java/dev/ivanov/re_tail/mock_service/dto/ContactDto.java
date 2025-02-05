package dev.ivanov.re_tail.mock_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.ivanov.re_tail.mock_service.services.IdService;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ContactDto {
    private String id;
    private String contact;

    @JsonIgnore
    @Getter
    private static List<ContactDto> examples;
}
