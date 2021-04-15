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

-- Question 1: Tạo store để người dùng nhập vào tên phòng ban và in ra tất cả các account thuộc phòng ban đó
DROP PROCEDURE IF EXISTS get_account_by_department_name;
DELIMITER $$
CREATE PROCEDURE get_account_by_department_name (IN in_department_name VARCHAR(50))
	BEGIN
		SELECT a.account_id, a.full_name, d.department_name
		FROM `account` a
		JOIN department d
		USING (department_id) WHERE d.department_name = in_department_name;
	END$$
DELIMITER ;

CALL get_account_by_department_name ('Sale');

-- Question 2: Tạo store để in ra số lượng account trong mỗi group
DROP PROCEDURE IF EXISTS accounts_of_each_group;
DELIMITER $$
CREATE PROCEDURE accounts_of_each_group (IN in_group_id INT)
BEGIN
	SELECT group_id, COUNT(account_id) AS số_lượng_account
	FROM group_account
    WHERE group_id = in_group_id 
	GROUP BY group_id;
END $$
DELIMITER ;

CALL accounts_of_each_group (3);

-- Question 3: Tạo store để thống kê mỗi type question có bao nhiêu question được tạo trong tháng hiện tại
DROP PROCEDURE IF EXISTS question_of_month;
DELIMITER $$
CREATE PROCEDURE question_of_month ()
BEGIN
	SELECT t.type_id, t.type_name, q.content, q.create_date, (q.question_id) AS số_question
	FROM type_question t
	JOIN question q
	ON t.type_id = q.type_id
	WHERE MONTH(q.create_date) = MONTH(NOW()) AND YEAR(q.create_date) = YEAR(NOW())
	GROUP BY t.type_id;
END $$
DELIMITER ;

CALL question_of_month ();

-- Question 4: Tạo store để trả ra id của type question có nhiều câu hỏi nhất
DROP PROCEDURE IF EXISTS typeID_maximum_question;
DELIMITER $$
CREATE PROCEDURE typeID_maximum_question ()
BEGIN
	WITH
	number_of_questions AS (
		SELECT COUNT(q.question_id) AS number_of_questions
		FROM type_question t
		JOIN question q
		USING (type_id)
		GROUP BY t.type_id)
	
		SELECT t.type_id 
		FROM type_question t
		JOIN question q
		USING (type_id)
		GROUP BY t.type_id
		HAVING COUNT(q.question_id) = (SELECT MAX(number_of_questions) FROM number_of_questions);
END $$
DELIMITER ;

CALL typeID_maximum_question ();

-- Question 5: Sử dụng store ở question 4 để tìm ra tên của type question
DROP PROCEDURE IF EXISTS type_name_maximum_question;
DELIMITER $$
CREATE PROCEDURE type_name_maximum_question ()
BEGIN
	WITH
	number_of_questions AS (
		SELECT COUNT(q.question_id) AS number_of_questions
		FROM type_question t
		JOIN question q
		USING (type_id)
		GROUP BY t.type_id)
	
		SELECT t.type_name 
		FROM type_question t
		JOIN question q
		USING (type_id)
		GROUP BY t.type_id
		HAVING COUNT(q.question_id) = (SELECT MAX(number_of_questions) FROM number_of_questions);
END $$
DELIMITER ;

CALL type_name_maximum_question ();

-- Question 6: Viết 1 store cho phép người dùng nhập vào 1 chuỗi và trả về
-- group có tên chứa chuỗi của người dùng nhập vào hoặc trả về user có username 
-- chứa chuỗi của người dùng nhập vào

DROP PROCEDURE IF EXISTS GroupName_UserName;
DELIMITER $$
CREATE PROCEDURE GroupName_UserName (IN	in_stringInput VARCHAR(50), IN in_select TINYINT)
BEGIN
	IF in_select = 1 THEN
		SELECT 	*
        FROM	`group`
        WHERE	group_name LIKE in_stringInput;
	ELSE
		SELECT 	username, full_name
        FROM	`account`
        WHERE	username LIKE in_stringInput;
	END IF;
END$$
DELIMITER ;

CALL GroupName_UserName ('honghanh', 0);


-- Question 7: Viết 1 store cho phép người dùng nhập vào thông tin fullName, email và trong store sẽ tự động gán:
-- username sẽ giống email nhưng bỏ phần @..mail đi
-- positionID: sẽ có default là developer
-- departmentID: sẽ được cho vào 1 phòng chờ
-- Sau đó in ra kết quả tạo thành công 
DROP PROCEDURE IF EXISTS ImportInfo_Of_Account;
DELIMITER $$
CREATE PROCEDURE importInfo_Of_Account(	IN in_email VARCHAR(50), IN in_full_name VARCHAR(50))						
BEGIN
	DECLARE v_username VARCHAR(50) DEFAULT SUBSTRING_INDEX(in_email,'@',1);
    DECLARE v_department_id TINYINT UNSIGNED DEFAULT 11;
    DECLARE v_position_id TINYINT UNSIGNED DEFAULT 1;
	
	INSERT INTO `account` 	(email		,username  , full_name	 , department_id  , position_id)
    VALUE					(in_email	,v_username, in_full_name, v_department_id, v_position_id);
	
    SELECT 	*
    FROM 	`account`
    WHERE	username = v_username ;
END$$
DELIMITER ;

CALL importInfo_Of_Account ('thanhtung12@gmail.com', 'Trần Thanh Tùng');

-- Question 8: Viết 1 store cho phép người dùng nhập vào Essay hoặc Multiple-Choice 
-- để thống kê câu hỏi essay hoặc multiple-choice nào có content dài nhất
DROP PROCEDURE IF EXISTS get_maximum_content;
DELIMITER $$
CREATE PROCEDURE get_maximum_content(IN in_type_name ENUM('Essay','Multiple-Choice'))
BEGIN
	IF (in_type_name = 'Essay') THEN
		SELECT	content, MAX(CHAR_LENGTH(content))
		FROM	question
		WHERE	type_id = 1;
	ELSEIF (in_type_name = 'Multiple-Choice') THEN
		SELECT	content, MAX(CHAR_LENGTH(content))
		FROM	question
		WHERE	type_id = 1;
	END IF;
END $$
DELIMITER ;

CALL get_maximum_content ('Essay');

-- Question 9: Viết 1 store cho phép người dùng xóa exam dựa vào ID
DROP PROCEDURE IF EXISTS delete_exam_by_id;
DELIMITER $$
CREATE PROCEDURE delete_exam_by_id (IN in_exam_id TINYINT UNSIGNED)
BEGIN
	DELETE 	
    FROM 	exam 
    WHERE	exam_id = in_exam_id;	
END$$
DELIMITER ;

CALL  delete_exam_by_id (1);

-- Question 10: Tìm ra các exam được tạo từ 3 năm trước và xóa các exam đó đi (sử
-- dụng store ở câu 9 để xóa) Sau đó in số lượng record đã remove từ các table liên quan
-- trong khi removing
DROP PROCEDURE IF EXISTS delete_exam_3years_ago;
DELIMITER $$
CREATE PROCEDURE delete_exam_3years_ago()
BEGIN
	WITH exam_id_3years_ago AS(
		SELECT 	exam_id
		FROM 	exam
		WHERE	(YEAR(NOW()) - YEAR(create_date)) > 3)
	DELETE
    FROM 	exam
    WHERE 	exam_id IN (SELECT * FROM exam_id_3years_ago);
END$$
DELIMITER ;

CALL delete_exam_3years_ago()

-- Question 11: Viết store cho phép người dùng xóa phòng ban bằng cách người dùng
-- nhập vào tên phòng ban và các account thuộc phòng ban đó sẽ được chuyển về phòng ban default là phòng ban chờ việc
DROP PROCEDURE IF EXISTS sp_DeleteDepartment;
DELIMITER $$
CREATE PROCEDURE delete_department (IN in_department_name VARCHAR(50))
BEGIN
	UPDATE 	`account`
    SET		department_id = 11
    WHERE	department_id = (SELECT department_id	
							 FROM	department
							 WHERE 	department_name = in_department_name);
	DELETE 
    FROM	department
    WHERE	department_name = in_department_name;
END$$
DELIMITER ;

-- Question 12: Viết store để in ra mỗi tháng có bao nhiêu câu hỏi được tạo trong năm nay
