package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.LitigationFileEntity;

public interface LitigationFileRepository extends JpaRepository<LitigationFileEntity, Integer> {

}