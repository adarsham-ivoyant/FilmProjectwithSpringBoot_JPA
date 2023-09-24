package com.ivoyant.Film.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="film_info")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Films {
    @Id
    private int film_id;
    private String film_name;
    private String director;
    private int budget;
}
