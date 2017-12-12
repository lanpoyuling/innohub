package com.xuechenhe.test;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import com.xuechenhe.pojo.Student;

/**
 * @author Administrator
 *
 */
public class StudentTest {
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
    public void testSaveStudent() {
    	// 4. 创建SqlSession对象
    	SqlSession sqlSession = sqlSessionFactory.openSession();
    	
    	// 5. 执行SqlSession对象执行保存
    	// 创建需要保存的User
    	Student stu = new Student();
    	stu.setStuName("Axe");
    	sqlSession.insert("saveStudent", stu);
    	System.err.println(stu);
    	// 需要进行事务提交
    	sqlSession.commit();
    	
    	// 7. 释放资源
    	sqlSession.close();
    }
    
   
 
}
