package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.AgentEntity;

public interface AgentRepository extends JpaRepository<AgentEntity, Integer> {

}
