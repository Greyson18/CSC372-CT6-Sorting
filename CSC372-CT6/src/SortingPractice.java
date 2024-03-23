import java.util.List;
import java.util.ArrayList;
import java.util.Collections;


public class SortingPractice {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		//List of students to add to the array to be compared and sorted
		students.add(new Student(458, "Amy", "Celadon City"));
		students.add(new Student(659, "Tai", "Blackthorn City"));
		students.add(new Student(165, "Karina", "Cerulean City"));
		students.add(new Student(305, "Jason", "Violet City"));
		students.add(new Student(945, "Matt", "Goldenrod City"));
		students.add(new Student(658, "Timmy", "Driftveil City"));
		students.add(new Student(487, "Peter", "Eterna City"));
		students.add(new Student(298, "Miles", "Fuchsia City"));
		students.add(new Student(741, "Danny", "Nimbasa City"));
		students.add(new Student(591, "Jayden", "Saffron City"));
		
        // Sort by name using NameComparer
        Collections.sort(students, new NameComparer());
        
        System.out.println("Students sorted by Name:");

        // Print the sorted list by name
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", Roll Number: " + student.getRollno() + ", Address: " + student.getAddress());
        }

        // Sort by roll number using RollnoComparer
        Collections.sort(students, new RollnoComparer());
        
        System.out.println("\r\n");  //Puts a blank space between different sort sets
        
        System.out.println("Students sorted by Roll Number:");

        // Print the sorted list by roll number
        for (Student student : students) {
            System.out.println("Roll Number: " + student.getRollno() + ", Name: " + student.getName() + ", Address: " + student.getAddress());
        }
        
        //Sort by roll number using AddressComparer
        Collections.sort(students, new AddressComparer());
        
        System.out.println("\r\n");
        
        System.out.println("Students sorted by Address:");
        
        for (Student student : students) {
        	System.out.println(", Address: " + student.getAddress() + ", Name: " + student.getName() + ", Roll Number: " + student.getRollno());
        }
        
        
    }
		

}
