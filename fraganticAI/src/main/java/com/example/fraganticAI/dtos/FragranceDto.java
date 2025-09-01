package com.example.fraganticAI.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FragranceDto {
    private String url;
    private String perfume;
    private String brand;
    private String country;
    private String gender;
    private String ratingValue;
    private Long ratingCount;
    private String year;
    private String top;
    private String middle;
    private String base;
    private String perfumer1;
    private String perfumer2;
    private String mainaccord1;
    private String mainaccord2;
    private String mainaccord3;
    private String mainaccord4;
    private String mainaccord5;
}
