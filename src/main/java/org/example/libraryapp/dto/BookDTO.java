package org.example.libraryapp.dto;

import java.util.Date;
import java.util.List;

public record BookDTO(
        String title,
        List<String> author,
        List<String> genre,
        Date releaseDate,
        String series
) {
}
