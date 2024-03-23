import java.util.Comparator;

public class AddressComparer implements Comparator<Student> {
    @Override
    
    //Defines a comparator to sort students by address
    public int compare(Student s1, Student s2) {
        return s1.getAddress().compareTo(s2.getAddress());
    }
}