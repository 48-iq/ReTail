package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.CategoryDto;
import dev.ivanov.re_tail.mock_service.dto.SubcategoryDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class CategoryDtoExamples {
    public static CategoryDto tools = CategoryDto.builder()
            .id(IdService.generate())
            .name("инструменты")
            .subcategories(List.of(SubcategoryDtoExamples.saw, SubcategoryDtoExamples.drill, SubcategoryDtoExamples.hammer))
            .build();

    public static CategoryDto pcAccessories = CategoryDto.builder()
            .id(IdService.generate())
            .name("комплектующие пк")
            .subcategories(List.of(SubcategoryDtoExamples.mouse, SubcategoryDtoExamples.keyboard, SubcategoryDtoExamples.monitor))
            .build();

    public static CategoryDto electronics = CategoryDto.builder()
            .id(IdService.generate())
            .name("электроника")
            .subcategories(List.of(SubcategoryDtoExamples.phone, SubcategoryDtoExamples.tv, SubcategoryDtoExamples.laptop))
            .build();

    public static List<CategoryDto> examples = List.of(tools, pcAccessories, electronics);
}
