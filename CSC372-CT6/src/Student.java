public class Student {
	private int rollno;
	private String name;
	private String address;
	
	//Initialize the variables
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;	
	}

	//Create getters for the variables
	public int getRollno() {
		return rollno;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
}
