package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class TheCity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Integer area;
    private Integer population;
    private Integer gdp;
    private String description;
    @ManyToOne
    @JoinColumn(name = "country_id",nullable = false)
    private Country country;
}
