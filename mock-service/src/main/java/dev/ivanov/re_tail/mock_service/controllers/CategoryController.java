package dev.ivanov.re_tail.mock_service.controllers;

import dev.ivanov.re_tail.mock_service.dto.CategoryDto;
import dev.ivanov.re_tail.mock_service.dto.CategoryInfoDto;
import dev.ivanov.re_tail.mock_service.dto.SubcategoryDto;
import dev.ivanov.re_tail.mock_service.examples.CategoryDtoExamples;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<List<CategoryDto>> getAllCategories() {
        return ResponseEntity.ok(CategoryDtoExamples.examples);
    }
}
