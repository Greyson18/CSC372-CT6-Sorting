import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//Defines the custom selected sort method
public class SelectionSort {
    public static void selectionSort(ArrayList<Student> students, Comparator<Student> comparator) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(students.get(j), students.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            Collections.swap(students, i, minIndex);
        }
    }
}