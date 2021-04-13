DROP DATABASE IF EXISTS Testing_system;
CREATE DATABASE Testing_system;
USE Testing_system;

DROP TABLE IF EXISTS department;
CREATE TABLE department (
	department_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	department_name	NVARCHAR(50) NOT NULL UNIQUE KEY
);
INSERT INTO department(department_name )
VALUES				  ('Sale'          ) ,
                      ('Marketing'     ) ,
                      ('Hành chính'    ) ,
					  ('Kế toán'       ) ,
					  ('Phó giám đốc'  ) ,
					  ('Giám đốc'      ) ,
					  ('Thư ký'        ) ,
					  ('Bảo vệ'        ) ,
					  ('Logistics'     ) ,
					  ('Kỹ thuật'      ) ;
                      
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
    position_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    position_name	ENUM('Dev','Test','Scrum Master','PM') NOT NULL UNIQUE KEY
);
INSERT INTO `position`(position_name    )
VALUES				  ('Dev'            ), 
                      ('Test'           ),
                      ('Scrum Master'   ),
					  ('PM'             );

DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
	account_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
	email			VARCHAR(50) NOT NULL UNIQUE KEY,
	username		VARCHAR(50) NOT NULL CHECK (LENGTH(username) >=6),
    full_name		NVARCHAR(50) NOT NULL,
    department_id	TINYINT UNSIGNED NOT NULL,
    position_id		TINYINT UNSIGNED NOT NULL,
    creat_date		DATETIME DEFAULT NOW()
    -- FOREIGN KEY(department_id) REFERENCES department(department_id),
    -- FOREIGN KEY(position_id) REFERENCES `position`(position_id)
);
INSERT INTO `account` (email                  ,  username   ,    full_name        , department_id  ,  position_id  )	   
VALUES				  ('hanh12@gmail.com'     , 'honghanh'  , 'Nguyễn Hồng Hạnh'  ,       5        ,      4        ), 
                      ('hai345@gmail.com'     , 'bluesea345', 'Nguyễn Thanh Hải'  ,       10       ,      3        ),
                      ('binh67@gmail.com'     , 'thanhbinh' , 'Bùi Thanh Bình'    ,       1        ,      1        ),
					  ('hoang14@gmail.com'    , 'minhhoang' , 'Vũ Minh Hoàng'     ,       3        ,      2        ),
					  ('ngan89@gmail.com'     , 'meocon12'  , 'Lưu Thuỳ Ngân'     ,       3        ,      2        ),
					  ('hoanghau01@gmail.com' , 'hoanghau01', 'Hoàng Thị Hậu'     ,       9        ,      1        ),
					  ('thanhcong03@gmail.com', 'thanhcong' , 'Nguyễn Thành Công' ,       3        ,      1        ),
					  ('thuykieu26@gmail.com' , 'thuykieu'  , 'Trần Thuý Kiều'    ,       4        ,      2        ),
					  ('nthuyvan56@gmail.com' , 'thuyvan'   , 'Hoàng Thuỳ Vân'    ,       5        ,      2        ),
					  ('mailan97@gmail.com'   , 'lovelylan' , 'Hoàng Mai Lan'     ,       6        ,      3        );

DROP TABLE IF EXISTS `group`;
CREATE TABLE `group` (
	group_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    group_name	NVARCHAR(50) NOT NULL UNIQUE KEY,
    creator_id	TINYINT UNSIGNED NOT NULL,
    create_date	DATETIME DEFAULT NOW()
);
ALTER TABLE `group`
MODIFY COLUMN create_date DATETIME;

INSERT INTO `group`(group_name,  creator_id )
VALUES			   ('Nhóm 11'  ,      1     );

SELECT  * FROM `group` WHERE create_date IS NULL;

INSERT INTO `group`(group_name,  creator_id, create_date )
VALUES			   ('Nhóm 1'  ,      1     , '2021-04-12'), 
                   ('Nhóm 2'  ,      2     , '2021-04-13'),
                   ('Nhóm 3'  ,      3     , '2021-04-16'),
				   ('Nhóm 4'  ,      4     , '2021-04-19'),
				   ('Nhóm 5'  ,      6     , '2021-04-19'),
				   ('Nhóm 6'  ,      7     , '2021-04-19'),
				   ('Nhóm 7'  ,      8     , '2021-04-19'),
				   ('Nhóm 8'  ,      5     , '2021-04-19'),
				   ('Nhóm 9'  ,      9     , '2021-04-19'),
				   ('Nhóm 10' ,      10    , '2021-04-21');
                   
DROP TABLE IF EXISTS group_account;
CREATE TABLE group_account (
	group_id	TINYINT UNSIGNED NOT NULL,
    account_id	TINYINT UNSIGNED NOT NULL,
    join_date	DATETIME DEFAULT NOW()
    -- FOREIGN KEY(group_id) REFERENCES `group`(group_id),
    -- FOREIGN KEY(account_id) REFERENCES `account`(account_id)
);
INSERT INTO group_account( group_id , account_id,  join_date )
VALUES			         (	3		,     6     , '2021-04-16'), 
                         (	3		,     5     , '2021-04-18'),
                         (	5		,     6     , '2021-04-19'),
				         (	6		,     1     , '2021-04-20'),
				         (	6		,     1     , '2021-04-20'),
				         (	1		,     8     , '2021-04-20'),
				         (	6		,     9     , '2021-04-20'),
				         (	10		,     9     , '2021-04-20'),
				         (	6		,     10    , '2021-04-20'),
				         (	9		,     3     , '2021-04-30');

DROP TABLE IF EXISTS type_question;
CREATE TABLE type_question (
	type_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    type_name	ENUM('Essay','Multiple-Choice') NOT NULL
);
INSERT INTO type_question( type_id , type_name          )
VALUES			         (	1		, 'Essay'           ), 
                         (	2		, 'Multiple-Choice' );
                         
DROP TABLE IF EXISTS category_question;
CREATE TABLE  category_question (
	category_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    category_name	VARCHAR(50) NOT NULL UNIQUE KEY
);  
INSERT INTO category_question(category_name)
VALUES			             (	 'Java'    ), 
                             (	 'ASP.NET' ),
                             (	 'SQL'     ),
                             (	 'ADO.NET' ),
                             (	 'Python'  ),
                             (	 'C++'     ),
				             (   'C Sharp' ),
				             (   'Postman' ),
				             (   'PHP'     ),
				             (	 'Ruby'    );

DROP TABLE IF EXISTS question;
CREATE TABLE question (
	question_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content			NVARCHAR(150) NOT NULL,
    category_id		TINYINT UNSIGNED NOT NULL,
    type_id			TINYINT UNSIGNED NOT NULL,
    creator_id		TINYINT UNSIGNED NOT NULL,
    create_date		DATETIME DEFAULT NOW()
    -- FOREIGN KEY(category_id) REFERENCES category_question(category_id),
    -- FOREIGN KEY(type_id) REFERENCES type_question(type_id)
);
INSERT INTO question( content         , category_id , type_id, creator_id, create_date )
VALUES			    ('Câu hỏi Java'   ,     1       ,    1   ,    1      ,'2021-05-12' ), 
				    ('Câu hỏi ADO.NET',     4       ,    2   ,    2      ,'2021-05-13' ),
					('Câu hỏi PHP'    ,     9       ,    2   ,    10     ,'2021-05-14' ),
					('Câu hỏi Ruby'   ,     10      ,    1   ,    10     ,'2021-05-15' ),
					('Câu hỏi Postman',     8       ,    2   ,    5      ,'2021-05-16' ),
					('Câu hỏi C++'    ,     7       ,    2   ,    5      ,'2021-05-16' ),
					('Câu hỏi C Sharp',     7       ,    2   ,    6      ,'2021-05-16' ),
					('Câu hỏi Python' ,     5       ,    2   ,    5      ,'2021-05-16' ),
					('Câu hỏi ASP.NET',     2       ,    2   ,    7      ,'2021-05-16' ),
                    ('Câu hỏi SQL'    ,     1       ,    1   ,    9      ,'2021-05-17' );

DROP TABLE IF EXISTS answer;
CREATE TABLE answer (
	answer_id	TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    content		NVARCHAR(150) NOT NULL,
    question_id	TINYINT UNSIGNED NOT NULL,
    is_correct	BIT DEFAULT 1
    -- FOREIGN KEY(question_id) REFERENCES question(question_id)
);

INSERT INTO  answer (content     , question_id ) 
VALUES			    ('Trả lời 1' ,     3       ),
				    ('Trả lời 2' ,     5       ),
					('Trả lời 3' ,     1       ),
					('Trả lời 4' ,     3       ),
					('Trả lời 5' ,     6       );
                    
INSERT INTO  answer (content     , question_id , is_correct)
VALUES			    ('Trả lời 6' ,     6       ,    0      ),
					('Trả lời 7' ,     9       ,    0      ),
					('Trả lời 8' ,     6       ,    0      ),
					('Trả lời 9' ,     8       ,    0      ),
                    ('Trả lời 10',     4       ,    0      );
                    
DROP TABLE IF EXISTS exam;
CREATE TABLE exam (
	exam_id		TINYINT UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT,
    `code`		CHAR(20) NOT NULL,
    title		NVARCHAR(50) NOT NULL,
    category_id TINYINT UNSIGNED NOT NULL,
    duration	TINYINT UNSIGNED NOT NULL,
    creator_id	TINYINT UNSIGNED NOT NULL,
    create_date DATETIME DEFAULT NOW()
    -- FOREIGN KEY(category_id) REFERENCES category_question(category_id)
);
INSERT INTO exam(`code` ,  title , category_id, duration, creator_id, create_date  )
VALUES		    ('A_1'  , 'Đề 1' ,    5       ,    60   ,     3     ,'2021-06-12' ), 
				('A_2'  , 'Đề 2 ',    4       ,    90   ,     4     ,'2021-06-13' ),
				('A_3'  , 'Đề 3' ,    7       ,    120  ,     7     ,'2021-06-14' ),
				('A_4'  , 'Đề 4' ,    1       ,    120  ,     7     ,'2021-06-15' ),
				('A_5'  , 'Đề 5' ,    1      ,    30   ,     1     ,'2021-06-16' ),
				('A_6'  , 'Đề 6' ,    4       ,    90   ,     2     ,'2021-06-17' ),
				('A_7'  , 'Đề 7' ,    9       ,    45   ,     9     ,'2021-06-17' ),
				('A_8'  , 'Đề 8' ,    9       ,    90   ,     10    ,'2021-06-17' ),
				('A_9'  , 'Đề 9' ,    8       ,    90   ,     6     ,'2021-06-17' ),
                ('A_10' , 'Đề 10',    3       ,    45   ,     8     ,'2021-06-17' );
                
UPDATE exam SET create_date = '2019-02-12' WHERE (exam_id = '1');

DROP TABLE IF EXISTS exam_question;
CREATE TABLE exam_question (
	exam_id		TINYINT UNSIGNED NOT NULL,
    question_id TINYINT UNSIGNED NOT NULL
	-- FOREIGN KEY(exam_id) REFERENCES exam(exam_id),
    -- FOREIGN KEY(question_id) REFERENCES question(question_id)
);
INSERT INTO exam_question(exam_id , question_id)
VALUES			         (	 1    ,    1       ), 
                         (	 2	  ,    3       ),
					     (	 3	  ,    6       ),
					     (   4	  ,    10      ),
						 (	 5	  ,    3       ),
						 (	 6	  ,    5       ),
						 (	 7	  ,    5       ),
						 (	 8	  ,    9       ),
						 (	 9	  ,    2       ),
						 (	 10	  ,    5       );


-- Question 1: Tạo view có chứa danh sách nhân viên thuộc phòng ban sale
-- Dùng VIEW
CREATE OR REPLACE VIEW View_Account_Department AS
	SELECT *
	FROM `account` a
	JOIN department d 
	ON a.department_id = d.department_id
	WHERE d.department_name = 'Sale';
SELECT *
FROM View_Account_Department;

-- Dùng CTE
WITH CTE_Account_Department AS (
	SELECT *
	FROM `account` a
	JOIN department d 
	ON a.department_id = d.department_id
	WHERE d.department_name = 'Sale')
SELECT *
FROM CTE_Account_Department;

-- Question 2: Tạo view có chứa thông tin các account tham gia vào nhiều group nhất
-- Dùng VIEW
CREATE OR REPLACE VIEW number_of_groups AS
	SELECT COUNT(g.group_id) AS số_nhóm
	FROM `account` a
	JOIN group_account g 
	USING (account_id)
	GROUP BY a.account_id;

CREATE OR REPLACE VIEW account_tham_gia_nhieu_group_nhat AS
	SELECT a.account_id, a.full_name, COUNT(g.group_id) AS số_group
	FROM `account` a
	JOIN group_account g 
	USING (account_id)
	GROUP BY a.account_id
	HAVING COUNT(g.group_id) = (SELECT MAX(số_nhóm) FROM number_of_groups);
    
SELECT * FROM account_tham_gia_nhieu_group_nhat;

-- Dùng CTE
WITH 
number_of_groups AS (
	SELECT COUNT(g.group_id) AS số_nhóm
	FROM `account` a
	JOIN group_account g 
	USING (account_id)
	GROUP BY a.account_id) ,
account_tham_gia_nhieu_group_nhat AS (
	SELECT a.account_id, a.full_name, COUNT(g.group_id) AS số_group
	FROM `account` a
	JOIN group_account g 
	USING (account_id)
	GROUP BY a.account_id
	HAVING COUNT(g.group_id) = (SELECT MAX(số_nhóm) FROM number_of_groups) )
SELECT * FROM account_tham_gia_nhieu_group_nhat;

-- Question 3: Tạo view có chứa câu hỏi có những content quá dài (content quá 300 từ được coi là quá dài) và xóa nó đi
WITH câu_hỏi_content_dài AS (
	SELECT question_id, content
	FROM question
	WHERE CHAR_LENGTH(content) > 300)
DELETE FROM câu_hỏi_content_dài;
    
-- Question 4: Tạo view có chứa danh sách các phòng ban có nhiều nhân viên nhất
WITH
number_of_accounts AS (
	SELECT COUNT(a.account_id) AS number_of_accounts
	FROM department d
	JOIN `account` a
	USING (department_id)
	GROUP BY d.department_id) ,

Phòng_ban_nhiều_accounts_nhất AS (
	SELECT d.department_id, d.department_name, COUNT(a.account_id) AS số_nhân_viên
	FROM department d
	JOIN `account` a
	USING (department_id)
	GROUP BY d.department_id
    HAVING COUNT(a.account_id) = (SELECT MAX(number_of_accounts) FROM number_of_accounts) )

SELECT * FROM Phòng_ban_nhiều_accounts_nhất;

-- Question 5: Tạo view có chứa tất các các câu hỏi do user họ Nguyễn tạo
CREATE OR REPLACE VIEW question_do_user_họ_Nguyễn_tạo AS
	SELECT q.question_id, q.content, a.account_id, a.full_name
	FROM question q
	JOIN `account` a
	ON q.creator_id = a.account_id
	WHERE a.full_name LIKE 'Nguyễn%';

SELECT * FROM question_do_user_họ_Nguyễn_tạo;