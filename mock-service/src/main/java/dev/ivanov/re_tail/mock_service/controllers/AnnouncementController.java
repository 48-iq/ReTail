package dev.ivanov.re_tail.mock_service.controllers;

import dev.ivanov.re_tail.mock_service.dto.AnnouncementCardDto;
import dev.ivanov.re_tail.mock_service.dto.AnnouncementDto;
import dev.ivanov.re_tail.mock_service.dto.PageDto;
import dev.ivanov.re_tail.mock_service.examples.AnnouncementCardDtoExamples;
import dev.ivanov.re_tail.mock_service.examples.AnnouncementDtoExamples;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/announcement")
public class AnnouncementController {

    @GetMapping("/find")
    public ResponseEntity<PageDto<AnnouncementCardDto>> findAnnouncementCards(@RequestParam(required = false) String query,
                                                                             @RequestParam Integer page,
                                                                             @RequestParam Integer size,
                                                                             @RequestParam(required = false) String category,
                                                                             @RequestParam(required = false) String subcategory) {

        List<AnnouncementCardDto> allData = AnnouncementCardDtoExamples.examples
                .stream()
                .filter(card -> category == null || category.isEmpty() || card.getCategory().getId().equals(category))
                .filter(card -> subcategory == null || subcategory.isEmpty() || card.getSubcategory().getId().equals(subcategory))
                .filter(card -> query == null || query.isEmpty() || card.getTitle().contains(query) || ("#" + card.getId()).equals(query))
                .toList();

        return ResponseEntity.ok(PageDto.<AnnouncementCardDto>builder()
                .page(page)
                .size(size)
                .total(allData.size() / size + (allData.size() % size == 0 ? 0 : 1))
                .data(allData.stream().skip(page * size).limit(size).toList())
                .build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnnouncementDto> getAnnouncement(@PathVariable String id) {
        return ResponseEntity.ok(
                AnnouncementDtoExamples.examples.stream()
                        .filter(dto -> dto.getId().equals(id))
                        .findFirst()
                        .get()
        );
    }

}
