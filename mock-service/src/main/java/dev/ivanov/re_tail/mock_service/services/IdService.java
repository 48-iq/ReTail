package dev.ivanov.re_tail.mock_service.services;

import java.util.UUID;

public class IdService {
    public static String generate() {
        return String.valueOf(Math.abs(UUID.randomUUID().getLeastSignificantBits()));
    }
}
