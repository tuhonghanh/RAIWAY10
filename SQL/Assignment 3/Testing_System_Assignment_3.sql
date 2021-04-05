-- Q1 Thêm ít nhất 10 record vào mỗi table

-- DROP DATABASE IF EXISTS Testing_system_assignment_1;
-- CREATE DATABASE Testing_system_assignment_1;
USE Testing_system_assignment_1;

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
					  ('ngan89@gmail.com'     , 'meocon12'  , 'Lưu Thuỳ Ngân'     ,       2        ,      2        ),
					  ('hoanghau01@gmail.com' , 'hoanghau01', 'Hoàng Thị Hậu'     ,       9        ,      1        ),
					  ('thanhcong03@gmail.com', 'thanhcong' , 'Nguyễn Thành Công' ,       8        ,      1        ),
					  ('thuykieu26@gmail.com' , 'thuykieu'  , 'Trần Thuý Kiều'    ,       4        ,      2        ),
					  ('nthuyvan56@gmail.com' , 'thuyvan'   , 'Hoàng Thuỳ Vân'    ,       7        ,      2        ),
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
					('Câu hỏi C++'    ,     6       ,    2   ,    5      ,'2021-05-16' ),
					('Câu hỏi C Sharp',     7       ,    2   ,    6      ,'2021-05-16' ),
					('Câu hỏi Python' ,     5       ,    2   ,    5      ,'2021-05-16' ),
					('Câu hỏi ASP.NET',     2       ,    2   ,    7      ,'2021-05-16' ),
                    ('Câu hỏi SQL'    ,     3       ,    1   ,    9      ,'2021-05-17' );

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
				('A_5'  , 'Đề 5' ,    10      ,    30   ,     1     ,'2021-06-16' ),
				('A_6'  , 'Đề 6' ,    4       ,    90   ,     2     ,'2021-06-17' ),
				('A_7'  , 'Đề 7' ,    9       ,    45   ,     9     ,'2021-06-17' ),
				('A_8'  , 'Đề 8' ,    4       ,    90   ,     10    ,'2021-06-17' ),
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

-- Q2 lấy ra tất cả các phòng ban
SELECT * FROM department;

-- Q3 lấy ra id của phòng ban "Sale"
SELECT department_id FROM department WHERE department_name='Sale';

-- Q4 lấy ra thông tin account có full name dài nhất
SELECT * FROM `account` WHERE CHAR_LENGTH(full_name) = (SELECT MAX(CHAR_LENGTH(full_name)) FROM `account`) ORDER BY full_name DESC;

-- Q5 Lấy ra thông tin account có full name dài nhất và thuộc phòng ban có id=3
SELECT * FROM `account` WHERE CHAR_LENGTH(full_name) = (SELECT MAX(CHAR_LENGTH(full_name)) FROM `account`) AND department_id=3 ORDER BY full_name DESC;

-- Q6 Lấy ra tên group đã tham gia trước ngày 20/12/2019
SELECT group_name FROM `group` WHERE create_date < '2019-12-20';

-- Q7 Lấy ra ID của question có >= 4 câu trả lời
SELECT question_id FROM answer GROUP BY question_id HAVING COUNT(question_id) >= 4;

-- Q8 Lấy ra các mã đề thi có thời gian thi >= 60 phút và được tạo trước ngày 20/12/2019
SELECT `code` FROM exam WHERE duration >= 60 AND create_date < '2019-12-20';

-- Q9 Lấy ra 5 group được tạo gần đây nhất
SELECT * FROM `group` ORDER BY create_date LIMIT 5;

-- Q10 Đếm số nhân viên thuộc department có id = 2
SELECT COUNT(*) FROM `account` WHERE department_id=2;

-- Q11 Lấy ra nhân viên có tên bắt đầu bằng chữ "D" và kết thúc bằng chữ "o"
SELECT * FROM `account` WHERE full_name LIKE 'D%o';

-- Q12 Xóa tất cả các exam được tạo trước ngày 20/12/2019
DELETE FROM exam WHERE create_date < '2019-12-20';

-- Q13 Xóa tất cả các question có nội dung bắt đầu bằng từ "câu hỏi"
DELETE FROM question WHERE content LIKE 'câu hỏi%';

-- Q14 Update thông tin của account có id = 5 thành tên "Nguyễn Bá Lộc" và email thành loc.nguyenba@vti.com.vn
UPDATE `account` SET full_name='Nguyễn Bá Lộc', email='loc.nguyenba@vti.com.vn' WHERE account_id=5;

-- Q15 update account có id = 5 sẽ thuộc group có id = 4
UPDATE group_account SET account_id=5 WHERE group_id=4;

