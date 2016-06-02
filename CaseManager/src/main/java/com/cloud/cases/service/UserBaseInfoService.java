package com.cloud.cases.service;

import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloud.cases.CloudContext;
import com.cloud.cases.entity.UserBaseInfoEntity;
import com.cloud.cases.repository.UserBaseInfoRepository;
import com.cloud.cases.util.StringUtil;
import com.cloud.cases.vo.UserBaseInfoVO;

@Service("UserBaseInfoService")
public class UserBaseInfoService {
	
@Autowired
private UserBaseInfoRepository userInfoRepository;

@Transactional
public void saveUserBaseInfoEntity(CloudContext<UserBaseInfoVO> cloudContext) {
	UserBaseInfoVO userVO= cloudContext.getVO();
	UserBaseInfoEntity userBaseInfo= new UserBaseInfoEntity();
	BeanUtils.copyProperties(userVO, userBaseInfo);
	userBaseInfo.setCreatedate(new Date());
	userBaseInfo.setPassword(StringUtil.encrypt(userVO.getUsername(), userVO.getPassword()));
	userInfoRepository.save(userBaseInfo);
}
}
