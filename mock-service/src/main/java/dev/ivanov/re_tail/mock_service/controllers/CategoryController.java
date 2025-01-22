package dev.ivanov.re_tail.mock_service.controllers;

import dev.ivanov.re_tail.mock_service.dto.CategoryDto;
import dev.ivanov.re_tail.mock_service.dto.SubcategoryDto;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {
    @GetMapping("/all")
    public List<CategoryDto> getAllCategories() {
        SubcategoryDto drill = SubcategoryDto.builder().id("drill").name("drill").build();
        SubcategoryDto  hammer = SubcategoryDto.builder().id("hammer").name("hammer").build();
        SubcategoryDto  saw = SubcategoryDto.builder().id("saw").name("saw").build();

        SubcategoryDto monitor = SubcategoryDto.builder().id("monitor").name("monitor").build();
        SubcategoryDto keyboard = SubcategoryDto.builder().id("keyboard").name("keyboard").build();
        SubcategoryDto mouse = SubcategoryDto.builder().id("mouse").name("mouse").build();

        SubcategoryDto phone = SubcategoryDto.builder().id("phone").name("phone").build();
        SubcategoryDto tv = SubcategoryDto.builder().id("tv").name("tv").build();
        SubcategoryDto laptop = SubcategoryDto.builder().id("laptop").name("laptop").build();
        SubcategoryDto pc = SubcategoryDto.builder().id("pc").name("pc").build();
        SubcategoryDto printer = SubcategoryDto.builder().id("printer").name("printer").build();

        CategoryDto tools = CategoryDto.builder().id("tools").name("tools").subcategories(List.of(drill, hammer, saw)).build();
        CategoryDto pcAccessories = CategoryDto.builder().id("pc_accessories").name("pc_accessories").subcategories(List.of(monitor, keyboard, mouse)).build();
        CategoryDto electronics = CategoryDto.builder().id("electronics").name("electronics").subcategories(List.of(phone, tv, laptop, pc, printer)).build();

        return List.of(tools, pcAccessories, electronics);
    }
}
