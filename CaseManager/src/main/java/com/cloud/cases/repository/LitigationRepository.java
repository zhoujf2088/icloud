package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.LitigationEntity;

public interface LitigationRepository extends JpaRepository<LitigationEntity, Integer> {

}
