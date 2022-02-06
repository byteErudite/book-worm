package com.vaibhav.bookworm.command.api.models;

import lombok.Builder;
import lombok.Data;

import java.util.UUID;

@Data
@Builder
public class Book {
    private UUID bookId;
    private String title;
    private String author;
    private String publication;
    private String edition;
}
