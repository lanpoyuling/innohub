package com.xuechenhe.test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xuechenhe.pojo.User;

/**
 * @author Administrator
 *
 */
public class MybatisTest {
	private SqlSessionFactory sqlSessionFactory = null;

	@Before
	public void init() throws Exception {
		// 1. 创建SqlSessionFactoryBuilder对象
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();

		// 2. 加载SqlMapConfig.xml配置文件
		InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

		// 3. 创建SqlSessionFactory对象
		this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
	}

	@Test
	public void testQueryUserById() throws Exception {
		// 4. 创建SqlSession对象
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 5. 执行SqlSession对象执行查询，获取结果User
		// 第一个参数是User.xml的statement的id，第二个参数是执行sql需要的参数；
		Object user = sqlSession.selectOne("queryUserById", 1);

		// 6. 打印结果
		System.out.println(user);

		// 7. 释放资源
		sqlSession.close();
	}
	@Deprecated
    @Test
    public void testQueryUserByUsername1() throws Exception {
       // 4. 创建SqlSession对象
       SqlSession sqlSession = sqlSessionFactory.openSession();
 
       // 5. 执行SqlSession对象执行查询，获取结果User
       // 查询多条数据使用selectList方法
       List<Object> list = sqlSession.selectList("queryUserByUsername1", "%A%");
 
       // 6. 打印结果
       for (Object user : list) {
           System.out.println(user);
       }
 
       // 7. 释放资源
       sqlSession.close();
    }
    
    @Test
    public void testQueryUserByUsername2() throws Exception {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
     
        // 5. 执行SqlSession对象执行查询，获取结果User
        // 查询多条数据使用selectList方法
        List<Object> list = sqlSession.selectList("queryUserByUsername2", "A");
     
        // 6. 打印结果
        for (Object user : list) {
           System.out.println(user);
        }
     
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testQueryUserByUsername3() throws Exception {
    	// 4. 创建SqlSession对象
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	
    	// 5. 执行SqlSession对象执行查询，获取结果User
    	// 查询多条数据使用selectList方法
    	User u = new User();
    	u.setUsername("A");
    	List<Object> list = sqlSession.selectList("queryUserByUsername3",u);
    	
    	// 6. 打印结果
    	for (Object user : list) {
    		System.out.println(user);
    	}
    	
    	// 7. 释放资源
    	sqlSession.close();
    }
    
    @Test
    public void testSaveUser() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
     
        // 5. 执行SqlSession对象执行保存
        // 创建需要保存的User
        User user = new User();
        user.setUsername("张飞");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");
     
        sqlSession.insert("saveUser", user);
        System.out.println(user);
     
        // 需要进行事务提交
        sqlSession.commit();
     
        // 7. 释放资源
        sqlSession.close();
    }
    @Test
    public void testSaveUser2() {
    	// 4. 创建SqlSession对象
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	
    	// 5. 执行SqlSession对象执行保存
    	// 创建需要保存的User
    	User user = new User();
    	user.setUsername("张飞");
    	user.setSex("1");
    	user.setBirthday(new Date());
    	user.setAddress("蜀国");
    	
    	sqlSession.insert("saveUser2", user);
    	System.out.println(user);
    	
    	// 需要进行事务提交
    	sqlSession.commit();
    	
    	// 7. 释放资源
    	sqlSession.close();
    }
    
    @Test
    public void testUpdateUserById() {
        // 4. 创建SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
     
        // 5. 执行SqlSession对象执行更新
        // 创建需要更新的User
        User user = new User();
        user.setId(5);
        user.setUsername("关羽");
        user.setSex("1");
        user.setBirthday(new Date());
        user.setAddress("蜀国");
     
        sqlSession.update("updateUserById", user);
     
        // 需要进行事务提交
        sqlSession.commit();
     
        // 7. 释放资源
        sqlSession.close();
    }
 
}
