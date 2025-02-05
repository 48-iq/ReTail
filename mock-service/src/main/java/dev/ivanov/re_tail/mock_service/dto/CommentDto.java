package dev.ivanov.re_tail.mock_service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CommentDto {
    private String id;
    private String comment;
    private Integer rating;
    private UserInfoDto creator;
    private String createdAt;
}
