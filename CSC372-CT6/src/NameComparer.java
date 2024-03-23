import java.util.Comparator;

public class NameComparer implements Comparator<Student> {
    @Override
    
    //Defines a comparator to sort students by name
    public int compare(Student s1, Student s2) {
        return s1.getName().compareTo(s2.getName());
    }
}