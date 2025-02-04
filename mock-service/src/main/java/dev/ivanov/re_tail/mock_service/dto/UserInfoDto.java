package dev.ivanov.re_tail.mock_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserInfoDto {
    private String id;
    private String avatar;
    private String nickname;
    private Double rating;

}
