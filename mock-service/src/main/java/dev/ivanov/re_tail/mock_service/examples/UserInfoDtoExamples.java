package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.UserInfoDto;

import java.util.List;

public class UserInfoDtoExamples {
    public static UserInfoDto userInfo1 = UserInfoDto.builder()
            .id(UserDtoExamples.user1.getId())
            .avatar(UserDtoExamples.user1.getAvatar())
            .nickname(UserDtoExamples.user1.getNickname())
            .rating(UserDtoExamples.user1.getRating())
            .build();
    public static UserInfoDto userInfo2 = UserInfoDto.builder()
            .id(UserDtoExamples.user2.getId())
            .avatar(UserDtoExamples.user2.getAvatar())
            .nickname(UserDtoExamples.user2.getNickname())
            .rating(UserDtoExamples.user2.getRating())
            .build();
    public static UserInfoDto userInfo3 = UserInfoDto.builder()
            .id(UserDtoExamples.user3.getId())
            .avatar(UserDtoExamples.user3.getAvatar())
            .nickname(UserDtoExamples.user3.getNickname())
            .rating(UserDtoExamples.user3.getRating())
            .build();

    public static List<UserInfoDto> examples = List.of(userInfo1, userInfo2, userInfo3);
}
