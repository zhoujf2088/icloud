package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.AppointmentEntity;

public interface AppointmentRepository extends JpaRepository<AppointmentEntity, Integer> {

}
