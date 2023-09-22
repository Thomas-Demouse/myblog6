package com.blopapi.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private long id;

    @NotEmpty
    @Size(min=2, message="Title should have atleast two characters")
    private String title;

    @NotEmpty(message="Description is empty")
    @Size(min=4, message="Description should have atleast four characters")
    private String description;

    @NotEmpty(message="Content is empty")
    private String content;
}
