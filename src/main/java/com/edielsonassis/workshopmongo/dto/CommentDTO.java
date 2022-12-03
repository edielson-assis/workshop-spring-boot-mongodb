package com.edielsonassis.workshopmongo.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO implements Serializable {
    
    private String text;
    private Date date;
    private AuthorDTO author;
}