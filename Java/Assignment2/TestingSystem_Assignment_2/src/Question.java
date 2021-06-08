import java.util.Date;

public class Question {
	byte 				id;
	String	 			content;
	CategoryQuestion 	category;
	TypeQuestion 		type;
	byte 				creatorID;
	Date 				createDate;
	Exam[]				exams;
}
