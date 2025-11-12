package com.ulco.ecommerce.repository.entities;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import jakarta.persistence.*;
import lombok.*;


@Table(name="category")
@Builder
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    //comm

    @JsonAnyGetter
    @JsonAnySetter
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique=true , length = 100)
    private String name;


}
