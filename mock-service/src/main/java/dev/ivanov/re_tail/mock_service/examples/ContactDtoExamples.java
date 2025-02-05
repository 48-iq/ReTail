package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.ContactDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class ContactDtoExamples {
    public static ContactDto telegram = ContactDto.builder()
            .id(IdService.generate())
            .contact("телеграм @re_tail")
            .build();

    public static ContactDto phone = ContactDto.builder()
            .id(IdService.generate())
            .contact("телефон: +7 999 999 99 99")
            .build();

    public static ContactDto email = ContactDto.builder()
            .id(IdService.generate())
            .contact("email: 0DkZM@example.com")
            .build();

    public static List<ContactDto> examples = List.of(telegram, phone, email);
}
