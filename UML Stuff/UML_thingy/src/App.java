import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<StudentDetails> class1 = new ArrayList<StudentDetails>();
        class1.add(new StudentDetails("Arun", 12323, "CSE", "3rd", 10, false, true, 1000));
        class1.add(new StudentDetails("Suresh", 12324, "CSE", "3rd", 10, false, true, 1000));
        class1.sort((s1, s2) -> s1.admno - s2.admno);
        
    }
}
