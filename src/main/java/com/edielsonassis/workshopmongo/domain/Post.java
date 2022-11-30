package com.edielsonassis.workshopmongo.domain;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.edielsonassis.workshopmongo.dto.AuthorDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Post implements Serializable {
    
    @Id
    private String id;
    private Date date;
    private String title;
    private String body;

    private AuthorDTO author;
}