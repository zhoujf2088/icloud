package com.cloud.cases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cloud.cases.entity.UserBaseInfoEntity;

public interface UserBaseInfoRepository extends JpaRepository<UserBaseInfoEntity, Integer> {

	// 自定义查询 按名称的模糊查询
			@Query("SELECT u FROM UserBaseInfoEntity u WHERE u.username = ?1 and u.password = ?2")
			UserBaseInfoEntity findByUsernameAndPassword(String uname,String upassword); 
}
