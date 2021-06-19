package entity;

public class Position {
	private int 	id;
	private String	name;
	
	
	public Position(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Position() {
		System.out.println("Input position ID: ");
		id = ScannerUtils.inputInt("Please input a number is int: ");
		System.out.println("Input position name: ");
		name = ScannerUtils.inputString();
	}
	
	public int getId() {
		return id;
	}
	public void setId(byte id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	
}
