import java.util.Date;

public class Exam {
	short				id;
	String				code;
	String				title;
	CategoryQuestion 	category;
	short 				duration;
	byte 				creatorID;
	Date 				createDate;
	Question[] 			questions;
}
