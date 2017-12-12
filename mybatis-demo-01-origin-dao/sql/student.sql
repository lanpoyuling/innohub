drop database if EXISTS mybatis;
create DATABASE mybatis;
USE mybatis;
DROP TABLE IF EXISTS student;
CREATE TABLE student (
  id varchar(36) NOT NULL,
  stu_name varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

