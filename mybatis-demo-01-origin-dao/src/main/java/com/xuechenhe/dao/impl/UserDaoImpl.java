package com.xuechenhe.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.xuechenhe.dao.UserDao;
import com.xuechenhe.pojo.User;

public class UserDaoImpl implements UserDao {
	private SqlSessionFactory sqlSessionFactory;

	public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
		super();
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public User queryUserById(int id) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		// 执行查询逻辑
		User user = sqlSession.selectOne("queryUserById", id);
		// 释放资源
		sqlSession.close();

		return user;
	}

	public List<User> queryUserByUsername1(String username) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();

		// 执行查询逻辑
		List<User> list = sqlSession.selectList("queryUserByUsername1", username);
		// 释放资源
		sqlSession.close();
		return list;
	}

	public List<User> queryUserByUsername2(String username) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();

		// 执行查询逻辑
		List<User> list = sqlSession.selectList("queryUserByUsername2", username);
		// 释放资源
		sqlSession.close();
		return list;
	}

	public List<User> queryUserByUsername3(User user) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();

		// 执行查询逻辑
		List<User> list = sqlSession.selectList("queryUserByUsername3", user);
		// 释放资源
		sqlSession.close();
		return list;
	}

	public int saveUser(User user) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();

		// 执行保存逻辑
		int insert = sqlSession.insert("saveUser", user);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		return insert;
	}

	public int saveUser2(User user) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();

		// 执行保存逻辑
		int insert = sqlSession.insert("saveUser2", user);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		return insert;
	}

	public int updateUserByUser(User user) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		int update = sqlSession.update("updateUserByUser", user);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		return update;
	}

	public int deleteUserById(int id) {
		// 创建SqlSession
		SqlSession sqlSession = this.sqlSessionFactory.openSession();
		int delete = sqlSession.delete("deleteUserById", id);
		// 提交事务
		sqlSession.commit();
		// 释放资源
		sqlSession.close();
		return delete;
	}

}
