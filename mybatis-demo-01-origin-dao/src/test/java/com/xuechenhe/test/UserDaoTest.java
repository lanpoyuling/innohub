package com.xuechenhe.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xuechenhe.dao.UserDao;
import com.xuechenhe.dao.impl.UserDaoImpl;
import com.xuechenhe.pojo.User;

public class UserDaoTest {
	private SqlSessionFactory sqlSessionFactory;
	 
    @Before
    public void init() throws Exception {
       // 创建SqlSessionFactoryBuilder
       SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
       // 加载SqlMapConfig.xml配置文件
       InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
       // 创建SqlsessionFactory
       this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }
    
    @Test
    public void testQueryUserById() {
       // 创建DAO
       UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
       // 执行查询
       User user = userDao.queryUserById(6);
       System.out.println(user);
    }
    @Test
    public void testQueryUserByUsername1() {
       // 创建DAO
 
       UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
       // 执行查询
       List<User> list = userDao.queryUserByUsername1("%张%");
       for (User user : list) {
           System.out.println(user);
       }
    }
    @Test
    public void testQueryUserByUsername2() {
    	// 创建DAO
    	
    	UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
    	// 执行查询
    	List<User> list = userDao.queryUserByUsername2("张");
    	for (User user : list) {
    		System.out.println(user);
    	}
    }
    @Test
    public void testQueryUserByUsername3() {
    	// 创建DAO
    	
    	UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
    	// 执行查询
    	User u = new User();
    	u.setUsername("张");
    	List<User> list = userDao.queryUserByUsername3(u);
    	for (User user : list) {
    		System.out.println(user);
    	}
    }
    
    @Test
    public void testSaveUser() {
       // 创建DAO
       UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
 
       // 创建保存对象
       User user = new User();
       user.setUsername("刘备");
       user.setBirthday(new Date());
       user.setSex("1");
       user.setAddress("蜀国");
       // 执行保存
       userDao.saveUser(user);
 
       System.out.println(user);
    }
    @Test
    public void testSaveUser2() {
    	// 创建DAO
    	UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
    	
    	// 创建保存对象
    	User user = new User();
    	user.setUsername("刘备");
    	user.setBirthday(new Date());
    	user.setSex("1");
    	user.setAddress("蜀国");
    	// 执行保存
    	userDao.saveUser2(user);
    	
    	System.out.println(user);
    }
    @Test
    public void testUpdateUserByUser() {
    	// 创建DAO
    	UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
    	
    	// 创建保存对象
    	User user = new User();
    	user.setUsername("刘备");
    	user.setBirthday(new Date());
    	user.setSex("1");
    	user.setAddress("蜀国");
    	user.setId(6);
    	// 执行保存
    	int updateUserByUser = userDao.updateUserByUser(user);
    	
    	System.out.println(updateUserByUser);
    }
    @Test
    public void testDeleteUserById() {
    	// 创建DAO
    	UserDao userDao = new UserDaoImpl(this.sqlSessionFactory);
    	 
    	// 执行保存
    	int delete = userDao.deleteUserById(6);
    	
    	System.out.println(delete);
    }
}
