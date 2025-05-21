package com.vaishnavi.practice.spring.boot.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Training {

    private int id;
    private String name;
    private int duration;
    private String prerequisite;
}


