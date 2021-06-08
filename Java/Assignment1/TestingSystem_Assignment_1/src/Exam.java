import java.util.Date;

public class Exam {
	byte				id;
	String				code;
	String				title;
	CategoryQuestion	category;
	short				duration;
	Account				creator;
	Date				createDate;
	Question[]			questions;		
}
