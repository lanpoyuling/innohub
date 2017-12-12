package com.xuechenhe.dao;

import java.util.List;

import com.xuechenhe.pojo.User;

public interface UserDao {
	
	/**
	 * 根据id查找用户
	 * @param id
	 * @return
	 */
	User queryUserById(int id);
	
	/**
	 * 根据用户名查找用户 
	 * 需要拼接 "%" 
	 * 使用占位符 #{}相当于jdbc中的?
	 * @param username
	 * @return
	 */
	List<User> queryUserByUsername1(String username);
	
	/**
	 * 根据用户名查找用户 
	 * 使用${}
	 * 有sql注入风险
	 * @param username 入参为基本数据类型  ${}里面必须写value
	 * @return
	 */
	List<User> queryUserByUsername2(String username);
	
	/**
	 * 根据用户名查找用户 
	 * 使用bind 
	 * @param username
	 * @return
	 */
	List<User>  queryUserByUsername3(User user);
	
	/**
	 * 保存用户
	 * @param user
	 * @return
	 */
	int saveUser(User user);
	
	/**
	 * 保存用户
	 * 使用selectkey 
	 *   select last_insert_id()
	 * 使用trim动态拼接sql
	 * @param user
	 * @return
	 */
	int saveUser2(User user);
	
	/**
	 * 更新用户 
	 * 
	 * @param user
	 * @return
	 */
	int updateUserByUser(User user);
	
	/**
	 * 删除用户
	 * @param id
	 * @return
	 */
	int deleteUserById(int id);
}
