drop database if EXISTS mybatis;
create DATABASE mybatis;
USE mybatis;
DROP TABLE IF EXISTS student;
CREATE TABLE student (
  id varchar(36) NOT NULL,
  stu_name varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS user;
CREATE TABLE user (
  id int(11) NOT NULL AUTO_INCREMENT,
  username varchar(32) NOT NULL COMMENT '用户名称',
  birthday datetime DEFAULT NULL COMMENT '生日',
  sex char(1) DEFAULT NULL COMMENT '性别',
  address varchar(256) DEFAULT NULL COMMENT '地址',
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;