package dev.ivanov.re_tail.mock_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.ivanov.re_tail.mock_service.examples.CharacteristicDtoExamples;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnnouncementDto {
    private String id;
    private String title;
    private String description;
    private CategoryInfoDto category;
    private SubcategoryDto subcategory;
    private List<String> images;
    private Double price;
    private String address;
    private UserInfoDto creator;
    private String createdAt;
    private List<ContactDto> contacts;
    private Boolean inFavorites;
    private List<CharacteristicDto> characteristics;
    private List<AnnouncementCardDto> sameAnnouncements;

}
