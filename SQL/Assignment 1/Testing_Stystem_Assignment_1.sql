CREATE DATABASE IF NOT EXISTS testing_system_assignment_1;
USE testing_system_assignment_1;

CREATE TABLE department(
	department_id INT PRIMARY KEY AUTO_INCREMENT,
    -- day la ten phong ban kieu du lieu varchar
	department_name VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS `position`(
    position_id INT PRIMARY KEY AUTO_INCREMENT,
    -- auto increment dinh dang so tang dan
    position_name VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS Account (
	account_id INT PRIMARY KEY AUTO_INCREMENT,
	email VARCHAR(50),
	username VARCHAR(50),
    full_name VARCHAR(50),
    department_id INT,
    position_id INT,
    creat_date DATE
);
CREATE TABLE IF NOT EXISTS `Group`(
	group_id INT PRIMARY KEY AUTO_INCREMENT,
    group_name VARCHAR(50),
    creator_id INT,
    create_date DATE
);
CREATE TABLE IF NOT EXISTS group_account (
	group_id INT,
    account_id INT,
    join_date DATE
);
CREATE TABLE IF NOT EXISTS type_question (
	type_id INT PRIMARY KEY AUTO_INCREMENT,
    type_name VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS category_question(
	category_id INT PRIMARY KEY AUTO_INCREMENT,
    category_name VARCHAR(50)
);  
CREATE TABLE IF NOT EXISTS question(
	question_id INT PRIMARY KEY AUTO_INCREMENT,
    content VARCHAR(50),
    category_id INT,
    type_id INT,
    creator_id INT,
    create_date DATE
);
CREATE TABLE IF NOT EXISTS Answer (
	Answer_id INT PRIMARY KEY AUTO_INCREMENT,
    Content VARCHAR(50),
    Question_id INT,
    is_Correct VARCHAR(50)
);
CREATE TABLE IF NOT EXISTS exam (
	exam_id INT PRIMARY KEY AUTO_INCREMENT,
    `code` VARCHAR(50),
    title VARCHAR(50),
    category_id INT,
    Duration INT,
    creator_id INT,
    create_date DATE
);
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id INT,
    question_id INT
);