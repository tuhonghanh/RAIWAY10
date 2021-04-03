DROP DATABASE IF EXISTS Testing_system_assignment_1;
CREATE DATABASE IF NOT EXISTS Testing_system_assignment_1;
USE Testing_system_assignment_1;

DROP TABLE IF EXISTS department;
CREATE TABLE IF NOT EXISTS department (
	department_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	department_name	NVARCHAR(50) NOT NULL UNIQUE KEY
);
INSERT INTO department( department_id , department_name )
VALUES				  (		1		  ,    N'Sale'      ) ,
                      (		2		  ,    N'Marketing' ) ,
                      (		3		  ,    N'Hành chính') ,
					  (		4		  ,    N'Kế toán'   ) ,
					  (		5		  ,    N'Kỹ thuật'  ) ;
                      
DROP TABLE IF EXISTS `position`;
CREATE TABLE IF NOT EXISTS `position` (
    position_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    position_name	ENUM('Dev','Test','Scrum Master','PM') NOT NULL UNIQUE KEY
);
INSERT INTO `position`( position_id   , position_name    )
VALUES				  (		1		  ,    'Dev'         ), 
                      (		2		  ,    'Test'        ),
                      (		3		  ,   'Scrum Master' ),
					  (		4		  ,    'PM'          );

DROP TABLE IF EXISTS `account`;
CREATE TABLE IF NOT EXISTS `account` (
	account_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(50) NOT NULL UNIQUE KEY,
	username		VARCHAR(50) NOT NULL CHECK (LENGTH(username) >=6),
    full_name		NVARCHAR(50) NOT NULL,
    department_id	TINYINT UNSIGNED NOT NULL,
    position_id		TINYINT UNSIGNED NOT NULL,
    creat_date		DATETIME DEFAULT NOW(),
    FOREIGN KEY(department_id) REFERENCES department(department_id),
    FOREIGN KEY(position_id) REFERENCES `position`(position_id)
);
INSERT INTO `account` ( account_id,       email          ,  username   ,    full_name         , department_id  ,  position_id  , creat_date)	   
VALUES				  (		1	  , 'hanh12@gmail.com'   , 'honghanh'  , N'Từ Hồng Hạnh'      ,       5        ,      4        ,'2021-03-02'), 
                      (		2	  , 'hai345@gmail.com'   , 'bluesea345', N'Nguyễn Thanh Hải'  ,       1        ,      3        ,'2021-03-04'),
                      (		3	  , 'binh67@gmail.com'   , 'thanhbinh' , N'Bùi Thanh Bình'    ,       1        ,      1        ,'2021-03-03'),
					  (		4	  , 'hoang14@gmail.com'  , 'minhhoang' , N'Vũ Minh Hoàng'     ,       3        ,      2        ,'2021-03-07'),
					  (		5	  , 'ngan89@gmail.com'   , 'meocon12'  , N'Lưu Thuỳ Ngân'     ,       2        ,      2        ,'2021-03-08'),
					  (		6	  , 'mailan97@gmail.com' , 'lovelylan' , N'Hoàng Mai Lan'     ,       3        ,      3        ,'2021-03-05');

DROP TABLE IF EXISTS `group`;
CREATE TABLE IF NOT EXISTS `group` (
	group_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    group_name	NVARCHAR(50) NOT NULL UNIQUE KEY,
    creator_id	TINYINT UNSIGNED NOT NULL,
    create_date	DATETIME DEFAULT NOW()
);
INSERT INTO `group`( group_id   , group_name,  creator_id, create_date )
VALUES			   (	1		, N'Nhóm 1' ,      1     , '2021-04-12'), 
                   (	2		, N'Nhóm 2' ,      2     , '2021-04-13'),
                   (	3		, N'Nhóm 3' ,      3     , '2021-04-16'),
				   (	4		, N'Nhóm 4' ,      4     , '2021-04-19'),
				   (	5		, N'Nhóm 5' ,      5     , '2021-04-21');
                   
DROP TABLE IF EXISTS group_account;
CREATE TABLE IF NOT EXISTS group_account (
	group_id	TINYINT UNSIGNED NOT NULL,
    account_id	TINYINT UNSIGNED NOT NULL,
    join_date	DATETIME DEFAULT NOW(),
    FOREIGN KEY(group_id) REFERENCES `group`(group_id),
    FOREIGN KEY(account_id) REFERENCES `account`(account_id)
);
INSERT INTO group_account( group_id , account_id,  join_date )
VALUES			         (	1		,     6     , '2021-04-16'), 
                         (	2		,     5     , '2021-04-18'),
                         (	3		,     6     , '2021-04-19'),
				         (	4		,     1     , '2021-04-20'),
				         (	5		,     3     , '2021-04-30');

DROP TABLE IF EXISTS type_question;
CREATE TABLE IF NOT EXISTS type_question (
	type_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_name	ENUM('Essay','Multiple-Choice') NOT NULL
);
INSERT INTO type_question( type_id , type_name          )
VALUES			         (	1		, 'Essay'           ), 
                         (	2		, 'Multiple-Choice' );
                         
DROP TABLE IF EXISTS category_question;
CREATE TABLE IF NOT EXISTS category_question (
	category_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    category_name	VARCHAR(50) NOT NULL UNIQUE KEY
);  
INSERT INTO category_question( category_id , category_name)
VALUES			             (	   1	   ,    'Java'    ), 
                             (	   2	   ,    '.NET'    ),
                             (	   3	   ,    'SQL'     ),
				             (     4	   ,    'Postman' ),
				             (	   5	   ,    'Ruby'    );

DROP TABLE IF EXISTS question;
CREATE TABLE IF NOT EXISTS question (
	question_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content			NVARCHAR(150) NOT NULL,
    category_id		TINYINT UNSIGNED NOT NULL,
    type_id			TINYINT UNSIGNED NOT NULL,
    creator_id		TINYINT UNSIGNED NOT NULL,
    create_date		DATETIME DEFAULT NOW(),
    FOREIGN KEY(category_id) REFERENCES category_question(category_id),
    FOREIGN KEY(type_id) REFERENCES type_question(type_id)
);
INSERT INTO question( question_id  ,     content       , category_id , type_id,creator_id, create_date )
VALUES			    (	   1	   , N'Câu hỏi Java'   ,     1       ,    1   ,   1      ,'2021-05-12' ), 
				    (	   2	   , N'Câu hỏi .NET'   ,     2       ,    2   ,   2      ,'2021-05-13' ),
					(	   3	   , N'Câu hỏi SQL'    ,     3       ,    2   ,   3      ,'2021-05-14' ),
					(      4	   , N'Câu hỏi Postman',     4       ,    1   ,   4      ,'2021-05-15' ),
					(	   5	   , N'Câu hỏi Ruby'   ,     5       ,    2   ,   5      ,'2021-05-16' ),
                    (      6       , N'Câu hỏi SQL'    ,     3       ,    1   ,   6      ,'2021-05-17' );

DROP TABLE IF EXISTS answer;
CREATE TABLE IF NOT EXISTS answer (
	answer_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content		NVARCHAR(150) NOT NULL,
    question_id	TINYINT UNSIGNED NOT NULL,
    is_correct	BIT DEFAULT 1,
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
INSERT INTO  answer ( answer_id  ,   content    , question_id , is_correct)
VALUES			    (	   1	 , N'Trả lời 1' ,     3       ,    1      ), 
				    (	   2	 , N'Trả lời 2' ,     5       ,    1      ),
					(	   3	 , N'Trả lời 3' ,     1       ,    0      ),
					(      4	 , N'Trả lời 4' ,     3       ,    1      ),
					(	   5	 , N'Trả lời 5' ,     6       ,    0      ),
                    (      6     , N'Trả lời 6' ,     4       ,    1      );
                    
DROP TABLE IF EXISTS exam;
CREATE TABLE IF NOT EXISTS exam (
	exam_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`		CHAR(20) NOT NULL,
    title		NVARCHAR(50) NOT NULL,
    category_id TINYINT UNSIGNED NOT NULL,
    duration	TINYINT UNSIGNED NOT NULL,
    creator_id	TINYINT UNSIGNED NOT NULL,
    create_date DATETIME DEFAULT NOW(),
    FOREIGN KEY(category_id) REFERENCES category_question(category_id)
);
INSERT INTO exam( exam_id  , `code` ,  title , category_id, duration, create_date  )
VALUES		    (	 1	   , 'A_1'  , N'Đề 1',    5       ,    60   , '2021-06-12' ), 
				(	 2	   , 'A_2'  , N'Đề 2',    4       ,    90   , '2021-06-13' ),
				(	 3	   , 'A_3'  , N'Đề 3',    2       ,    120  , '2021-06-14' ),
				(    4	   , 'A_4'  , N'Đề 4',    1       ,    120  , '2021-06-15' ),
				(	 5	   , 'A_5'  , N'Đề 5',    3       ,    30   , '2021-06-16' ),
				(    6     , 'A_6'  , N'Đề 6',    4       ,    90   , '2021-06-17' ),
                (    7     , 'A_7'  , N'Đề 7',    3       ,    45   , '2021-06-17' );

DROP TABLE IF EXISTS exam_question;
CREATE TABLE IF NOT EXISTS exam_question (
	exam_id		TINYINT UNSIGNED NOT NULL,
    question_id TINYINT UNSIGNED NOT NULL,
	FOREIGN KEY(exam_id) REFERENCES exam(exam_id),
    FOREIGN KEY(question_id) REFERENCES question(question_id)
);
INSERT INTO exam_question(exam_id , question_id)
VALUES			         (	 1    ,    1       ), 
                         (	 2	  ,    3       ),
					     (	 3	  ,    6       ),
					     (   4	  ,    4       ),
						 (	 5	  ,    3       ),
						 (	 6	  ,    5       ),
						 (	 7	  ,    4       );