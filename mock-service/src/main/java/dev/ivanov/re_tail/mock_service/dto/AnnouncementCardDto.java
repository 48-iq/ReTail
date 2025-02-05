package dev.ivanov.re_tail.mock_service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AnnouncementCardDto {
    private String id;
    private String title;
    private Double price;
    private Boolean inFavorites;
    private CategoryInfoDto category;
    private SubcategoryDto subcategory;
    private String image;
    private UserInfoDto creator;

    @Getter
    @JsonIgnore
    private static List<AnnouncementCardDto> examples;

    static {

    }


}
