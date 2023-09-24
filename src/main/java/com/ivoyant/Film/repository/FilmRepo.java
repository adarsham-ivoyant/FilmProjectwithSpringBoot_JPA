package com.ivoyant.Film.repository;

import com.ivoyant.Film.entity.Films;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepo extends JpaRepository<Films,Integer> {
}
