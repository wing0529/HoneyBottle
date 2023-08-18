package com.likelion.honeyBottle.repository;

import com.likelion.honeyBottle.domain.Place;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaceRepository extends JpaRepository<Place, Long> {
}
