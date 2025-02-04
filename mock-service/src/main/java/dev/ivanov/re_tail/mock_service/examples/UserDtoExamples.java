package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.UserDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class UserDtoExamples {
    public static UserDto user1 = UserDto.builder()
            .id(IdService.generate())
            .nickname("user1")
            .name("Иван")
            .surname("Иванов")
            .address("г. Москва, ул. Пушкина, д. 17")
            .aboutMe("О себе 1")
            .contacts(List.of(ContactDtoExamples.phone, ContactDtoExamples.email))
            .avatar("https://img.freepik.com/free-vector/man-with-hand-up-icon_24877-81630.jpg")
            .rating(5.0)
            .announcementCount(4)
            .registeredAt("2020-01-01")
            .build();
    public static UserDto user2 = UserDto.builder()
            .id(IdService.generate())
            .nickname("user2")
            .name("Петр")
            .surname("Петров")
            .address("г. Москва, ул. Совхозная, д. 12")
            .aboutMe("О себе 2")
            .contacts(List.of(ContactDtoExamples.telegram, ContactDtoExamples.email))
            .avatar("https://img.freepik.com/free-vector/man-with-hand-up-icon_24877-81630.jpg")
            .rating(4.5)
            .announcementCount(5)
            .build();
    public static UserDto user3 = UserDto.builder()
            .id(IdService.generate())
            .nickname("user3")
            .name("Дмитрий")
            .surname("Дмитриев")
            .address("г. Москва, ул. Тополиная, д. 13")
            .aboutMe("О себе 3")
            .contacts(List.of(ContactDtoExamples.phone, ContactDtoExamples.email, ContactDtoExamples.telegram))
            .avatar("https://img.freepik.com/free-vector/man-with-hand-up-icon_24877-81630.jpg")
            .rating(3.8)
            .announcementCount(3)
            .build();

    public static List<UserDto> examples = List.of(user1, user2, user3);
}
