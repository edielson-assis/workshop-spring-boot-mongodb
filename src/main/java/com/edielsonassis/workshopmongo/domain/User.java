package com.edielsonassis.workshopmongo.domain;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Entity
public class User implements Serializable {
    
    //@Id
    private String id;
    private String name;
    private String email;
}