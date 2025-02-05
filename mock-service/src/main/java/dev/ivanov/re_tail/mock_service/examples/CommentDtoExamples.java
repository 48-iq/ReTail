package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.CommentDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class CommentDtoExamples {

    public static CommentDto comment1 = CommentDto.builder()
            .id(IdService.generate())
            .rating(5)
            .comment("Комментарий 1")
            .creator(UserInfoDtoExamples.userInfo1)
            .createdAt("2020-01-01")
            .build();

    public static CommentDto comment2 = CommentDto.builder()
            .id(IdService.generate())
            .rating(4)
            .comment("Комментарий 2")
            .creator(UserInfoDtoExamples.userInfo2)
            .createdAt("2020-01-02")
            .build();

    public static CommentDto comment3 = CommentDto.builder()
            .id(IdService.generate())
            .rating(3)
            .comment("Комментарий 3")
            .creator(UserInfoDtoExamples.userInfo3)
            .createdAt("2020-01-03")
            .build();

    public static CommentDto comment4 = CommentDto.builder()
            .id(IdService.generate())
            .rating(2)
            .comment("Комментарий 4")
            .creator(UserInfoDtoExamples.userInfo1)
            .createdAt("2020-01-04")
            .build();

    public static CommentDto comment5 = CommentDto.builder()
            .id(IdService.generate())
            .rating(1)
            .comment("Комментарий 5")
            .creator(UserInfoDtoExamples.userInfo2)
            .createdAt("2020-01-05")
            .build();

    public static CommentDto comment6 = CommentDto.builder()
            .id(IdService.generate())
            .rating(5)
            .comment("Комментарий 6")
            .creator(UserInfoDtoExamples.userInfo3)
            .createdAt("2020-01-06")
            .build();

    public static CommentDto comment7 = CommentDto.builder()
            .id(IdService.generate())
            .rating(5)
            .comment("Комментарий 7")
            .creator(UserInfoDtoExamples.userInfo1)
            .createdAt("2020-01-07")
            .build();

    public static List<CommentDto> examples = List.of(comment1, comment2, comment3, comment4, comment5,
            comment6, comment7);
}
