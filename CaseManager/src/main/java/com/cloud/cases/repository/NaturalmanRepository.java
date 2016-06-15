package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.NaturalmanEntity;

public interface NaturalmanRepository extends JpaRepository<NaturalmanEntity, Integer> {

}
