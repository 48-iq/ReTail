package dev.ivanov.re_tail.mock_service.examples;

import dev.ivanov.re_tail.mock_service.dto.AnnouncementDto;
import dev.ivanov.re_tail.mock_service.services.IdService;

import java.util.List;

public class AnnouncementDtoExamples {

    public static AnnouncementDto announcement1 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 1")
            .description("тестовое описание 1")
            .price(100.0)
            .address("г. Москва, ул. Тестовая, д. 1")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo1)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.tools)
            .subcategory(SubcategoryDtoExamples.drill)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement2 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 2")
            .description("тестовое описание 2")
            .price(200.0)
            .address("г. Москва, ул. Тестовая, д. 2")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo2)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.phone)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement3 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 3")
            .description("тестовое описание 3")
            .price(300.0)
            .address("г. Москва, ул. Тестовая, д. 3")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo3)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.pcAccessories)
            .subcategory(SubcategoryDtoExamples.keyboard)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement4 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 4")
            .description("тестовое описание 4")
            .price(400.0)
            .address("г. Москва, ул. Тестовая, д. 4")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo1)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.phone)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement5 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 5")
            .description("тестовое описание 5")
            .price(500.0)
            .address("г. Москва, ул. Тестовая, д. 5")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo2)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.pcAccessories)
            .subcategory(SubcategoryDtoExamples.keyboard)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement6 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 6")
            .description("тестовое описание 6")
            .price(600.0)
            .address("г. Москва, ул. Тестовая, д. 6")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo3)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.phone)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement7 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 7")
            .description("тестовое описание 7")
            .price(700.0)
            .address("г. Москва, ул. Тестовая, д. 7")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo1)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.pcAccessories)
            .subcategory(SubcategoryDtoExamples.keyboard)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement8 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 8")
            .description("тестовое описание 8")
            .price(800.0)
            .address("г. Москва, ул. Тестовая, д. 8")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo2)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.phone)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement9 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 9")
            .description("тестовое описание 9")
            .price(900.0)
            .address("г. Москва, ул. Тестовая, д. 9")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo3)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.tools)
            .subcategory(SubcategoryDtoExamples.saw)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement10 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 10")
            .description("тестовое описание 10")
            .price(1000.0)
            .address("г. Москва, ул. Тестовая, д. 10")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo1)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.printer)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement11 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 11")
            .description("тестовое описание 11")
            .price(1100.0)
            .address("г. Москва, ул. Тестовая, д. 11")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo2)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.tools)
            .subcategory(SubcategoryDtoExamples.saw)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static AnnouncementDto announcement12 = AnnouncementDto.builder()
            .id(IdService.generate())
            .title("тестовое объявление 12")
            .description("тестовое описание 12")
            .price(1200.0)
            .address("г. Москва, ул. Тестовая, д. 12")
            .contacts(ContactDtoExamples.examples)
            .creator(UserInfoDtoExamples.userInfo3)
            .images(List.of("https://pervomayskoe-sp74.ru/novosti/obyavlenie-5/image",
                    "https://png.pngtree.com/thumb_back/fw800/background/20230610/pngtree-picture-of-a-blue-bird-on-a-black-background-image_2937385.jpg",
                    "https://opis-cdn.tinkoffjournal.ru/mercury/midjourney-tips-26.jwbfyih7va97..jpg"))
            .category(CategoryInfoDtoExamples.electronics)
            .subcategory(SubcategoryDtoExamples.printer)
            .inFavorites(false)
            .characteristics(CharacteristicDtoExamples.examples)
            .sameAnnouncements(List.of())
            .createdAt("2020-01-01")
            .build();

    public static List<AnnouncementDto> examples = List.of(announcement1, announcement2, announcement3, announcement4,
            announcement5, announcement6, announcement7, announcement8, announcement9, announcement10, announcement11,
            announcement12);
}
