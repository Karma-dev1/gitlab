package org.example.repository;

import org.example.model.entity.RentAMovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RentAMovieRepository extends JpaRepository <RentAMovieEntity, Long>{
}
