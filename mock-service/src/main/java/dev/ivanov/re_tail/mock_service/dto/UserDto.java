package dev.ivanov.re_tail.mock_service.dto;

import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private String id;
    private String nickname;
    private String name;
    private String surname;
    private String address;
    private List<ContactDto> contacts;
    private String registeredAt;
    private String aboutMe;
    private String avatar;
    private Double rating;
    private Integer announcementCount;

    
}
