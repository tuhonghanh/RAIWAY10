CREATE DATABASE IF NOT EXISTS Testing_system_assignment_1;
USE Testing_system_assignment_1;

CREATE TABLE department (
	department_id	INT PRIMARY KEY AUTO_INCREMENT,
	department_name	VARCHAR(50)
);

CREATE TABLE `position` (
    position_id		INT PRIMARY KEY AUTO_INCREMENT,
    position_name	VARCHAR(50)
);

CREATE TABLE `account` (
	account_id		INT PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(50),
	username		VARCHAR(50),
    full_name		VARCHAR(50),
    department_id	INT,
    position_id		INT,
    creat_date		DATE
);

CREATE TABLE `group` (
	group_id	INT PRIMARY KEY AUTO_INCREMENT,
    group_name	VARCHAR(50),
    creator_id	INT,
    create_date	DATE
);

CREATE TABLE group_account (
	group_id	INT,
    account_id	INT,
    join_date	DATE
);

CREATE TABLE type_question (
	type_id		INT PRIMARY KEY AUTO_INCREMENT,
    type_name	VARCHAR(50)
);

CREATE TABLE category_question (
	category_id		INT PRIMARY KEY AUTO_INCREMENT,
    category_name	VARCHAR(50)
);  
CREATE TABLE question (
	question_id		INT PRIMARY KEY AUTO_INCREMENT,
    content			VARCHAR(50),
    category_id		INT,
    type_id			INT,
    creator_id		INT,
    create_date		DATE
);

CREATE TABLE answer (
	answer_id	INT PRIMARY KEY AUTO_INCREMENT,
    content		VARCHAR(50),
    question_id	INT,
    is_correct	VARCHAR(50)
);

CREATE TABLE exam (
	exam_id		INT PRIMARY KEY AUTO_INCREMENT,
    `code`		VARCHAR(50),
    title		VARCHAR(50),
    category_id INT,
    duration	INT,
    creator_id	INT,
    create_date DATE
);

CREATE TABLE exam_question (
	exam_id		INT,
    question_id INT
);