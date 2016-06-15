package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.UnitEntity;

public interface UnitRepository extends JpaRepository<UnitEntity, Integer> {

}
