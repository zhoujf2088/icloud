package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloud.cases.entity.ApplicantEntity;
/**
 * 
 * @author ZhouJF
 * @date 2016年5月31日 上午11:26:50
 */
public interface ApplicantRepository extends JpaRepository<ApplicantEntity, Integer> {
	
	

}
