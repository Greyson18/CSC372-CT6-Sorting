import java.util.Comparator;

public class RollnoComparer implements Comparator<Student> {
    @Override
    
    //Defines a comparator to sort students by Roll Number
    public int compare(Student s1, Student s2) {
        return s1.getRollno() - s2.getRollno();
    }
}