package com.web.service.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.web.common.MyBatisConfig;
import com.web.dao.UserInfoDAO;
import com.web.dao.impl.UserInfoDAOImpl;
import com.web.service.UserInfoService;
import com.web.vo.UserInfoVO;

public class UserInfoServiceImpl implements UserInfoService {
	private UserInfoDAO uiDAO = new UserInfoDAOImpl();
	@Override
	public List<UserInfoVO> selectUserInfoList(UserInfoVO user) {
		try(SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()){
			return uiDAO.selectUserInfoList(session, user);
		}
	}

	@Override
	public UserInfoVO selectUserInfo(int uiNum) {
		try(SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()){
			return uiDAO.selectUserInfo(session, uiNum);
		}
	}

	@Override
	public int insertUserInfo(UserInfoVO user) {
		try(SqlSession session = MyBatisConfig.getSqlSessionFactory().openSession()){
			return uiDAO.insertUserInfo(session, user);
		}
	}

	@Override
	public int updateUserInfo(UserInfoVO user) {
		return 0;
	}

	@Override
	public int deleteUserInfo(int uiNum) {
		return 0;
	}

}
