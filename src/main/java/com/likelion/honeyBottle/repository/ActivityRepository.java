package com.likelion.honeyBottle.repository;

import com.likelion.honeyBottle.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
