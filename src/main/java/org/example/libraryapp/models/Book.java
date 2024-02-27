package org.example.libraryapp.models;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.libraryapp.dto.BookDTO;

import java.util.Date;
import java.util.List;


@Data
@Entity
@NoArgsConstructor
public class Book {

    public Book(BookDTO book) {
        this.title = book.title();
        this.author = book.author();
        this.genre = book.genre();
        this.releaseDate = book.releaseDate();
        this.series = book.series();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String title;


    @ElementCollection
    private List<String> author;

    @ElementCollection
    private List<String> genre;

    @Column
    private Date releaseDate;

    @Column
    private String series;

}
