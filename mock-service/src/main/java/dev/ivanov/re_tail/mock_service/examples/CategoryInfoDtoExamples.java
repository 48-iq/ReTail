package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.CategoryInfoDto;

import java.util.List;

public class CategoryInfoDtoExamples {

    public static CategoryInfoDto tools = CategoryInfoDto.builder()
            .id(CategoryDtoExamples.tools.getId())
            .name(CategoryDtoExamples.tools.getName())
            .build();
    public static CategoryInfoDto pcAccessories = CategoryInfoDto.builder()
            .id(CategoryDtoExamples.pcAccessories.getId())
            .name(CategoryDtoExamples.pcAccessories.getName())
            .build();
    public static CategoryInfoDto electronics = CategoryInfoDto.builder()
            .id(CategoryDtoExamples.electronics.getId())
            .name(CategoryDtoExamples.electronics.getName())
            .build();

    public static List<CategoryInfoDto> examples = List.of(tools, pcAccessories, electronics);
}
