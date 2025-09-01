package com.example.fraganticAI.models;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.UUID;

@Entity
@Table(name = "fragrance")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Fragrance {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id; // DB default: gen_random_uuid()

    @Column(name = "url")
    private String url;

    @Column(name = "Perfume")
    private String perfume;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Country")
    private String country;

    @Column(name = "Gender")
    private String gender;

    @Column(name = "\"Rating Value\"")
    private String ratingValue;

    @Column(name = "\"Rating Count\"")
    private Long ratingCount;

    @Column(name = "Year")
    private String year;

    @Column(name = "Top")
    private String top;

    @Column(name = "Middle")
    private String middle;

    @Column(name = "Base")
    private String base;

    @Column(name = "Perfumer1")
    private String perfumer1;

    @Column(name = "Perfumer2")
    private String perfumer2;

    @Column(name = "mainaccord1")
    private String mainaccord1;

    @Column(name = "mainaccord2")
    private String mainaccord2;

    @Column(name = "mainaccord3")
    private String mainaccord3;

    @Column(name = "mainaccord4")
    private String mainaccord4;

    @Column(name = "mainaccord5")
    private String mainaccord5;


}
