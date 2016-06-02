package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.ModuleInfoEntity;

public interface ModuleRepository extends JpaRepository<ModuleInfoEntity, Integer>{

}
