package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.FunctionEntity;

public interface GuideDoucumentRepository extends JpaRepository<FunctionEntity, Integer> {

}