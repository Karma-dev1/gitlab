package org.example.repository;

import org.example.model.entity.CinemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CinemaRepository  extends JpaRepository <CinemaEntity, Long> {
}
