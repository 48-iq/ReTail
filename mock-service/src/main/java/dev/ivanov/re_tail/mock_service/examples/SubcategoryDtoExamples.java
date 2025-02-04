package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.SubcategoryDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class SubcategoryDtoExamples {
    public static SubcategoryDto drill = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("дрель")
            .build();
    public static SubcategoryDto  hammer = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("молоток")
            .build();
    public static SubcategoryDto  saw = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("пила")
            .build();

    public static SubcategoryDto monitor = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("монитор")
            .build();
    public static SubcategoryDto keyboard = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("клавиатура")
            .build();
    public static SubcategoryDto mouse = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("мышь")
            .build();

    public static SubcategoryDto phone = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("телефон")
            .build();
    public static SubcategoryDto tv = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("тв")
            .build();
    public static SubcategoryDto laptop = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("ноутбук")
            .build();
    public static SubcategoryDto pc = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("пк")
            .build();
    public static SubcategoryDto printer = SubcategoryDto.builder()
            .id(IdService.generate())
            .name("принтер")
            .build();

    public static List<SubcategoryDto> examples = List.of(drill, hammer, saw, monitor, keyboard, mouse, phone, tv, laptop, pc, printer);
}
