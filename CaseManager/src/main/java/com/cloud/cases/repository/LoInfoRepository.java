package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.LogInfoEntity;

public interface LoInfoRepository extends JpaRepository<LogInfoEntity, Integer> {

}
