package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.CharacteristicDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class CharacteristicDtoExamples {

    public static CharacteristicDto color = CharacteristicDto.builder()
            .id(IdService.generate())
            .name("цвет")
            .value("синий")
            .build();

    public static CharacteristicDto size = CharacteristicDto.builder()
            .id(IdService.generate())
            .name("размер")
            .value("42")
            .build();

    public static CharacteristicDto material = CharacteristicDto.builder()
            .id(IdService.generate())
            .name("материал")
            .value("алюминий")
            .build();

    public static CharacteristicDto weight = CharacteristicDto.builder()
            .id(IdService.generate())
            .name("вес")
            .value("1.5")
            .build();

    public static List<CharacteristicDto> examples = List.of(color, size, material, weight);
}
