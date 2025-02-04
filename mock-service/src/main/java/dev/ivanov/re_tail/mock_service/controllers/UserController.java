package dev.ivanov.re_tail.mock_service.controllers;

import dev.ivanov.re_tail.mock_service.dto.UserDto;
import dev.ivanov.re_tail.mock_service.dto.UserInfoDto;
import dev.ivanov.re_tail.mock_service.examples.UserDtoExamples;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getUser(@PathVariable String id) {
        return ResponseEntity.ok(
                UserDtoExamples.examples.stream()
                        .filter(dto -> dto.getId().equals(id))
                        .findFirst()
                        .get()
        );
    }
}
